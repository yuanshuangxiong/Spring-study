package aop;

//import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;


public class BeforeLog implements MethodBeforeAdvice {


    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+" "+method.getName());
    }
}
