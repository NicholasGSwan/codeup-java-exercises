package shapes;

public class Square extends Quadrilateral {

    public Square (double side){
        super(side, side);
    }
    @Override
    void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    void setWidth(double side) {
        this.width = side;
        this.length= side;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
//    public Square(int side){
//        super(side, side);
//    }
//    public int getArea(){
//        return (int) Math.pow(length, 2);
//    }
//    public int getPerimeter(){
//        return 4*length;
    }
