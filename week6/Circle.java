public class Circle extends Shape{
    protected static final double PI = 3.14;
    protected double radius;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return this.radius*this.radius*PI;
    }

    public double getPerimeter(){
        return this.radius*2*PI;
    }

    public String toString(){
        return "Circle[radius=" + this.radius + ",color="+ this.color + ",filled=" + this.filled + "]";
    }
} 