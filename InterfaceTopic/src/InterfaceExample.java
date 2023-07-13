class Phone {
    void call(){System.out.println("Phone calling");}
    void sms(){System.out.println("Phone sms");}
}

interface ICamera{
    void click();
    void record();
}
interface IMusicPlayer{
    void play();
    void stop();
}

class Smartphone extends Phone implements ICamera, IMusicPlayer{
    public void click(){System.out.println("Smart Phone Camera clicking");}
    public void record(){System.out.println("Smart phone camera recording");}
    public void play(){System.out.println("SmartPhone Music is playing");}
    public void stop(){System.out.println("SmartPhone music is stopped");}
    public void videoCall(){System.out.println("SmartPhone video calling");}
}

public class InterfaceExample {
    public static void main(String[] args){
        Smartphone sp = new Smartphone();
       IMusicPlayer music = sp;
       music.play();
       music.stop();
    }
}
