package aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class DiyPointCut {
    public void before(){
        System.out.println("方法执行前");
    }

    public void after(){
        System.out.println("方法执行后");
    }

    public void afterReturning(){
        System.out.println("方法返回后");
    }

    public void around(ProceedingJoinPoint point ) throws Throwable {
        System.out.println("环绕");
        point.proceed();
        System.out.println("环绕后");
   }
}
