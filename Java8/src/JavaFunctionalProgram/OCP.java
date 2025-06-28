package JavaFunctionalProgram;


interface Shape {
     double calArea();
}

class Circle implements Shape{

    double radius;
    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calArea() {
        return Math.PI*radius*radius;
    }
    
}

class RectangleArea implements Shape{
    double rad,width;

    RectangleArea(double rad,double width){
        this.rad=rad;
        this.width=width;
    }

    @Override
    public double calArea() {
        return rad*width;
    }
    
}

public class OCP {
    public static void main(String[] args) {
        System.out.println("This is Circle : ");
        Shape shape=new Circle(16);
        System.out.println(shape.calArea());

        System.out.println("\nThis is Rectangle: ");
        shape= new RectangleArea(12, 4);
        System.out.println(shape.calArea());
    }

}
