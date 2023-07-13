public class Rectangle {
    int length;
    int breadth;
    Rectangle(){
        length=breadth=1;
    }
    Rectangle(int l, int b){
        length=l;
        breadth=b;
    }
}
class Cuboid extends Rectangle{
    int height;
    Cuboid(){
        height=1;
    }
    Cuboid(int h){
        super(4,5);
        height=h;
    }
    int volume(){
        return length*breadth*height;
    }
}

class test{
    public static void main(String[] args){
//        Cuboid c = new Cuboid();
//        System.out.println(c.volume());
        Cuboid c1 = new Cuboid(2);
        System.out.println(c1.volume());


    }
}
