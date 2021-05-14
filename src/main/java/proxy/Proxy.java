package proxy;

public class Proxy implements Rent{
    private Host host;
    public Proxy(){

    }

    public Proxy(Host host){
        this.host=host;
    }

    public void rent(){
        seeHouse();
        host.rent();
        hetong();
        fare();

    }

    private void fare() {
        System.out.println("收中介费");
    }

    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void hetong(){
        System.out.println("签订合同");
    }
}
