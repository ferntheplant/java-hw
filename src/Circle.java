import Shape.Shape;

public class Circle extends Shape {
  public double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return this.radius *this.radius * Math.PI;
  };

  public double getPerimeter() {
    return this.radius * 2 * Math.PI;
  };

  public static void main(String[] args) throws Exception {
    Circle x = new Circle(5.0);
    Circle y = new Circle(3.0);

    System.out.println(x.otherFitsInside(y));
  }
}