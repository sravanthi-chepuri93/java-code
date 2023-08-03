public class ExceptionDemo2 {
    public static void main(String[] args){
        int[] A = {10,20,30,0,50};
        try{
            int c = A[2]/A[1];
            System.out.println(A[7]);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be Zero, try again:");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is invalid");
        }
    }
}
