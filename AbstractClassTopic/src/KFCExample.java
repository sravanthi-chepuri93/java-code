abstract class KFC{
    KFC() {
        System.out.println("The main brach of KFC guidelines");
    }
    void makeItem(){
        System.out.println("KFC chicken recipes");
    }
    abstract void billing();
    abstract void offer();
}
class MyKFC extends KFC{
    MyKFC(){
        System.out.println("My KFC implementation");
    }
    void makeItem(){
        System.out.println("MY KFC make item");
    }

    @Override
    void billing() {
        System.out.println("My KFC billing section");
    }

    @Override
    void offer() {
        System.out.println("My KFC festive offer");
    }
}

public class KFCExample {
    public static void main(String[] args){
        KFC kfc = new MyKFC();
        kfc.makeItem();
        kfc.billing();
        kfc.offer();

    }
}
