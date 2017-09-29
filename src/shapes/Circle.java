package shapes;

public class Circle extends Shape{
    private double radius;
    private static int numberOfCircles;

    public Circle(double rad){
        radius = rad;
        numberOfCircles++;
    }

    @Override
    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }

    public double getArea(){
        double area = this.radius * this.radius * Math.PI;
        return area;
    }


    public static void displayNumOfCircles(){
        String plural = " circle.";
        if(numberOfCircles>1){plural = " circles.";}
        System.out.println("You made "+numberOfCircles+ plural);
    }


}
