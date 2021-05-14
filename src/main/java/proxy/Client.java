package proxy;

public class Client {
    public static void main(String[] args) {
//        Host host=new Host();
//        host.rent();
            //静态代理
//          Proxy proxy=new Proxy(new Host());
//          proxy.rent();
        //动态代理
        Host host=new Host();
        ProxyInvocation proxyInvocation=new ProxyInvocation();
        proxyInvocation.setRent(host);
        Rent proxy= (Rent) proxyInvocation.getProxy();
        proxy.rent();
    }
}
