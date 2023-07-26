class Test{
    static {
        System.out.println("Bock1");
    }
    static{
        System.out.println("Block2");
    }
}
public class staticBlcoksPractice2 {
    public static void main(String[] args){
        System.out.println("Main");
        Test t = new Test();


    }
}
