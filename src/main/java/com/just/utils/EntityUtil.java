package com.just.utils;

import javax.persistence.Column;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

/**
 * @author wq
 */
public class EntityUtil {


    public static Date stringToDate(String date) {
        Date d = null;
        try {
            d = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d;
    }

    private static int getStrLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length += String.valueOf(c).getBytes().length;
        }
        return length;
    }

    private static Class getClass(Class c) {
        String str = "class java.lang.Object";
        if (c.toString().indexOf("entity") == -1)
            return c;
        if (c.getSuperclass().toString().equals(str))
            return c;
        else
            return c.getSuperclass();
    }

    public static int[] getFiledLength2(Class c, String fieldName) {// BUG5366sdjen20121229
        c = getClass(c);
        int[] value = new int[2];
        try {
            fieldName = fieldName.substring(0, 1).toUpperCase()
                    + fieldName.substring(1).toLowerCase();
            Method method = c.getDeclaredMethod("get" + fieldName);
            Column column = method.getAnnotation(Column.class);
            Annotation[] annotation = method.getDeclaredAnnotations();
            if (method.getReturnType() == BigDecimal.class) {
                value[0] = column.precision() /* + column.scale() + 1 */;
                value[1] = column.scale();
            } else if (method.getReturnType() == Date.class) {
                value[0] = 10; // 日期类型默认返回10位
            } else if (annotation[0].toString().indexOf("Lob()") != -1) {// 大文本类型返回-1,
                // modify
                // by
                // nestor
                value[0] = -1;
            } else
                value[0] = column.length();
        } catch (Exception e) {
            e.printStackTrace();
            value[0] = -1;
        } finally {
            return value;
        }
    }

    public static String cutOffStr(String str, Class c, String name) {
        int length = 0;
        int len = 0;// 每次增加后得到字符串的长度
        StringBuffer sb = new StringBuffer("");
        length = getFiledLength2(c, name)[0];
        if (str == null) {
            str = "";
        }
        str = str.trim();         //现在默认都会去掉空格
        if (length != -1 && str != null && getStrLength(str) > length) {
            for (char chr : str.toCharArray()) {
                len += String.valueOf(chr).getBytes().length;
                if (len <= length) {
                    sb.append(chr);
                }
            }
            // str = str.substring(0, length);
            return sb.toString();
        } else
            return str;
    }

    public static String removeTrim(String str) {
        return str.trim().isEmpty() ? str.trim() : str;
    }

    public static BigDecimal cutOffDecimal(Object objValue, Class<?> c, String name) {
        BigDecimal value = BigDecimal.ZERO;
        if (objValue != null && !objValue.toString().trim().isEmpty())
            try {
                value = (objValue instanceof BigDecimal) ? (BigDecimal) objValue : new BigDecimal(objValue.toString()
                        .trim());
            } catch (Exception e) {
            }
        int[] lengthV = getFiledLength2(c, name);
        int length = lengthV[0];
        int scale = lengthV[1];
        value = value.setScale(scale, RoundingMode.HALF_UP);
        if (0 == value.compareTo(BigDecimal.ZERO))
            return value;
        length = length - scale;
        String v = value.toString();
        int index = v.indexOf(".");
        int len = 0;// Value的precision
        BigDecimal newValue;
//		if(scale==0&&index!=-1) {//如果实体设置没有小数点，去掉传入的小数位
//			v = v.substring(0, index);
//			index = -1;
//		}
        if (index != -1) {// 有小数点的情况
            len = v.substring(0, index).length();
            if (len > length) {
                String preValue = v.substring(0, index);
                String scaleValue = v.substring(index);
                newValue = new BigDecimal(preValue.substring(0, length) + scaleValue);
            } else
                newValue = value;
        } else {
            len = v.length();
            if (len > length)
                newValue = new BigDecimal(v.substring(0, length));
            else
                newValue = new BigDecimal(v);
        }
        return newValue;
    }

    public static <CloneObj> CloneObj cloneEntity(CloneObj src, boolean... copyAll) {
        CloneObj result = null;
        try {
            Class c = getClass(src.getClass());
            Class orgc = src.getClass();
            boolean copysqlid = copyAll != null && copyAll.length > 0 && copyAll[0] != false;
            // getClass(Class.forName(c.getName()))
            result = (CloneObj) Class.forName(orgc.getName()).newInstance();
            Field[] fields = c.getDeclaredFields();
            Field.setAccessible(fields, true);
            for (Field field : fields) {
                if (field.getName().equals("serialVersionUID")) {
                    continue;
                }
                if (copysqlid) {
                    field.set(result, field.get(src));
                } else {
                    if (!field.getName().toLowerCase().contains("sqlid"))
                        field.set(result, field.get(src));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return result;
    }

    /**
     * 将from对象的属性复制到to对象,  字段相同的话
     *
     * @param fromSrc
     * @param toSrc
     * @param <FROM>
     * @param <TO>
     * @return
     */
    public static <FROM, TO> FROM appleyChange2Entity(FROM fromSrc, TO toSrc) {
        try {
            Class c = getClass(fromSrc.getClass());
            // getClass(Class.forName(c.getName()))
            Field[] fields = c.getDeclaredFields();
            Field.setAccessible(fields, true);
            HashSet<String> tofileslset = new HashSet<String>();
            Class t = getClass(toSrc.getClass());
            Field[] tofields = c.getDeclaredFields();
            for (Field tofield : tofields) {
                tofileslset.add(tofield.getName());
            }
            for (Field field : fields) {
                if (field.getName().equals("serialVersionUID") || !tofileslset.contains(field.getName())) {//如果目标属性没有这个字段
                    continue;
                }
                if (!field.getName().toLowerCase().contains("sqlid")) {
                    field.set(toSrc, field.get(fromSrc));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return fromSrc;
    }


}
