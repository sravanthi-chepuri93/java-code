class Outer{
    int x=10;
    class Inner{
        int y=15;
        public void innerDisplay(){
            System.out.println(x+" and "+y);
        }
    }
    public void OuterDisplay(){
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);

    }
}



public class NestedInner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.OuterDisplay();
        Outer.Inner oi = new Outer(). new Inner();
        oi.innerDisplay();
        }
    }
