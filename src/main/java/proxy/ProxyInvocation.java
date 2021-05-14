package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocation implements InvocationHandler {
    //只能代理接口
    Rent rent;
//    public ProxyInvocation(){
//
//    }
//    public ProxyInvocation(Rent rent){
//        this.rent=rent;
//    }


    public void setRent(Rent rent) {
        this.rent = rent;
    }
     public void seeHouse(){
        System.out.println("看房子");
    }
     public void fare(){
        System.out.println("fare");
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object result=method.invoke(rent,args);
        fare();
        return result;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }


}
