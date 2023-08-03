import java.util.Scanner;
public class ExceptionDemo {
    public static void main(String[] args){
        int a, b, c;
        System.out.println("Please enter two numbers here:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be zero. try again");

        }
        System.out.println("bye");
    }
}
