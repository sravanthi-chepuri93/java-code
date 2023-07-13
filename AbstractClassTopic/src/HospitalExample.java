abstract class Hospital{
    abstract void emergency();
    abstract void billing();
    abstract void admit();
    abstract void appointment();
}
class MyHospital extends Hospital{

    @Override
    void emergency() {
        System.out.println("Emergency ward");
    }

    @Override
    void billing() {
        System.out.println("billing section");

    }

    @Override
    void admit() {
        System.out.println("admit room");

    }

    @Override
    void appointment() {
        System.out.println("appointment section");

    }
}

public class HospitalExample {
    public static void main(String[] args){
        Hospital hospital = new MyHospital();
        hospital.emergency();
        hospital.admit();
        hospital.billing();
        hospital.appointment();
    }

}
