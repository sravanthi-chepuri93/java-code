class Parent{
    Parent(){
        System.out.println("non-param of parent");
    }
    Parent(int x){
        System.out.println("Param of parent"+x);
    }
}
class child extends Parent{
    child(){
        System.out.println("non-param of child");
    }
    child(int y){
        System.out.println("param of child");
    }
    child(int x,int y){
        super(10);
        System.out.println("2 param of child"+y);
    }
}

public class Main {
    public static void main(String[] args) {
      // child c = new child(20);
        child c = new child(10,20);



    }
}