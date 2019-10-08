public class Square extends Rectangle{
    public Square();
    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return this.length;
    }

    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side){
        this.width = side;
    }

    public void setLength(double side){
        this.length = side;
    }

    public String toString(){
        return "Square[side=" + this.side + ",color="+ this.color + ",filled=" + this.filled + "]";
    }
}