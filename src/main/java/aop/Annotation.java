package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect//标砖这个类是一个切面
public class Annotation {

    @Before("execution(* aop.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("before");
    }
    @After("execution(* aop.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("after");
    }
    @Around("execution(* aop.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around");
        joinPoint.proceed();
        System.out.println("after around");
    }

}
