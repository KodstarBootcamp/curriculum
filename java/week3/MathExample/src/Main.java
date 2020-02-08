public class Main {

    public static void main(String[] args) {
        int secretNumber = (int)(Math.random() * 100);
        System.out.println(secretNumber);

        double radius = 1.0;
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println(area);

        int x1 = 1, y1 = 1, x2 = 4, y2 = 5;
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println(distance);
    }
}
