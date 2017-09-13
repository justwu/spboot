package com.just.inject;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by flyhigh on 2017/6/9.
 */
@Aspect
@Component
public class MethodInjecter {

    private Logger logger = LoggerFactory.getLogger("methodinject");

    //pointcut 表达式写法
    //  "execution(* com.just.demo.service.UserShoppingService.buy(..))&&args(bookname)"
//    任意公共方法的执行：
//    execution(public * *(..))
//    任何一个以“set”开始的方法的执行：
//    execution(* set*(..))
//    AccountService 接口的任意方法的执行：
//    execution(* com.xyz.service.AccountService.*(..))
//    定义在service包里的任意方法的执行：
//    execution(* com.xyz.service.*.*(..))
//    定义在service包和所有子包里的任意类的任意方法的执行：
//    execution(* com.xyz.service..*.*(..))
//    定义在pointcutexp包和所有子包里的JoinPointObjP2类的任意方法的执行：
//    execution(* com.test.spring.aop.pointcutexp..JoinPointObjP2.*(..))")
//            ***> 最靠近(..)的为方法名,靠近.*(..))的为类名或者接口名,如上例的JoinPointObjP2.*(..))
//
//     pointcutexp包里的任意类.
//      within(com.test.spring.aop.pointcutexp.*)
//      pointcutexp包和所有子包里的任意类.
//      within(com.test.spring.aop.pointcutexp..*)
//    实现了MyInterface接口的所有类,如果MyInterface不是接口,限定MyInterface单个类.
//this(com.test.spring.aop.pointcutexp.MyInterface)
//            ***> 当一个实现了接口的类被AOP的时候,用getBean方法必须cast为接口类型,不能为该类的类型.
//
//            带有@MyTypeAnnotation标注的所有类的任意方法.
//    @within(com.elong.annotation.MyTypeAnnotation)
//    @target(com.elong.annotation.MyTypeAnnotation)
//            带有@MyTypeAnnotation标注的任意方法.
//    @annotation(com.elong.annotation.MyTypeAnnotation)
//***> @within和@target针对类的注解,@annotation是针对方法的注解
//
//    参数带有@MyMethodAnnotation标注的方法.
//    @args(com.elong.annotation.MyMethodAnnotation)
//    参数为String类型(运行是决定)的方法.
//    args(String)

    @Pointcut("within(com.just.service.impl.*)")   //切点:所有接口的调用都拦截
    public void speedCut() {

    }

    @Pointcut("within(com.just.controller.*)")   //切点:所有接口的调用都拦截
    public void controllerCut() {

    }

    @AfterThrowing(value = "controllerCut()", throwing = "e")
    public void controlException(Exception e) {
        logger.info("抛出异常之后.执行.记录下啊什么的");
    }

    @Around("controllerCut()")
    public Object controlSpeed(ProceedingJoinPoint joinPoint) throws Throwable {//注意. around拦截要返回拦截方法的返回值.否则会出现没结果返回的情况
        long s1 = System.currentTimeMillis();
        Object object = joinPoint.proceed();
       /* try {
            object = joinPoint.proceed();
        } catch (Throwable throwable) {  //处理异常
            logger.warn("出错咯");
            throwable.printStackTrace();

        }*/
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        logger.info("方法" + methodSignature.getMethod().getName() + "执行时间 " + (System.currentTimeMillis() - s1) + "ms ! ");
//        System.out.println("方法" + methodSignature.getMethod().getName() + "执行时间 " + (System.currentTimeMillis() - s1) + "ms !");
        return object;

    }


    @Around("speedCut()")
    public Object logService(ProceedingJoinPoint joinPoint) throws Throwable {//注意. around拦截要返回拦截方法的返回值.否则会出现没结果返回的情况
        long s1 = System.currentTimeMillis();
        Object object = null;
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        try {
            object = joinPoint.proceed();
        } catch (Throwable throwable) {
//            throwable.printStackTrace();
            //记录异常
            logger.warn("方法{}执行出错. 执行时间{}", methodSignature.getMethod().getName(), (System.currentTimeMillis() - s1) + "ms !");

            throw throwable;
        }
        logger.info("方法{} 执行时间{}", methodSignature.getMethod().getName(), (System.currentTimeMillis() - s1) + "ms !");

        return object;

    }

    public static String getServiceMthodDescription(JoinPoint joinPoint)
            throws Exception {
        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        Class targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getMethods();
        String description = "";
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class[] clazzs = method.getParameterTypes();
                if (clazzs.length == arguments.length) {
                    description = "xxx"; //method.getAnnotation(SystemServiceLog. class).description();
                    break;
                }
            }
        }
        return description;
    }

}
