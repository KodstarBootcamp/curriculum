public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            if (i == 5) {
                System.out.println("Break");
                System.exit(1);
            }
            System.out.println(i);
            i++;
        }
        System.out.println("End of main");
    }
}
