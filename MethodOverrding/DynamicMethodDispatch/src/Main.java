class Super{
    public void meth1(){
        System.out.println("Super Meth1");
    }
    public void meth2(){
        System.out.println("Super Meth2");
    }
}
class Sub extends Super{
    public void meth2(){
        System.out.println("sub meth2");
    }
    public void meth3(){
        System.out.println("sub meth3");
    }
}
public class Main {
    public static void main(String[] args) {
        Super sup = new Sub();
       sup.meth1();
       sup.meth2();

        }
    }
