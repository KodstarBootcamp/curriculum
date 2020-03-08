public class Main {

    public static void main(String[] args) {
	    Point firstPoint = new Point();
	    Point secondPoint = new Point(2, 3);
	    firstPoint.translate(2, 2);
	    secondPoint.setLocation(5, 6);
		System.out.println(firstPoint.distance(secondPoint));
    }
}
