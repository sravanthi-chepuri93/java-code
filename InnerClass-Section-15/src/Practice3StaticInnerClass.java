class OuterS{
    int x = 10;
    static int y = 20;

    static class My{
        public void show(){
            System.out.println(y);
        }
    }
}



public class Practice3StaticInnerClass {
    public static void main(String[] args){
        OuterS.My os = new OuterS.My();
        os.show();


    }
}
