import Shape.Shape;

public class Rectangle extends Shape {
  public double length;
  public double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double getArea() {
    return this.length * this.width;
  };

  public double getPerimeter() {
    return this.length * 2 + this.width * 2;
  };

  public static void main(String[] args) throws Exception {
    Rectangle x = new Rectangle(5.0, 3.0);
    Rectangle y = new Rectangle(3.0, 1.0);

    System.out.println(x.otherFitsInside(y));
  }
}
