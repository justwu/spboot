package com.just.utils;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalculateDate implements Serializable {
    //	private static final long serialVersionUID = 9096315706295507818L;
//	public static final String NULLDATE_STRING = "1900-01-01";
//	public static final Date MAXDATE = new CalculateDate().stringToDate("3000-12-31");
//	public static final int minTime = 100;
//	public static Date lastSearchServerDate;
//	public static CalculateDate calculateDate;
//	public static Date lastServerDate;
//	public static Date lastSearchHotelDate;
//	public static Map<String, Date> lastHotelDate;
//	public static String dateFormatType = "yyyy-MM-dd";// TODO
//	private static SimpleDateFormat sdf = new SimpleDateFormat("dd HH:mm:ss yyyy");
//	private SimpleDateFormat systemDateFormat;
    private static SimpleDateFormat spd = new SimpleDateFormat("yyyy-MM-dd");
    public static SimpleDateFormat mdspd = new SimpleDateFormat("MM/dd");
    public static SimpleDateFormat keyspd = new SimpleDateFormat("yyyyMMdd");
    public static SimpleDateFormat millspd = new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss:SSS");
    public static SimpleDateFormat spd_time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //	public static SimpleDateFormat spd_time_noss = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    public static SimpleDateFormat spt = new SimpleDateFormat("HH:mm");
    private static GregorianCalendar calendar = new GregorianCalendar();
    //	public static SimpleDateFormat sdfsss=new SimpleDateFormat("HH:mm:ss:SSS");
//	public static GtagRemote gtagRemote(){return ((GlobalStatus.ict==null)?null:(GtagRemote)GlobalStatus.getServerRemote("Gtag"));}//BUG 5407(Darke 2013-01-04)
//	public static Date HotelDate;
    public static final Date NULLDATE = stringToDate("1900-01-01");//要先初始化simpleDateFormat
//	/**
//	 *日期Date类型转换为String类型。 这里的格式固定是yyyy-MM-dd
//	 * @steven
//	 * @param date
//	 * @return
//	 */
//	public static String sqlformat(Date date) {
//		if (null == date) {
//			date = NULLDATE;
//		}
//		return new SimpleDateFormat("yyyy-MM-dd").format(date);
//	}

    /**
     * STRING TO DATE如有异常则调用此方法
     */
    public static Date stringToDate(String date) { // 因为数据库里取出来的字符串有可能是3种位数。特殊处理
        if (date == null || date.isEmpty())
            return NULLDATE;
        date = date.replaceAll("\\d{2}:\\d{2}:\\d{2}.\\d{1,3}", "").trim(); // 数据库中读出的数据传到客户端带时分秒
        Date d = null;
        try {
            d = spd.parse(date);
        } catch (ParseException e) {
            try {
                d = spd.parse(date.replaceAll("[a-zA-Z]", ""));
            } catch (ParseException evc) {
                throw new RuntimeException(evc);
            }
        }
        return d;
    }
//	/**
//	 * 两个时间相减(只限当天的时间有效)
//	 * 
//	 * @author nestor
//	 * 
//	 * @2011-5-25 上午10:19:00
//	 * 
//	 * @param timea
//	 * @param timeb
//	 * @return
//	 */
//	public String timeLess(String timea, String timeb) {
//		Date date = null;
//		try {
//			if (timea.isEmpty() || timeb.isEmpty())
//				return "00:00";
//			Date datea = spt.parse(timea);
//			Date dateb = spt.parse(timeb);
//			//默认为08：00：00，+16小时后会成为00：00：00edit-by-kavy-20110915
//			Long times=dateb.getTime() - datea.getTime()+16*3600*1000;
//			date = new Date(times);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		return timeToString(date, true);
//	}
//	public static boolean isDefault(String date) { // 判断传进的日期格式是否属于写死的yyyy-MM-dd
//		return Pattern.matches("[0-9]{4}\\-(0[1-9]|1[0-2])\\-[0-9]{2}", date);
//	}
//	public static Date stringToDateExp(String date, Gfirm gfirm) {
//		Date d = null;
//		try {
//			d = new SimpleDateFormat(changeFormat(gfirm.getLgshort_p(), 0)).parse(date);
//		} catch (ParseException e) {
//			try {
//				d = sdf.parse(date.replaceAll("[a-zA-Z]", ""));
//			} catch (ParseException evc) {
//				throw new RuntimeException(evc);
//			}
//		}
//		return d;
//	}
//	/**
//	 * 长日期格式转换
//	 * 
//	 * @nestor
//	 * 
//	 * @2009-5-5 下午04:18:16
//	 * 
//	 * @param date
//	 * @return
//	 */
//	public static String dateLongFormat(Date date) {
//		Gfirm gfirm = GlobalStatus.getSystemStructure(GlobalStatus.userStructure.getHotelID()).getGfirm();
//		SimpleDateFormat spd = new SimpleDateFormat(changeFormat(gfirm.getLglong_p(), 1));
//		return spd.format(date);
//	}
//	/**
//	 * 
//	 * @JAY
//	 * 
//	 * @2010-2-10 下午01:18:16
//	 * 
//	 * @param date
//	 * @param gfirm
//	 * @return
//	 */
//	public static String dateLongFormat(Date date, Gfirm gfirm) {
//		// Gfirm gfirm =
//		// GlobalStatus.getSystemStructure(GlobalStatus.userStructure.getHotelID()).getGfirm();
//		SimpleDateFormat spd = new SimpleDateFormat(changeFormat(gfirm.getLglong_p(), 1));
//		return spd.format(date);
//	}
//	/**
//	 * 短日期格式转换 客户端调用用此方法
//	 * 
//	 * @nestor
//	 * 
//	 * @2009-5-5 下午04:18:14
//	 * 
//	 * @param date
//	 * @return
//	 */
//	public static String dateShortFormat(Date date) {
//		Gfirm gfirm = GlobalStatus.getSystemStructure(GlobalStatus.userStructure.getHotelID()).getGfirm();
//		SimpleDateFormat spd = new SimpleDateFormat(changeFormat(gfirm.getLgshort_p(), 0));
//		return spd.format(date);
//	}
//	/**
//	 * 短日期格式转换(这个可以服务端调用)
//	 * 
//	 * @nestor
//	 * 
//	 * @2009-5-5 下午04:18:14
//	 * 
//	 * @param date
//	 * @param gfirm
//	 * @return
//	 */
//	public static String dateShortFormat2(Date date, Gfirm gfirm) {
//		SimpleDateFormat spd = new SimpleDateFormat(changeFormat(gfirm.getLgshort_p(), 0));
//		return spd.format(date);
//	}
//	/**
//	 * 转换日期格式(区分大小写)
//	 * 
//	 * @nestor
//	 * 
//	 * @2009-5-5 下午04:46:37
//	 * 
//	 * @param format
//	 * @param type
//	 * @return
//	 */
//	public static String changeFormat(String format, int type) { // 0为短日期格式，1为长日期格式
//		switch (type) {
//			case 0 : {
//				format = format.replace("m", "M");
//				break;
//			}
//			case 1 : {
//				format = format.replace("m", "M").replace("e", "E");
//				break;
//			}
//		}
//		return format;
//	}
//	/**
//	 * 注意格式 这里现在读取的是 将日期转成字符串
//	 * 
//	 * @param Date
//	 *            date
//	 * 
//	 * @return string
//	 * 
//	 */
//	public static String dateToString(Date date) {
//		if (null == date)
//			date = NULLDATE;
//		return dateTostringView(date);//cwq 20110914后台的格式
//		//return new SimpleDateFormat("yyyy-MM-dd").format(date);
//	}
//	/**
//	 * 根据后台设置短日期格式返回对应的日期串，一般是界面显示调用，勿调用该方法传值给服务器运算
//	 * 
//	 * @nestor
//	 * 
//	 * @2010-12-13 下午02:46:37
//	 * 
//	 * @param format
//	 * @param type
//	 * @return
//	 */
//	public static String dateTostringView(Date date) {// 
//		if (null == date)
//			date = NULLDATE;
//		return new SimpleDateFormat(dateFormatType).format(date);
//	}

    /**
     * 注意格式yyyy-MM-dd
     *
     * @param date
     * @param showEmptyDate false时showEmptyDate会显示为空
     * @return
     */
    public static String dateToString(Date date, boolean showEmptyDate, SimpleDateFormat... dateFormat) {
        if (showEmptyDate || !emptyDate(date)) {
            if (dateFormat != null && dateFormat.length > 0)
                return dateFormat[0].format(date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 0);
            return spd.format(cal.getTime());
        } else {
            return "";
        }
    }

    public static String dateToString(Date date) {
        return dateToString(date, true);
    }

    //	/**
//	 * 返回"yyyyMMdd"的字符串格式
//	 * 
//	 * @JAY
//	 * 
//	 * @2009-5-19 下午01:25:43
//	 * 
//	 * @param date
//	 * @return
//	 */
//	public String dateToStr(Date date) {
//		simpdate.applyPattern("yyyyMMdd");
//		return simpdate.format(date);
//	}
//	/**
//	 * 注意是yyyyMMdd格式
//	 */
//	public Date strToDate(String date) {
//		Date returndate = null;
//		try {
//			returndate = simpdate.parse(date);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		return returndate;
//	}
//	/**
//	 * 注意格式yyyy-MM-dd 将字符串转成日期
//	 * 
//	 * @param String
//	 *            day
//	 * 
//	 * @return boolean
//	 * 
//	 */
//	public static Date stringToDate(String date) {
//		return stringToDateExp(date);
//	}
//	public static Date stringToDate(String date, Gfirm gfirm) {
//		return stringToDateExp(date, gfirm);
//	}
//	/**
//	 * 此方法与stringToDate(String date)不同之处在于不抛异常 而直接返回空的字符串值
//	 * 
//	 * 全系统适用
//	 * 
//	 * @Kitto
//	 * 
//	 * @2009-12-9 下午03:14:15
//	 * 
//	 * @param date
//	 * @return
//	 */
//	public static Date string转换成Datea(String date) {
//		try {
//			// 添加读取后台日期格式 add by one
//			return new SimpleDateFormat("yyyy-MM-dd").parse(date);
//			// return new
//			// SimpleDateFormat(getDateShortDateFormatType()).parse(date);
//		} catch (ParseException e) {
//			return NULLDATE;
//		}
//	}
//	public Date stringToDateFT(String day) {
//		Date returndate = null;
//		try {
//			returndate = spd_time.parse(day);
//		} catch (ParseException e) {
//			throw new RuntimeException(e);
//		}
//		return returndate;
//	}
//	/**
//	 * 将时间转成字符串
//	 * 
//	 * @author Jimmy 2008-11-6 下午04:00:22
//	 * 
//	 * @param time
//	 * @param pattern
//	 *            格式如HH:mm:SS和HH:mm等
//	 * @return
//	 */
    public static String timeToString(Date time, String pattern) {
        spt = new SimpleDateFormat(pattern);
        return spt.format(time);
    }

    //	/**
//	 * 
//	 * @author Jimmy 2008-11-6 下午04:04:27
//	 * 
//	 * @param time
//	 * @param isContainSecond
//	 *            true:"HH:mm:SS";false:"HH:mm"
//	 * @return
//	 */
    public static String timeToString(Date time, boolean isContainSecond) {
        if (isContainSecond)
            return timeToString(time, "HH:mm:ss");
        else
            return timeToString(time, "HH:mm");
    }
//	/**
//	 * 
//	 * lcx 2009-5-20 下午02:21:47
//	 * 
//	 * @param time
//	 * @return
//	 */
//	public static String TimeToString(Date time) {
//		spt = new SimpleDateFormat("HH:mm:ss");
//		return spt.format(time);
//	}
//	public String timeToString(Date time) {
//		return timeToString(time, false);
//	}
//	/**
//	 * 将时间转成字符串
//	 * 
//	 * @param Time
//	 *            time
//	 * 
//	 * @return string
//	 * 
//	 */
//	public static String timeToString(Time time) {
//		return spt.format(time);
//	}
//	/**
//	 * 将字符串转成时间
//	 * 
//	 * @param String
//	 *            time
//	 * 
//	 * @return time
//	 * @throws ParseException
//	 * 
//	 */
//	public static Time stringToTime(String time) {
//		if (time == null || time.isEmpty()) {
//			time = "00:00";// add by pang
//		}
//		try {
//			return stringToTime(time, "HH:mm:ss");
//		} catch (Exception e) {
//			try {
//				return stringToTime(time, "HH:mm");
//			} catch (ParseException e1) {
//				throw new RuntimeException(e1);
//			}
//		}
//	}
//	public static Time stringToTime(String time, String pattern) throws ParseException {
//		spt = new SimpleDateFormat(pattern);
//		Time returntime = new Time(spt.parse(time).getTime());
//		return returntime;
//	}
//	/**
//	 * 传入的num返回一年中的日期。
//	 * 
//	 * @author One 2009-8-18上午10:24:03
//	 * 
//	 * @param year
//	 * @param num
//	 * @return
//	 */
//	public Date getDateFromNumber(int year, int num) {
//		num++;
//		calendar.set(Calendar.DAY_OF_YEAR, num);
//		calendar.set(Calendar.YEAR, year);
//		return calendar.getTime();
//	}
//	/**
//	 * 计算是一年中的第几天 1月1号返回0,1月2号返回1...
//	 * 
//	 * @param String
//	 *            day
//	 * 
//	 * @return int
//	 * 
//	 */
//	public int getDayfrom11(String day) {
//		int instance = 0;
//		calendar.setTime(stringToDate(day));// 传进来的天
//		instance = calendar.get(Calendar.DAY_OF_YEAR);
//		return instance - 1;
//	}
//	/**
//	 * 
//	 * @author Just 2009-1-4上午09:44:12 传DATE的版本。有时候不是STRING
//	 * @param date
//	 * @return
//	 */
//	public static int getDatefrom11(Date date) {
//		calendar.setTime(date);
//		return calendar.get(Calendar.DAY_OF_YEAR) - 1;
//	}
//	/**
//	 *结束日期与开始日期的差
//	 * 
//	 * @JAY
//	 * 
//	 * @2010-3-26 下午01:20:23
//	 * 
//	 * @param startDate
//	 * @param endDate
//	 * @return
//	 */
//	public static int getDatedistance(Date endDate, Date startDate) {
//		// return (getDatefrom11(endDate)-getDatefrom11(startDate));
//		return Integer.valueOf(String.valueOf(compareDates(endDate, startDate)));
//	}

    /**
     * 计算该天是星期几,星期1则返回1，星期2返回2....星期天返回0
     *
     * @param
     * @return int
     */
    public int getDayinWeek(String day) {
        calendar.setTime(stringToDate(day));
        return calendar.get(Calendar.DAY_OF_WEEK) - 1;
    }

    public static int getDayinWeek(Date day) {
        calendar.setTime(day);
        return calendar.get(Calendar.DAY_OF_WEEK) - 1;
    }

    public static boolean isWeekend56(Date day) {
        int d = getDayinWeek(day);
        return d == 5 || d == 6;
    }
//	/**
//	 * 计算该天是星期几,星期1则返回2，星期2返回3....星期天返回1
//	 */
//	public int getDayInWeek(Date day) {
//		calendar.setTime(day);
//		return calendar.get(Calendar.DAY_OF_WEEK);
//	}
//	/**
//	 * 获取该周在该年中是第几周
//	 * 
//	 * @param String
//	 *            day
//	 * 
//	 * @return int
//	 * 
//	 */
//	public int getWeekinYear(String day) {
//		calendar = new GregorianCalendar();
//		calendar.setTime(stringToDate(day));
//		if (day.endsWith("-12-31")) {
//			return calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);// 返回当年最大的一周
//		}
//		return calendar.get(Calendar.WEEK_OF_YEAR);
//	}
//	
//	/**
//	 *
//	 * @JAY
//	 *
//	 * @2011-11-7 上午11:57:56
//	 *
//	 * @param date
//	 * @return
//	 */
//	/*----------------------new method(jay 2011.11.7)---------------------*/
//	public int getWeekinYear(Date date) {
//		calendar = new GregorianCalendar();
//		calendar.setTime(date);
//		if (month(date)==12&&day(date)==31) {//12月31号
//			return calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);// 返回当年最大的一周
//		}
//		return calendar.get(Calendar.WEEK_OF_YEAR);
//	}
//	
//	/**
//	 * 返回当月的最大天数
//	 * 
//	 * @author One 2009-9-21上午10:49:00
//	 * 
//	 * @param year
//	 * @param month
//	 * @return
//	 */
//	public static int getMonthDayCount(int year, int month) {//BUG4943
//		calendar.setTime(new Date());
//		calendar.set(Calendar.YEAR, year);
//		calendar.set(Calendar.MONTH, month - 1);
//		return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//	}
//	/**
//	 * 返回这个月的最大天数
//	 * 
//	 * @param day
//	 * 
//	 * @return int
//	 * 
//	 */
//	public int getMonthDayCount(String day) {
//		calendar.setTime(stringToDate(day));
//		return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//	}
//	//B BUG3780 cwq 20120530 改成静态，
//	public static int getMonth(Date date) {
//		calendar.setTime(date);
//		return calendar.get(Calendar.MONTH) + 1;
//	}	
//	public static int getMonth(String date) {
//		calendar.setTime(stringToDate(date));
//		return calendar.get(Calendar.MONTH) + 1;
//	}
//	
//	//根据INI得到酒店月//
//	private static int reHotelMonth(GregorianCalendar calendar) {
//		// >>B BUG9015sdjen20150115
//		SystemStructure ss = GlobalStatus.isServer ? SystemApplicationBean.getSystemAttribute(SystemApplicationBean
//				.getUserStructure().getHotelID()) : GlobalStatus.getSystemAttribute();// 系统取设定的月值
//		int realMonth = calendar.get(Calendar.MONTH) + 1;// 实际月BUG3780cwq20120530
//		int hotelMonth = realMonth;
//		int startday = ss.getMonthLastDay();// GlobalStatus.hotelmonthstartday;
//		if (startday > 28)
//			startday = 0;// 在过最大天数,如29,那就算到下个月
//		Date settingDate = ss.getHotelYearDate();
//		if (null != settingDate) {// 如果设置了年结
//			Calendar yearCalendar = Calendar.getInstance();
//			yearCalendar.setTime(settingDate);// 年结当月月结日取年结当日
//			if (calendar.get(Calendar.YEAR) == yearCalendar.get(Calendar.YEAR)
//					&& calendar.get(Calendar.MONTH) == yearCalendar.get(Calendar.MONTH))
//				startday = yearCalendar.get(Calendar.DAY_OF_MONTH);
//		}
//		if (startday > 0 && calendar.get(Calendar.DAY_OF_MONTH) > startday) {
//			hotelMonth = realMonth + 1;
//		}
//		return (hotelMonth - 1) % 12 + 1;
//	}// <<E BUG9015sdjen20150115
//	public static int getHotelMonth(String date) {
//		GregorianCalendar calendar = new GregorianCalendar();// BUG8541sdjen20140812
//		calendar.setTime(stringToDate(date));
//		return reHotelMonth(calendar);
////		return calendar.get(Calendar.MONTH) + 1;
//	}	
//	public static int getHotelMonth(Date date) {
//		GregorianCalendar calendar = new GregorianCalendar();// BUG8541sdjen20140812
//		calendar.setTime(date);
//		return reHotelMonth(calendar);
////		return calendar.get(Calendar.MONTH) + 1;
//	}
//	//E BUG3780 gleis_st
//	
//	
//	//B BUG3847
//	
//	private static int privagetHotelYear(GregorianCalendar calendar){
//	//BUG7279.kavy.2013.11.18-b增加一个判断如果有设置年结日期的按年结日期算
//		Date settingDate = GlobalStatus.isServer?
//				SystemApplicationBean.getSystemAttribute(SystemApplicationBean.getUserStructure().getHotelID()).getHotelYearDate():
//					GlobalStatus.getSystemAttribute().getHotelYearDate();
//		if(settingDate!=null){
//			int realYear = calendar.get(Calendar.YEAR);
//			if(CalculateDate.compareDates(calendar.getTime(),settingDate)>0){//如果超过设定的年结时间则将年数+1 BUG7279
//				//BUG7279.kavy.2013.11.27-b
//				/*将设置的年结年份和当前的年份判断，如果相同则加1年，不同则取当前年份
//				 * 比如说年结20131228,到20131229应该算做2014年
//				 * 又比如说年结20131231,到20140101还是应该算2014年
//				 */
//				calendar.setTime(settingDate);
//				int settingyear = calendar.get(Calendar.YEAR);
//				if(realYear == settingyear){
//					return settingyear + 1;
//				}
//				//BUG7279.kavy.2013.11.27-e
//			}
//			return realYear;
//		}else{
//		//BUG7279.kavy.2013.11.18-b
//		String HotelID = SystemApplicationBean.getUserStructure().getHotelID();
//		SystemStructure ss=SystemApplicationBean.getSystemAttribute(HotelID);//系统取设定的月值
//		int startday=ss.getMonthLastDay();//GlobalStatus.hotelmonthstartday;
//		int realYear=calendar.get(Calendar.YEAR);//实际年 
//		if(calendar.get(Calendar.MONTH)+1==12 && calendar.get(Calendar.DAY_OF_MONTH)>startday && startday>0){
//			realYear+=1;//大于12月28,就算到下一年
//		}
//		return realYear;
//		}//BUG7279.kavy.2013.11.18
//	}
//	public static int getHotelYear(String date) {
//		GregorianCalendar calendar = new GregorianCalendar();// BUG8541sdjen20140812
//		calendar.setTime(stringToDate(date));
//		return privagetHotelYear(calendar);
//	}	
//	public static int getHotelYear(Date date) {
//		GregorianCalendar calendar = new GregorianCalendar();// BUG8541sdjen20140812
//		calendar.setTime(date);
//		return privagetHotelYear(calendar);
//	}
//	
//	//E BUG3847 cwq 20120611
//	
//	
//	public int getMonthDayCount(Date day) {
//		calendar.setTime(day);
//		return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//	}
//	/**
//	 * 返回这天在该月是第几天 某月1号返回1
//	 * 
//	 * @param day
//	 * 
//	 * @return int
//	 * 
//	 */
//	public int getDaythinMonth(String day) {
//		return getDateProperty(stringToDate(day), Calendar.DAY_OF_MONTH);
//		// String monthbegin = day.substring(0, 8) + "01";
//		// int instance = getDayfrom11(day) - getDayfrom11(monthbegin);
//		// return instance + 1;
//	}
//	
//	/**
//	 *
//	 * @JAY
//	 *
//	 * @2011-11-7 上午11:59:26
//	 *
//	 * @param day
//	 * @return
//	 */
//	/*----------------------new method(jay 2011.11.7)---------------------*/
//	public int getDaythinMonth(Date day) {
//		return getDateProperty(day, Calendar.DAY_OF_MONTH);
//	}
//	
//	/**
//	 * 返回一个时间段内是星期几的天的集合 dayth:星期一传1星期天传0
//	 * 
//	 * @param startday
//	 *            ,endday,dayth
//	 * 
//	 * @return int
//	 * 
//	 */
//	public List getDaythList(String startday, String endday, int dayth) {
//		List<String> list = new ArrayList<String>();
//		String equalday = startday;
//		calendar = new GregorianCalendar();
//		int instance = getDayfrom11(endday) - getDayfrom11(startday); // 算出起止日期之间相差多少天
//		calendar.setTime(stringToDate(startday));
//		if (getDayinWeek(startday) == dayth) {
//			list.add(startday);
//		}
//		for (int i = 0; i < instance; i++) {
//			calendar.setTime(stringToDate(equalday));
//			calendar.add(Calendar.DATE, 1); // 日期滚动判断
//			equalday = dateToString(calendar.getTime());
//			if (getDayinWeek(equalday) == dayth) {
//				list.add(equalday);
//			}
//		}
//		return list;
//	}
//	
//	/**
//	 *
//	 * @JAY
//	 *
//	 * @2011-11-7 上午11:56:06
//	 *
//	 * @param startday
//	 * @param endday
//	 * @param dayth
//	 * @return
//	 */
//	/*----------------------new method(jay 2011.11.7)---------------------*/
//	public List<Date> getDaythList(Date startday, Date endday, int dayth) {
//		List<Date> list = new ArrayList<Date>();
//		Date equalday = startday;
//		calendar = new GregorianCalendar();
//		int instance = compareDates(endday, startday).intValue(); // 算出起止日期之间相差多少天
//		calendar.setTime(startday);
//		if (getDayinWeek(startday) == dayth) {
//			list.add(startday);
//		}
//		for (int i = 0; i < instance; i++) {
//			calendar.setTime(equalday);
//			calendar.add(Calendar.DATE, 1); // 日期滚动判断
//			equalday = calendar.getTime();
//			if (getDayinWeek(equalday) == dayth) {
//				list.add(equalday);
//			}
//		}
//		return list;
//	}

    /**
     * 时间运算,date 传进去运算的时间 type 选择加减的类型 st 加减的数量(这里的变量可以使用DateFormat下面的静态变量)
     *
     * @param date ,type,st type int ERA = 0; type int YEAR = 1; type int MONTH =
     *             2; type int WEEK_OF_YEAR = 3; type int WEEK_OF_MONTH = 4; type
     *             int DATE = 5; type int DAY_OF_MONTH = 5; type int DAY_OF_YEAR
     *             = 6; type int DAY_OF_WEEK = 7; type int DAY_OF_WEEK_IN_MONTH =
     *             8; type int AM_PM = 9; type int HOUR = 10; type int
     *             HOUR_OF_DAY = 11; type int MINUTE = 12; type int SECOND = 13;
     *             <p>
     *             Fucking the author hight for writing down the words above so
     *             mess....
     * @return Date
     */
    public static Date reckonDay(Date date, int type, int st) {
        GregorianCalendar gc = new GregorianCalendar();
        Date d = (Date) date.clone();// add by rainbow 加入是避免date参数在方法执行后改变了
        gc.setTime(d);
        gc.add(type, st);
        return gc.getTime();
    }

    //	/**
//	 * 时间运算 date 传进去运算的时间 type 选择加减的类型 st 加减的数量
//	 * 
//	 * @param date
//	 *            ,type,count type int ERA = 0; type int YEAR = 1; type int
//	 *            MONTH = 2; type int WEEK_OF_YEAR = 3; type int WEEK_OF_MONTH =
//	 *            4; type int DATE = 5; type int DAY_OF_MONTH = 5; type int
//	 *            DAY_OF_YEAR = 6; type int DAY_OF_WEEK = 7; type int
//	 *            DAY_OF_WEEK_IN_MONTH = 8; type int AM_PM = 9; type int HOUR =
//	 *            10; type int HOUR_OF_DAY = 11; type int MINUTE = 12; type int
//	 *            SECOND = 13;
//	 * 
//	 * @return String
//	 * 
//	 */
//	public String getRollDay(String day, int type, int count) {
//		calendar = new GregorianCalendar();
//		calendar.setTime(stringToDate(day));
//		calendar.add(type, count);
//		return dateToString(calendar.getTime());
//	}
//	/**
//	 * 取服务器时间
//	 * 
//	 * @author Jimmy 2008-9-28 上午11:06:40
//	 * 
//	 * @return
//	 */
//	public static Date getServerDate() {
//		// Date now = new Date();
//		if (null == lastSearchServerDate)
//			lastSearchServerDate = nullDate();
//		// try {
//		if (null == gtagRemote())//BUG 5407(Darke 2013-01-04)
//			/*gtagRemote=*/GlobalStatus.setRemote("GtagBean"); //BUG 5407(Darke 2013-01-04)
//			 /*
//															 * (GtagRemote)
//															 * GlobalStatus
//															 * .ict.lookup
//															 * ("GtagBean/remote"
//															 * )
//															 */;
//		long sub = new Date().getTime() - lastSearchServerDate.getTime();
//		if (sub > minTime) {
//			// 
//			lastServerDate = gtagRemote().getServerDate();//BUG 5407(Darke 2013-01-04)
//			lastSearchServerDate = new Date();
//		}
//		/*
//		 * } catch (NamingException e) { new
//		 * PastoralSystemException("初始化系统属性接口失败", "CalculateDate"); } finally {
//		 * }
//		 */
//		// 
//		return lastServerDate;
//	}
//	public static Date nullDate() {
//		return new CalculateDate().stringToDate("1900-01-01");
//	}
//	public static boolean isNullDate(Date date) {
//		return compareDates(date, nullDate()) == 0;
//	}
//	/**
//	 * 将日期转换为星期几（java星期天为0，dephi为7，，，，做个同一转换吧,现在返回7）
//	 * 
//	 * @author Jimmy 2008-11-18 上午11:59:58
//	 * 
//	 * @param date
//	 * @return
//	 */
//	public static int getDay(Date date) {
//		return 7 + (date.getDay() - 7) % 7;
//	}
//	/**
//	 * 将日期转换为星期几 返回对应的英文单词
//	 * 
//	 * @author kyo-pang 2008-12-16 2008
//	 * 
//	 * @param d
//	 * @return
//	 */
//	public static String getWeekDay(Date date) {// Summer修改
//		String result = GlobalStatus.lang("initDate");
//		int weekDay = getDay(date);
//		switch (weekDay) {
//			case 7 :
//				result = GlobalStatus.lang("Sunday");
//				break;
//			case 1 :
//				result = GlobalStatus.lang("Monday");
//				break;
//			case 2 :
//				result = GlobalStatus.lang("Tuesday");
//				break;
//			case 3 :
//				result = GlobalStatus.lang("Wednesday");
//				break;
//			case 4 :
//				result = GlobalStatus.lang("Thursday");
//				break;
//			case 5 :
//				result = GlobalStatus.lang("Friday");
//				break;
//			case 6 :
//				result = GlobalStatus.lang("Saturday");
//				break;
//			default :
//				break;
//		}
//		return result;
//	}
//	/**
//	 * 
//	 * @just
//	 * 
//	 * @2009-5-12 下午05:35:29 楼上的那个方法跟我想要的不对应。DELPHI中把0认为是SUNDAY
//	 * @param posit
//	 *            是一周中的第几天
//	 * @return
//	 */
//	public String getWeekDayText(int posit) {
//		String[] weeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",};
//		return GlobalStatus.lang(weeks[posit]);
//	}
//	public static String getShortWeekDay(Date date) {
//		String result = GlobalStatus.lang("initDate");
//		int weekDay = getDay(date);
//		switch (weekDay) {
//			case 7 :
//				result = GlobalStatus.lang("Sun");
//				break;
//			case 1 :
//				result = GlobalStatus.lang("Mon");
//				break;
//			case 2 :
//				result = GlobalStatus.lang("Tue");
//				break;
//			case 3 :
//				result = GlobalStatus.lang("Wed");
//				break;
//			case 4 :
//				result = GlobalStatus.lang("Thu");
//				break;
//			case 5 :
//				result = GlobalStatus.lang("Fri");
//				break;
//			case 6 :
//				result = GlobalStatus.lang("Sat");
//				break;
//			default :
//				break;
//		}
//		return result;
//	}
//	/**
//	 * 
//	 * 日期和时间模式 结果 "yyyy.MM.dd G 'at' HH:mm:ss z" 2001.07.04 AD at 12:08:56 PDT
//	 * "EEE, MMM d, ''yy" Wed, Jul 4, '01 "h:mm a" 12:08 PM "hh 'o''clock' a,
//	 * zzzz" 12 o'clock PM, Pacific Daylight Time "K:mm a, z" 0:08 PM, PDT
//	 * "yyyyy.MMMMM.dd GGG hh:mm aaa" 02001.July.04 AD 12:08 PM "EEE, d MMM yyyy
//	 * HH:mm:ss Z" Wed, 4 Jul 2001 12:08:56 -0700 "yyMMddHHmmssZ"
//	 * 010704120856-0700 "yyyy-MM-dd'T'HH:mm:ss.SSSZ"
//	 * 2001-07-04T12:08:56.235-0700
//	 * 
//	 * 
//	 * 
//	 * 
//	 * 
//	 * @author kyo-pang 2008-12-16 2008
//	 * 
//	 * @param d
//	 * @param format
//	 * @return
//	 */
    public static String dateFormat(Date d, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(d);
    }
//	/**
//	 * 对比两个String类型日期的大小(只比较日期)
//	 * 
//	 * @author Jimmy 2008-9-12 下午03:43:08
//	 * 
//	 * @return date1-date2
//	 */
//	public static Long compareDates(String day1, String day2) {
//		// Date date;
//		Date date1 = CalculateDate.stringToDate(day1);
//		Date date2 = CalculateDate.stringToDate(day2);
//		return compareDates(date1, date2);// date1.compareTo(date2);
//	}
//	/**
//	 * 当前日期和传入日期比较
//	 * 
//	 * @nestor
//	 * 
//	 * @2009-7-16 下午05:35:54
//	 * 
//	 * @param date
//	 * @return 返回秒为单位
//	 */
//	public static Long compareDateTime(Date date) {
//		return (new Date().getTime() - date.getTime()) / 1000;
//	}
//	/**
//	 * 比较两个日期
//	 * 
//	 * lcx 2009-7-23 下午02:25:49
//	 * 
//	 * @param date1
//	 * @param date2
//	 * @return 返回秒为单位
//	 */
//	public static Long CompareDateTime(Date date1, Date date2) {
//		return (date1.getTime() - date2.getTime()) / 1000;
//	}

    /**
     * 对比两个日期的大小(只比较日期) 返回两个日期的相差天数 可理解为：day1 - day2 结果可能为负数
     *
     * @param day1
     * @param day2
     * @return
     */
    public static Long compareDates(Date day1, Date day2) {
        if (day1 == null)
            day1 = NULLDATE;
        if (day2 == null)
            day2 = NULLDATE;
        Calendar cal = Calendar.getInstance();
        cal.setTime(day1);
        cal.set(Calendar.HOUR_OF_DAY, 0); //采用24小时格式,有的数据TIMESTAMP小时带了16：00比较有问题
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date d1 = cal.getTime();
        cal.setTime(day2);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date d2 = cal.getTime();
        return (d1.getTime() - d2.getTime()) / (1000 * 60 * 60 * 24);
    }

    //	/**
//	 * 取两个日期中的最小一个
//	 * 
//	 * @author Jimmy 2008-9-18 上午11:56:19
//	 * 
//	 * @param day1
//	 * @param day2
//	 * @return
//	 */
    public static Date minDate(Date day1, Date day2) {
        if (CalculateDate.emptyDate(day1))
            return day2;
        else if (CalculateDate.emptyDate(day2))
            return day1;
        else {
            if (CalculateDate.isBefore(day1, day2))
                return day1;
            else
                return day2;
        }
        // if (day1 != null && day2 != null) { //
        // JUST修改：现在的时间都不会为NULL。全部是1900-01-01
        // return 0 > compareDates(day1, day2) ? day1 : day2;
        // } else if (day1 == null && day2 != null) {
        // return day2;
        // } else if (day2 == null && day1 != null) {
        // return day1;
        // }
        // return null;
    }

    //	/**
//	 * 取两个日期中的最大一个
//	 * 
//	 * @author Jimmy 2008-9-18 上午11:56:13
//	 * 
//	 * @param day1
//	 * @param day2
//	 * @return
//	 */
    public static Date maxDate(Date day1, Date day2) {
        if (day1 != null && day2 != null) { // JUST修改：用到本函数时是可能传一个NULL进来的
            return 0 < compareDates(day1, day2) ? day1 : day2;
        } else if (day1 == null && day2 != null) {
            return day2;
        } else if (day2 == null && day1 != null) {
            return day1;
        }
        return null;
    }

    /**
     * 判断时间是否时初始时间（1900-01-01）
     *
     * @param date
     * @return
     */
    public static boolean emptyDate(Date date) {
        if (null == date)
            return true;
        boolean result = false;
        if (compareDates(NULLDATE, date) >= 0)
            result = true;
        return result;
    }

    //	/**
//	 * 
//	 * @author just 返回一个空时间，即"1900-01-01的时间格式"
//	 * 
//	 * @return
//	 */
    public static Date getEmptyDate() {
        return CalculateDate.stringToDate("1900-01-01");
    }

    //	/**
//	 * @author Summer 2008-12-5 下午02:49:43
//	 * 
//	 * @param month
//	 * @return
//	 */
//	public static String cMon(int month) {
//		String result = "";
//		switch (month) {
//			case 1 :
//				result = GlobalStatus.lang("January");
//				break;
//			case 2 :
//				result = GlobalStatus.lang("February");
//				break;
//			case 3 :
//				result = GlobalStatus.lang("March");
//				break;
//			case 4 :
//				result = GlobalStatus.lang("April");
//				break;
//			case 5 :
//				result = GlobalStatus.lang("May");
//				break;
//			case 6 :
//				result = GlobalStatus.lang("June");
//				break;
//			case 7 :
//				result = GlobalStatus.lang("July");
//				break;
//			case 8 :
//				result = GlobalStatus.lang("August");
//				break;
//			case 9 :
//				result = GlobalStatus.lang("September");
//				break;
//			case 10 :
//				result = GlobalStatus.lang("October");
//				break;
//			case 11 :
//				result = GlobalStatus.lang("November");
//				break;
//			case 12 :
//				result = GlobalStatus.lang("December");
//				break;
//			default :
//				break;
//		}
//		return result;
//	}
//	/**
//	 * 
//	 * 月份的短名称。
//	 * 
//	 * @Alice
//	 * 
//	 * @2009-5-5 下午05:17:59
//	 * 
//	 * @param month
//	 * @return
//	 */
//	public static String shortMonth(int month) {
//		String result;
//		switch (month) {
//			case 1 :
//				result = GlobalStatus.lang("Jan");
//				break;
//			case 2 :
//				result = GlobalStatus.lang("Feb");
//				break;
//			case 3 :
//				result = GlobalStatus.lang("Mar");
//				break;
//			case 4 :
//				result = GlobalStatus.lang("Apr");
//				break;
//			case 5 :
//				result = GlobalStatus.lang("May");//BUG3003 (Zuyu 2012.03.05现在全称和短名称的翻译一样了)//BUGID2444(jay2012.1.31 因为跟全称一样故翻译出现问题)
////				result = GlobalStatus.lang("may");//BUG3003 (Zuyu 2012.03.05注销掉)//BUGID2444(jay2012.1.31 改为小写以区分)
//				break;
//			case 6 :
//				result = GlobalStatus.lang("Jun");
//				break;
//			case 7 :
//				result = GlobalStatus.lang("Jul");
//				break;
//			case 8 :
//				result = GlobalStatus.lang("Aug");
//				break;
//			case 9 :
//				result = GlobalStatus.lang("Sep");
//				break;
//			case 10 :
//				result = GlobalStatus.lang("Oct");
//				break;
//			case 11 :
//				result = GlobalStatus.lang("Nov");
//				break;
//			case 12 :
//				result = GlobalStatus.lang("Dec");
//				break;
//			default :
//				result = "";
//		}
//		return result;
//	}
//	/**
//	 * return hours and minutes, it's format: for example: 13:45
//	 * 
//	 * @author kyo-pang 2008-12-12 2008
//	 * 
//	 * @param date
//	 * @return
//	 */
//	public static String getTime(Date date) {
//		return getInstance().timeToString(date, false);
//	}
//	//b bugid8400 jay20140613
//	public static String getTime(Date date,boolean isContainSecond) {
//		return getInstance().timeToString(date, isContainSecond);
//	}//e bugid8400 jay20140613
//
//	/**
//	 * 
//	 * @author Just 2008-12-25下午12:00:21 处理hoteldate+time这种情况。hoteldate不带分秒
//	 * @param date
//	 * @return
//	 */
//	public static Date dateAddTime(Date date, Date time) {
//		CalculateDate cd = new CalculateDate();
//		date = cd.reckonDay(date, 10, time.getHours());
//		date = cd.reckonDay(date, 12, time.getMinutes());
//		return date;
//	}
//	/**
//	 * 
//	 * @author Just 2009-1-4上午09:35:49
//	 *         取时间的属性，不用DATE对象.getHours,getYear这种不推荐使用的方法了。补充说明：Year :1 Month 2
//	 *         Day 5
//	 * @param date
//	 * @param field
//	 * @return
//	 * 
//	 *         type int ERA = 0; type int YEAR = 1; type int MONTH = 2; type int
//	 *         WEEK_OF_YEAR = 3; type int WEEK_OF_MONTH = 4; type int DATE = 5;
//	 *         type int DAY_OF_MONTH = 5; type int DAY_OF_YEAR = 6; type int
//	 *         DAY_OF_WEEK = 7; type int DAY_OF_WEEK_IN_MONTH = 8; type int
//	 *         AM_PM = 9; type int HOUR = 10; type int HOUR_OF_DAY = 11; type
//	 *         int MINUTE = 12; type int SECOND = 13;
//	 */
    public static int getDateProperty(Date date, int field) {
        calendar.setTime(date);
        if (field == 2)// 当要返回月的时候是从0开始算起的，加1.
            return calendar.get(field) + 1;
        else
            return calendar.get(field);
    }

    //	/**
//	 * 传入的样式一定是hh:mm:ss
//	 * 
//	 * @one
//	 * 
//	 * @2009-11-19 上午10:16:44
//	 * 
//	 * @param str
//	 * @return
//	 */
//	public Integer timeSecs(String str) {
//		Integer result = 0;
//		int hour = 0;
//		int minute = 0;
//		int second = 0;
//		try {
//			// StdLib stdlib=new StdLib();
//			// String tmp=stdlib.pad(str, 8);
//			// result = Integer.valueOf(stdlib.strLeft(tmp, 2)) * 3600 +
//			// Integer.valueOf(stdlib.copy(tmp,4, 2)) * 60
//			// + Integer.valueOf(stdlib.copy(tmp, 7, 2));
//			int first = str.indexOf(":");
//			int last = str.lastIndexOf(":");
//			if (first != -1 && last != -1) {
//				hour = Integer.valueOf(str.substring(0, first)) * 3600;
//				minute = Integer.valueOf(str.substring(first + 1, last)) * 60;
//				second = Integer.valueOf(str.substring(last + 1, str.length()));
//			}
//			result = hour + minute + second;
//		} catch (Exception e) {
//			result = 0;
//		} finally {
//		}
//		return result;
//	}
//	public String TimeStr(Integer secs, boolean lLeadZero) {
//		String result = "";
//		Integer nHrs;
//		Integer nMins;
//		Integer nSecs;
//		nHrs = secs / 3600;
//		nSecs = secs % 3600;
//		nMins = nSecs / 60;
//		nSecs = nSecs % 60;
//		result = (nMins.toString().length() == 1 ? "0" + nMins.toString() : nMins.toString().substring(0, 2)) + ":"
//				+ (nSecs.toString().length() == 1 ? "0" + nSecs.toString() : nSecs.toString().substring(0, 2));
//		if ((nHrs > 0) || lLeadZero)
//			result = (nHrs.toString().length() == 1 ? "0" + nHrs.toString() : nHrs.toString().substring(0, 2)) + ":"
//					+ result;
//		return result;
//	}
//	/**
//	 * 这里计算传进去的2个时间（另2个变量是分秒）相差多少秒
//	 * 
//	 * @author One 2009-6-12上午10:39:00
//	 * 
//	 * @param date1
//	 * @param time1
//	 * @param date2
//	 * @param time2
//	 * @return
//	 */
//	public Integer diffTime(Date date1, Integer time1, Date date2, Integer time2) {
//		int n = compareDates(date2, date1).intValue();
//		return (n * 86400) + (time2 - time1);
//	}
//	// 取某一个日期当月最后一天
//	public int getLastday(Date date) {
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(date);
//		calendar.add(Calendar.MONDAY, 1);
//		calendar.set(Calendar.DATE, 1);
//		calendar.add(Calendar.DATE, -1);
//		return calendar.get(Calendar.DATE);
//	}
//	/**
//	 * 获取当月的第一天
//	 * 
//	 * @author One 2009-3-12下午04:21:51
//	 * 
//	 * @param date
//	 * @return
//	 */
//	public Date returnFirstDay(Date date) {
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(date);
//		calendar.set(Calendar.DATE, 1);
//		return calendar.getTime();
//	}
//	/**
//	 * 获取当月的最后一天
//	 * 
//	 * @author One 2009-3-12下午04:21:59
//	 * 
//	 * @param date
//	 * @return
//	 */
//	public Date returnLastday(Date date) {
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(date);
//		calendar.add(Calendar.MONDAY, 1);
//		calendar.set(Calendar.DATE, 1);
//		calendar.add(Calendar.DATE, -1);
//		return calendar.getTime();
//	}
//	/**
//	 * 返回你自己定义的日期
//	 * 
//	 * @author One 2009-3-12下午04:33:14
//	 * 
//	 * @param year
//	 * @param month
//	 * @param day
//	 * @return
//	 */
//	public static Date returnDate(int year, int month, int day) {
//		// Calendar calendar = Calendar.getInstance();
//		// calendar.setTime(new Date());
//		calendar.set(Calendar.YEAR, year);
//		calendar.set(Calendar.MONTH, month - 1);
//		calendar.set(Calendar.DATE, day);
//		calendar.set(Calendar.HOUR_OF_DAY, 00);// 设置小时
//		calendar.set(Calendar.MINUTE, 00);// 设置分
//		calendar.set(Calendar.SECOND, 00);// 设置秒
//		calendar.set(Calendar.MILLISECOND, 0000);// 设置毫秒
//		return calendar.getTime();
//	}
//	/**
//	 * 
//	 * @author kyo-pang 2009-3-2 2009
//	 * 
//	 * @param date
//	 * @return
//	 */
//	public Date lastday(Date date) {
//		return returnLastday(date);
//	}
//	/**
//	 * 
//	 * @author Just 2009-2-14下午04:30:44 是否12-31
//	 * @param end
//	 * @return
//	 */
//	public boolean isLastDay(Date end) {
//		if (getDateProperty(end, Calendar.MONTH) == 11 && getDateProperty(end, Calendar.DATE) == 31)
//			return true;
//		else
//			return false;
//	}
//	/**
//	 * 
//	 * @author Just 2009-2-14下午04:31:00 是否元旦
//	 * @param begin
//	 * @return
//	 */
//	public boolean isFirstDay(Date begin) {
//		if (getDateProperty(begin, Calendar.MONTH) == 0 && getDateProperty(begin, Calendar.DATE) == 1)
//			return true;
//		else
//			return false;
//	}
//	/**
//	 * 所有Client夜审时间都来这取(*别给我乱改，一人加一句，结果你们的转换互相抵消了- -！)
//	 * 
//	 * @nestor
//	 * 
//	 * @2009-2-20 下午03:02:16
//	 * 
//	 * @return
//	 * 
//	 */
//	public static Date getHotelDate(String hotelid) {
//		try {
//			//BUG4620.kavy.20121101
//			if(hotelid.equals(GlobalStatus.userStructure.getHotelID())){
//				HotelDate = GlobalStatus.getSystemStructure(hotelid).getHotelDate();
//				return HotelDate;
//			}else{
//			//BUG4620.kavy.20121101如果传入的酒店ID不是当前酒店ID，则跑库取时间
//			if (gtagRemote() == null)
//				/*gtagRemote = */GlobalStatus.setRemote("GtagBean");//BUG 5407(Darke 2013-01-04)
//				return gtagRemote().getHotelDate(hotelid);//BUG 5407(Darke 2013-01-04)
//			}
//		} catch (RuntimeException e) {
//			return returnDate_ZeroTime(new Date());
//		}
//	}
//	/**
//	 * 取登陆酒店的时间。。。暫時留有吧。。不然改死了。。。而且前臺沒必要選別的酒店
//	 * 
//	 * @return
//	 * @author Jimmy 2009-2-20 下午04:14:10
//	 */
//	public static Date getHotelDate() {
//		return getHotelDate(GlobalStatus.userStructure.getHotelID());
//	}
//	public static long compareTime(String time1, String time2) {
//		Time t1 = stringToTime(time1);
//		Time t2 = stringToTime(time2);
//		return (t1.getTime() - t2.getTime()) / 1000;
//	}
//	public static void main(String args[]) {
//		String t1 = "12:3";
//		String t2 = "12:03";
//		
//	}
    public static boolean isEqual(Date d1, Date d2) {
        return compareDates(d1, d2) == 0;
    }

    public static boolean isBefore(Date d1, Date d2) {
        return compareDates(d1, d2) < 0;
    }

    public static boolean isAfter(Date d1, Date d2) {
        return compareDates(d1, d2) > 0;
    }

    public static boolean afterEqual(Date d1, Date d2) {// 懒得写>0 =0的人用这个吧
        return compareDates(d1, d2) >= 0;
    }

    public static boolean beforeEqual(Date d1, Date d2) {
        return compareDates(d1, d2) <= 0;
    }
//	/**
//	 * 根据传入的时间判断是否是酒店设置的周末
//	 * 
//	 * @author One 2009-4-10下午12:01:05
//	 * 
//	 * @param gfirm
//	 * @param date
//	 * @return
//	 */
//	public boolean isWeekend(Gfirm gfirm, Date date) {
//		if (isNullDate(date))
//			return false;
//		int week = getDayinWeek(dateToString(date));
//		// if (week == 0)
//		// week = 7;
//		String weekend = gfirm.getWeekend_p();
//		if (weekend.substring(week, week + 1).equals("1"))
//			return true;
//		else
//			return false;
//	}
//	/**
//	 * 
//	 * 
//	 * @author kyopang 2009-1-27上午09:34:40 @ Co. BBStart
//	 * @param aDate
//	 * @return
//	 */
//	public Date monthAgo(Date aDate) {
//		int year = aDate.getYear();
//		int month = aDate.getMonth();
//		int day = aDate.getDate();
//		Date d;
//		if (month != 0) {//
//			d = new Date(year, month - 1, day);
//		} else {
//			d = new Date(year - 1, 12, day);
//		}
//		return d;
//	}
//	/**
//	 * @author Steven 2009-5-8 下午01:52:25
//	 * 
//	 * @param date
//	 * @return 返回该日期的年
//	 */
//	public int year(Date date) {
//		int result = 0;
//		GregorianCalendar calendar = new GregorianCalendar();
//		calendar.setTime(date);
//		result = calendar.get(1);
//		return result;
//	}
//	/**
//	 * @author Steven 2009-5-8 下午01:54:20
//	 * 
//	 * @param date
//	 * @return 返回该日期的月
//	 */
//	public int month(Date date) {
//		int result = 0;
//		GregorianCalendar calendar = new GregorianCalendar();
//		calendar.setTime(date);
//		result = calendar.get(2) + 1;
//		return result;
//	}
//	/**
//	 * @author Steven 2009-5-8 下午01:54:24
//	 * 
//	 * @param date
//	 * @return 返回该日期的日
//	 */
//	public int day(Date date) {
//		int result = 0;
//		GregorianCalendar calendar = new GregorianCalendar();
//		calendar.setTime(date);
//		result = calendar.get(5);
//		return result;
//	}
//	/**
//	 * @author rainbow 2009-5-6 下午02:18:10
//	 * @param date
//	 * @return
//	 * 
//	 */
//	public Date yearAgo(Date date) {
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(date);
//		calendar.add(Calendar.YEAR, -1);
//		return calendar.getTime();
//	}
//	/**
//	 * 取开机时间
//	 * 
//	 * @nestor
//	 * 
//	 * @2009-5-12 上午11:48:53
//	 * 
//	 * @return
//	 */
//	// public static String getSystemStartTime() {
//	// String startUpTime = "";
//	// try {
//	// Process process = Runtime.getRuntime().exec(
//	// "cmd /c net statistics workstation");
//	// BufferedReader bufferedReader = new BufferedReader(
//	// new InputStreamReader(process.getInputStream()));
//	// int i = 0;
//	// String timeWith = "";
//	// String date = "";
//	// String time = "";
//	// while ((timeWith = bufferedReader.readLine()) != null) {
//	// if (i == 3) {
//	// 
//	// startUpTime = timeWith.substring(timeWith.indexOf("/")-4);
//	//					
//	// date = startUpTime.replace("/", "-").substring(0,
//	// startUpTime.indexOf(" "));
//	// time = startUpTime.substring(startUpTime.lastIndexOf(" "))
//	// + ":00";
//	// startUpTime = date + time;
//	//
//	// }
//	// i++;
//	// }
//	// process.waitFor();
//	// } catch (Exception e) {
//	// e.printStackTrace();
//	// }
//	// return "2009-09-03 11:12:13";
//	// }
//	/**
//	 * 计算开机时长 lcx 2009-5-12 上午10:51:45
//	 * 
//	 * @return
//	 */
//	public static long GetTickCount(Date date) {
//		
//		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String systemTime = spd_time.format(new Date()).toString();
//		String systemStartTime = spd_time.format(date).toString();
//		Date begin = null;
//		Date end = null;
//		try {
//			begin = spd_time.parse(systemStartTime);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		try {
//			end = spd_time.parse(systemTime);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		long TickCount = end.getTime() - begin.getTime();
//		return TickCount;
//	}
//	public static long CompareDateTime(String time) {
//		String systemTime = spd_time.format(new Date()).toString();
//		Date DsystemTime = null;
//		Date Dtime = null;
//		try {
//			DsystemTime = spd_time.parse(systemTime);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		try {
//			Dtime = spd_time.parse(time);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		return DsystemTime.getTime() - Dtime.getTime();
//	}
//	/**
//	 * 将日期和字符串型的时间连接起来
//	 * 
//	 * @author Jimmy 2009-5-25下午09:23:13
//	 * 
//	 * @param date
//	 * @param time
//	 * @return
//	 */
//	public static Date concatTime(Date date, String time) {
//		String[] times = time.split(":");
//		int hour = 0;
//		try {
//			hour = Integer.valueOf(times[0]);
//		} catch (NumberFormatException e) {
//		} catch (ArrayIndexOutOfBoundsException e) {
//		}
//		int min = 0;
//		try {
//			min = Integer.valueOf(times[1]);
//		} catch (NumberFormatException e) {
//		} catch (ArrayIndexOutOfBoundsException e) {
//		}
//		int soc = 0;
//		try {
//			soc = Integer.valueOf(times[2]);
//		} catch (NumberFormatException e) {
//		} catch (ArrayIndexOutOfBoundsException e) { // just add
//														// 2011.5.11可能越界异常。
//		}
//		return new Date(date.getYear(), date.getMonth(), date.getDate(), hour, min, soc);
//	}
//	public static Time GetSysDateTime() {
//		Date SysDate = new Date();
//		return stringToTime(TimeToString(SysDate));
//	}

    /**
     * 返回时分秒都为0的日期（在这里是为了存入数据库的时候，日期比较）
     *
     * @param date
     * @return
     * @author One 2009-6-28上午11:12:27
     */
    public static Date returnDate_ZeroTime(Date date) {
        Calendar calendar = Calendar.getInstance();// BUG6378sdjen20130621
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 00);// 设置小时
        calendar.set(Calendar.MINUTE, 00);// 设置分
        calendar.set(Calendar.SECOND, 00);// 设置秒
        calendar.set(Calendar.MILLISECOND, 0000);// 设置毫秒
        return calendar.getTime();
    }

    /**
     * @param checkDate
     * @param minDate
     * @param maxDate
     * @return
     * @just
     * @2009-8-6 下午02:41:15 判断该时间是否在该日期范围内 大于等于mindate且小于等于maxDate返回时true
     */
    public static boolean isInRange(Date checkDate, Date minDate, Date maxDate) {
        if (afterEqual(checkDate, minDate) && beforeEqual(checkDate, maxDate))
            return true;
        else
            return false;
    }
