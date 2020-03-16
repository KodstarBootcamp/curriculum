public class Circle {
    private Point center;
    private int radius;

    public Circle() {
        this (new Point(0, 0), 1);
    }

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(Point p) {
        return center.distance(p) < radius;
    }

    public boolean intersects(Circle other) {
        return center.distance(other.center) < (radius + other.radius);
    }
}
