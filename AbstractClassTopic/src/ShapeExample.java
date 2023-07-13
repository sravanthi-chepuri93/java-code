abstract class Shape{
    abstract double perimeter();
    abstract double area();
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    double area() {
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
    int length;
    int breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double perimeter() {
        return 2*(length+breadth);
    }
    @Override
    double area() {
        return length*breadth;
    }
}
public class ShapeExample {
    public static void main(String[] args){
        Shape Circle;
        Circle = new Circle(2.5);
        System.out.println(Circle.perimeter());
        System.out.println(Circle.area());
        Shape Rectangle = new Rectangle(3,7);
        System.out.println(Rectangle.perimeter());
        System.out.println(Rectangle.area());



    }


}

