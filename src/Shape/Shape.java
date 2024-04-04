package Shape;

public abstract class Shape {
  abstract public double getArea();
  abstract public double getPerimeter();
  public boolean otherFitsInside(Shape other) {
    return this.getArea() < other.getArea() && this.getPerimeter() < other.getPerimeter(); 
  }}
