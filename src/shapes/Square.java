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
        return this.length*4;
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }
    }
