public class Main {

    public static int addNumbersUpTo(int max) {
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
	int upToTen = addNumbersUpTo(10);
        System.out.println(upToTen);
        System.out.println(addNumbersUpTo(5));
    }
}
