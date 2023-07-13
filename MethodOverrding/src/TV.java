public class TV {
    public void switchON(){
        System.out.println("TV is swithced ON");
    }
    public void changeChannel(){
        System.out.println("TV channel is changed");
    }

}
class SmartTV extends TV {
    public void switchON(){
        System.out.println("SmartTV is swithced ON");
    }
    public void changeChannel(){
        System.out.println("SmartTV channel is changed");
    }
    public void browsing(){
        System.out.println("smartTV is browsing");
    }
}
class testTV{
    public static void main(String[] args){
        TV tv = new SmartTV();
        tv.switchON();
        tv.changeChannel();

    }


}
