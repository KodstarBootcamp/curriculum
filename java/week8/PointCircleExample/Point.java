public class Point {

    private static final int MAX_INSTANCE_COUNT = 1;
    private static int instanceCount = 0;
    private static Point singleton = null;

    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        Point.instanceCount++;
        setLocation(x, y);
    }

    public static int getInstanceCount() {
        return Point.instanceCount;
    }

    public static Point createPoint() {
        if (instanceCount < MAX_INSTANCE_COUNT) {
            singleton = new Point();
        }
        return singleton;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

}
