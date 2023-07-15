interface TestRun{
    final static int X=10;
    public abstract void method1();
    public abstract void method2();
    private void  methodPrivate(){
        System.out.println("private method4");
    }
    public static void method3(){
        System.out.println("Method  3 of the test run");
    }
}

interface TestRun2 extends TestRun{
    void method4();
}
class MyClass implements TestRun2{

    @Override
    public void method1() {
        System.out.println("Method1");
    }

    @Override
    public void method2() {
        System.out.println("Method2");
    }

    @Override
    public void method4() {
        System.out.println("Method4");
    }
}
public class InterfacePractice {
    public static void main(String[] args){
        System.out.println(TestRun.X);
        TestRun.method3();


    }
}
