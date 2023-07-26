
public class FinalMemebers {
    //final static float PI = 3.1425f;
//    static final float PI;
//    static{
//        PI = 3.1425f;
//    }
    public FinalMemebers(){
        final float PI = 3.1425f;
    }

    public static void main(String[] args){
        //System.out.println(PI);// displays error if you directly access without
        // using static key word. static methods cannot access non-static members of class.
    }
}
