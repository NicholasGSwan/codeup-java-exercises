package shapes;
import util.Input;


public class CircleApp {
    public static void main(String[] args){
        Input input = new Input();
        boolean userBool = false;

        while(true) {
            System.out.println("Enter the radius of the circle");
            Circle thisCircle = new Circle(input.getDouble());
            System.out.println("The area of the circle is:" + thisCircle.getArea() + "\nThe circumference is: " + thisCircle.getPerimeter() + ".");
            System.out.println("Would you like to make another circle?");
            userBool = input.yesNo();
            if (!userBool){
                Circle.displayNumOfCircles();
                break;
            }
        }
    }
}
