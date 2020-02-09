import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random generator = new Random(); // a random number generator
        int x = generator.nextInt(); // a random number
        System.out.println(x);
        int y = generator.nextInt(100); // between 0 and 99 included
        System.out.println(y);
        boolean b = generator.nextBoolean();
        System.out.println(b);
        double z = generator.nextDouble();
        System.out.println(z);

    }
}
