class OuterC{
    public void display(){
        class Inner{
            public void show(){
                System.out.println("Hello");
            }
        }
        Inner i = new Inner();
        i.show();
        // new Inner().show();
    }
}



public class practice1NestedClass {
    public static void main(String[] args){
        OuterC o = new OuterC();
        o.display();
    }
}
