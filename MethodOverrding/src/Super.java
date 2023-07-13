public class Super {
    public void display(){
        System.out.println("Super Display");
    }
}

class Sub extends Super{
    public void display(){
        System.out.println("sub display");
    }

}
class Test{
    public static void main(String[] args){
//        Super su = new Super();
//        su.display();
//        Sub s = new Sub();
//        s.display();
        Super su = new Sub();
        su.display();
    }
}
