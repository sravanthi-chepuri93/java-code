
class CoffeeMachine{
    private float CoffeeQty;
    private float waterQty;

    static private CoffeeMachine our= null;

    private CoffeeMachine(){
        CoffeeQty = 1;
        waterQty = 1;
    }

    static public CoffeeMachine getInstance(){
        if(our==null)
            our = new CoffeeMachine();
            return our;
    }
}

public class SingletonClass {
    public static void main(String[] args){
        CoffeeMachine c = CoffeeMachine.getInstance();
        System.out.println(c);
        System.out.println("hi");

    }
}
