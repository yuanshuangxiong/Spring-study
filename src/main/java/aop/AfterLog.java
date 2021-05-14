package aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {




    public void afterReturning(Object o, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+" "+method.getName());
    }
}
