class Hondacity{
    static long price = 10;
    int a, b;
    static double OnRoadPrice(String city){
        switch(city){
            case " Delhi":
                return price+price*0.1;
            case "Mumbai":
                return price+price*0.2;
            case "Kolkata":
                return price + price*0.3;
        }
        return 0.0;

    }

}

public class Main {
    public static void main(String[] args) {
        Hondacity h1 = new Hondacity();
        Hondacity h2 = new Hondacity();
        System.out.println(h1.price);
        System.out.println(h2.price);
        h1.price = 20;
        System.out.println(h1.price);
        System.out.println(h2.price);


    }
}