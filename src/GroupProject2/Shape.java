package GroupProject2;

public interface Shape {
    void calculateArea(double a);
    void calcilatePerimeter(double a);

}
class Circle implements Shape{

    @Override
    public void calculateArea(double a) {
        System.out.println("The area of circle is "+Math.PI*a*a);
    }

    @Override
    public void calcilatePerimeter(double radius) {
        System.out.println("The perimeter of circle is"+(2*Math.PI*radius));
    }
}
class Square implements Shape{

    @Override
    public void calculateArea(double a) {
        System.out.println("The area od square is "+(a*a));
    }

    @Override
    public void calcilatePerimeter(double a) {
        System.out.println("The perimeter of square is "+(4*a));
    }
}
class TestShape{
    public static void main(String[] args) {
        Shape circle=new Circle();
        circle.calculateArea(5);
        circle.calcilatePerimeter(4);
        Shape square=new Square();
        square.calculateArea(5);
        square.calcilatePerimeter(5);
    }
}