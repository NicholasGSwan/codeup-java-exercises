package shapes;

abstract class Quadralateral extends Shape implements Measurable {
    protected double length;
    protected double width;
    public Quadralateral(double length, double width){
        this.length = length;
        this.width =width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    abstract double setLength();
    abstract double setWidth();
}
