class Car{
    public void start(){
        System.out.println("The car has started");
    }
    public void accelerate(){
        System.out.println("The car is accelerated");

    }
    public void ChangeGear(){
        System.out.println("manual transmission");
    }
}
class LuxuryCar extends Car{
    public void ChangeGear(){
        System.out.println("Automatic transmission");
    }
    public void OpenRoof(){
        System.out.println("Sunroof is added");
    }
}

public class ExampleCar {
    public static void main(String[] args){
        LuxuryCar luxuryCar = new LuxuryCar();
        luxuryCar.start();
        luxuryCar.accelerate();
        luxuryCar.ChangeGear();
        Car car = new LuxuryCar();


    }
}
