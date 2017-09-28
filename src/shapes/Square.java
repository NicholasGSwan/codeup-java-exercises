package shapes;

public class Square extends Rectangle {
    private int side;
    public Square(int side){
        super(side, side);
        this.side = this.getLength();
    }
    public int getArea(){
        return (int) Math.pow(side, 2);
    }
    public int getPerimeter(){
        return 4*side;
    }
}
