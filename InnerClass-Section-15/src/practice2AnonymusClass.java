abstract class My{
    abstract public void show();
}

class OuterA{
    public void display(){
//        My m = new My(){
//            @Override
//            public void show() {
//                System.out.println("hello");
//            }
//        };
//        m.show();
        new My(){ public void show(){ System.out.println("hello");}}.show();
    }
}



public class practice2AnonymusClass {
    public static void main(String[] args){
        OuterA oa = new OuterA();
        oa.display();

    }
}
