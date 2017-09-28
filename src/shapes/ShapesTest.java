package shapes;

public class ShapesTest {
    public static void main(String[] args){
        Rectangle box1 =new Rectangle (5, 4);
        Rectangle box2 = new Square (5);
        Square box3 = new Square(7);

        System.out.println(box1.getArea()+"\n"+box1.getPerimeter());
        System.out.println(box2.getArea()+"\n"+box2.getPerimeter());
        showRectanglInfo(box1);
        showRectanglInfo(box2);
        showRectanglInfo(box3);
    }
    public static void showRectanglInfo(Rectangle rectangle){
        System.out.println("The area is "+rectangle.getArea()+", and the perimeter is "+rectangle.getPerimeter()+".");
    }
}