//	/**
//	 * 
//	 * d1-d2的天数
//	 * 
//	 * @2009-8-8 下午02:36:14
//	 * @author rainbow
//	 * @param d1
//	 * @param d2
//	 * @return
//	 */
//	public static int afterNday(Date d1, Date d2) {
//		GregorianCalendar g1 = new GregorianCalendar();
//		g1.setTime(d1);
//		GregorianCalendar g2 = new GregorianCalendar();
//		g2.setTime(d2);
//		g1.set(Calendar.HOUR, 0);
//		g1.set(Calendar.MINUTE, 0);
//		g1.set(Calendar.SECOND, 0);
//		g2.set(Calendar.HOUR, 0);
//		g2.set(Calendar.MINUTE, 0);
//		g2.set(Calendar.SECOND, 0);
//		long sub = g1.getTimeInMillis() - g2.getTimeInMillis();
//		return (int) (sub / (24 * 60 * 60 * 1000));
//	}
//	/**
//	 * 传入一个时间，用new Date()的时分秒来设置该时间，并返回它
//	 * 
//	 * @author One 2009-8-10下午01:27:16
//	 * 
//	 * @param date
//	 * @return
//	 */
//	public Date returnNowTime(Date date) {
//		GregorianCalendar calendar = new GregorianCalendar(); // 我在这加了NEW变量
//																// 要不有问题 cwq
//																// 2011-06-28
//		calendar.setTime(date);
//		Date nowDate = new Date();
//		calendar.set(Calendar.HOUR_OF_DAY, 15);// 设置小时
//		calendar.set(Calendar.HOUR_OF_DAY, getDateProperty(nowDate, Calendar.HOUR_OF_DAY));// 设置小时
//		calendar.set(Calendar.MINUTE, getDateProperty(nowDate, Calendar.HOUR_OF_DAY));// 设置分
//		calendar.set(Calendar.SECOND, getDateProperty(nowDate, Calendar.HOUR_OF_DAY));// 设置秒
//		calendar.set(Calendar.MILLISECOND, 0000);// 设置毫秒
//		return calendar.getTime();
//	}
//	/**
//	 * 
//	 * @just 有的CICO字段中只有 ：号,不含具体时间。当空处理
//	 * @2009-8-14 上午09:38:57
//	 * 
//	 * @param time
//	 * @return
//	 */
//	public static String getCICOTime(String time) {
//		String result = "";
//		try {
//			result = stringToTime(time).toString();
//		} catch (RuntimeException e) {
//			return "";
//		}
//		return result;
//	}
//	
//	public static Date parseDateTime(String pattern, String date){
//		try {
//			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date);
//		} catch (Exception e) {
//			return NULLDATE;
//		}
//	}
//	/**
//	 * 
//	 * @rainbow
//	 * 
//	 * @2009-9-27 下午05:18:26
//	 * 
//	 * @param pattern
//	 * @param date
//	 * @return
//	 */
//	public static String formatDateTime(String pattern, Date date) {
//		try {
//			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//			return sdf.format(date);
//		} catch (Exception e) {
//			return dateToString(date);
//		}
//	}
//	/**
//	 * 
//	 * @rainbow
//	 * 
//	 * @2009-9-29 下午03:37:18
//	 * 
//	 * @param year
//	 * @param month
//	 * @param day
//	 * @return
//	 */
//	public static Date encodeDate(int year, int month, int day) {
//		return new GregorianCalendar(year, month, day).getTime();
//	}
//	/**
//	 * 
//	 * @JAY
//	 * 
//	 * @2009-10-15 下午02:43:49
//	 * 
//	 * @param date
//	 * @return
//	 */
//	public static String dateToLongStr(Date date) {
//		String weekDay = getWeekDay(date);
//		String month = cMon(new CalculateDate().month(date));
//		String day = String.valueOf(new CalculateDate().day(date));
//		String year = String.valueOf(new CalculateDate().year(date));
//		String result = weekDay + "," + month + "," + day + "," + year;
//		return result;
//	}
//	public static boolean isLeapYear(Integer year) {
//		return year != 0 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
//	}
//	/**
//	 * 返回今年的第一天
//	 * 
//	 *@author One 2009-10-20下午01:26:53
//	 * 
//	 *@param date
//	 *@return
//	 */
//	public Date firstYearDate(Date date) {
//		calendar.setTime(date);
//		calendar.set(Calendar.DATE, 1);// 设置天
//		calendar.set(Calendar.MONTH, 0);// 设置yue
//		return calendar.getTime();
//	}
//	/**
//	 * 返回某年天数
//	 * 
//	 * @cwq
//	 * 
//	 * @2009-11-19 下午04:58:54
//	 * 
//	 * @param date
//	 * @return
//	 */
//	public int getYearDayCount(int year) {
//		long ycount = compareDates(stringToDate(String.valueOf(year) + "-12-31"), stringToDate(String.valueOf(year)
//				+ "-01-01"));
//		return Integer.valueOf(String.valueOf(ycount));
//	}
//	public boolean checkTime(String time) {
//		if (time.isEmpty() || time.trim().equals(":")) {
//			return true;
//		} else {
//			try {
//				new SimpleDateFormat("HH:mm").parseObject(time);// .parse(time);
//			} catch (ParseException e) {
//				return false;
//			}
//			if (time.trim().length() != 5)
//				return false;
//			else {
//				String hour = time.split(":")[0].trim();
//				String min = time.split(":")[1].trim();
//				if (!hour.startsWith("0")) {
//					if (Integer.parseInt(hour) >= 24)
//						return false;
//				}
//				if (!min.startsWith("0") && Integer.parseInt(min) > 59)
//					return false;
//			}
//		}
//		return true;
//	}
//	/**
//	 * 将2005-09-09转成09/09/05
//	 * 
//	 * @Author Summer
//	 * 
//	 * @2010-2-23 下午03:29:39
//	 * 
//	 * @param date
//	 * @return
//	 */
//	public static String getFormatDate(Date date) {
//		calendar.setTime(date);
//		String day = String.valueOf(calendar.get(5));
//		String month = String.valueOf(calendar.get(2) + 1);
//		String year = String.valueOf(calendar.get(1)).substring(2);
//		if (day.length() == 1)
//			day = "0" + day;
//		if (month.length() == 1)
//			month = "0" + month;
//		return day + "/" + month + "/" + year;
//	}
//	/**
//	 * 获取系统的日期格式 0 为短日期 1 为长日期
//	 * 
//	 * @author one
//	 * 
//	 *         2010-4-15 下午01:25:47
//	 * 
//	 * @param hotelID
//	 * @param mode
//	 * @return
//	 */
//	public static String getSystemDateFormatType(int mode) {
//		String hotelID;
//		Gfirm gfirm = null;
//		if (GlobalStatus.isServer) {
//			hotelID = SystemApplicationBean.getUserStructure().getHotelID();
//			gfirm = SystemApplicationBean.getSystemAttribute(hotelID).getGfirm();
//		} else {
//			hotelID = GlobalStatus.userStructure.getHotelID();
//			gfirm = GlobalStatus.getSystemStructure(hotelID).getGfirm();
//			// 
//		}
//		return changeFormat(mode == 0 ? gfirm.getLgshort_p() : gfirm.getLglong_p(), mode);
//	}
//	public static String getDateShortDateFormatType() {
//		return getSystemDateFormatType(0);
//	}
//	public static String getDatelongDateFormatType() {
//		return getSystemDateFormatType(1);
//	}
//	/**
//	 * 
//	 * @just 将long的执行时间转成例如4m3s200ms格式输出
//	 * 
//	 * @2010-5-13 上午10:20:50
//	 * 
//	 * @param time
//	 * @return
//	 */
//	public static String getExcuteTime(long time) {
//		long min = time / 60000;
//		long sec = (time % 60000) / 1000;
//		long mill = time % 1000;
//		return min + "m" + sec + "s" + mill + "ms";
//	}
//	/**
//	 * 检查日期是否符合结构
//	 * 
//	 * @author One
//	 * 
//	 *         2010-12-6 下午03:32:07
//	 * 
//	 * @param dateFormatType
//	 * @return
//	 */
//	public static boolean checkDateFormatType(String dateFormatType) {
//		boolean result = false;
//		// dateFormatType = dateFormatType.replace("Y", "y").replace("m",
//		// "M").replace(" ", "");
//		// 这里排除3位年的情况
//		if (dateFormatType.contains("yyy") && !dateFormatType.contains("yyyy")) {
//			return result;
//		}
//		// 这里排除不含有2位MM和dd的情况
//		if (dateFormatType.contains("MM") && dateFormatType.contains("dd")) {
//			String regex = "([Md]{2})([.,/-]?)([y]{2,4})([.,/-]?)([Md]{2})";
//			int year = dateFormatType.indexOf("y");
//			int month = dateFormatType.indexOf("M");
//			int day = dateFormatType.indexOf("d");
//			if (year < month && year < day) {
//				regex = "([y]{2,4})([.,/-]?)([Md]{2})([.,/-]?)([Md]{2})";
//			} else if (year > month && year > day) {
//				regex = "([Md]{2})([.,/-]?)([Md]{2})([.,/-]?)([y]{2,4})";
//			}
//			Pattern pattern = Pattern.compile(regex);
//			Matcher matcher = pattern.matcher(dateFormatType);
//			result = matcher.matches();
//			if (!result) {
//				return result;
//			} else {
//				// 这里排除日期连接符一个为空一个含有的情况
//				boolean x = matcher.group(2).isEmpty() && !matcher.group(4).isEmpty();
//				boolean y = !matcher.group(2).isEmpty() && matcher.group(4).isEmpty();
//				if (x || y) {
//					return false;
//				}
//				return result;
//			}
//		}
//		return result;
//	}
//	
//	public Date getDate(){
//		Date resultdate=null;
//		if(GlobalStatus.obj!=null){
//			resultdate=new Date(Long.parseLong(GlobalStatus.obj[6]+"")+new Date().getTime());
//		}
//		return resultdate;
//		
//	}
//	/**BUG6218(Jerremy 2013.05.24)*/
//	/**获取 酒店日期-服务器当前时分秒
//	 *
//	 * @Jeremy
//	 *
//	 * @May 21, 2013 10:51:59 AM
//	 *
//	 * @param hotelid
//	 * @return
//	 */
//	public static Date getHotelDateTime(String hotelid){
//		Date hotelDate = null;
//		if (GlobalStatus.isServer) {
//			hotelDate = SystemApplicationBean.getHotelDate(hotelid);
//		}else {
//			hotelDate = GlobalStatus.getSystemStructure(hotelid).getHotelDate();
//		}
//		Date nowDate = new Date();
//		Calendar cHotel = Calendar.getInstance();
//		cHotel.setTime(hotelDate);
//		Calendar cNow = Calendar.getInstance();
//		cNow.setTime(nowDate);
//		cHotel.set(Calendar.HOUR_OF_DAY, cNow.get(Calendar.HOUR_OF_DAY));// 设置小时
//		cHotel.set(Calendar.MINUTE, cNow.get(Calendar.MINUTE));// 设置分
//		cHotel.set(Calendar.SECOND, cNow.get(Calendar.SECOND));// 设置秒
//		return cHotel.getTime();
//	}
//	
//	/**------------------BUG7279 NEW METHOD(Jerremy 2013.11.14)------------------*/
//	public static Boolean isSameYear(Date naDate, Date date){//
//		return CalculateDate.getHotelYear(naDate) == CalculateDate.getHotelYear(date);
//	}
//	/**------------------BUG7279 NEW METHOD(Jerremy 2013.11.14)------------------*/
//	public static Boolean isSameMonth(Date naDate, Date date){//
//		return CalculateDate.getHotelMonth(naDate) == CalculateDate.getHotelMonth(date);
//	}
//	
//	/*------------------NEW METHOD BUG7954(Neal 2014.01.26)------------------*/
//	/**
//	 * 字符串类型日期转化为Date类型，如果日期字符串格式不是正常日期格式则返回Null，例：'0273212'。
//	 */
//	public static Date formatDate(SimpleDateFormat format, String dateString){
//		Date date;
//		try {
//			date = format.parse(dateString);
//			if (date.getYear() < 0)
//				throw new Exception();
//		} catch (Exception e) {
//			date = null;
//		}
//		return date;
//	}

    public static List<String> getDateStartEnd(List<Date> as, String splitChar) {
        List<String> result = new ArrayList<String>();
        HashSet<Date> filterSet = new HashSet<Date>();//如果已经
        for (Date date : as) {
            Date myEndDate = getMyEnd(date, as, filterSet);
            if (myEndDate != null) {
                for (Date lisdate : as) {
                    if (CalculateDate.afterEqual(lisdate, date)
                            && CalculateDate.beforeEqual(lisdate, myEndDate)) {
                        filterSet.add(lisdate);
                    }
                }
                result.add(dateToString(date) + splitChar + dateToString(myEndDate));
            }
        }
        return result;
    }

    public static List<Date[]> getDateStartEnd2(List<Date> as) {
        List<Date[]> result = new ArrayList<Date[]>();
        HashSet<Date> filterSet = new HashSet<Date>();//如果已经
        //BUG8359 B
        Collections.sort(as, new Comparator<Date>() {
            public int compare(Date o1, Date o2) {
                if (CalculateDate.isBefore(o1, o2)) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        //BUG8359 E
        for (Date date : as) {
            Date myEndDate = getMyEnd(date, as, filterSet);
            if (myEndDate != null) {
                for (Date lisdate : as) {
                    if (CalculateDate.afterEqual(lisdate, date)
                            && CalculateDate.beforeEqual(lisdate, myEndDate)) {
                        filterSet.add(lisdate);
                    }
                }
                result.add(new Date[]{date, myEndDate});
//					result.add(dateToString(date)+splitChar+dateToString(myEndDate));
            }
        }
        return result;
    }

    public static Date getMyEnd(Date date, List<Date> as, HashSet<Date> filterSet) {
        if (filterSet.contains(date))
            return null;
        else {
            for (Date lisdate : as) {
                if (CalculateDate.isEqual(lisdate, CalculateDate.reckonDay(date, 5, 1)))
                    return getMyEnd(lisdate, as, filterSet);
            }
            return date;
        }
    }

    public static Date getDateKey(Date date) {
        if (date instanceof Timestamp) { //本类都是用java.util.date类型做为KEY
            return stringToDate(dateToString(date));
        }
        return date;
    }

    public static String getDateRangeStr(Date dfrom, Date dto) {
        return CalculateDate.dateToString(dfrom) + "~" + CalculateDate.dateToString(dto);
    }

    public static Date getSystemDate() {
        return new Date();
    }

    /**
     * 返回这个日期的c定时任务时间表达式
     *
     * @param date
     * @return
     */
    public static String getCronExp(Date date) {
        return new SimpleDateFormat("ss mm HH dd MM ? yyyy").format(date);//秒,分,时,日,月,周(星期几),年
    }


}
