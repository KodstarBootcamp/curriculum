public class Main {

    public static void main(String[] args) {
        if (args.length == 1) {
            String number = args[0];
            System.out.println("Digit histogram for : " + number);
            int[] digitFreq = calculateDigitsHistogram(number);
            printDigitsHistogram(digitFreq);
        } else {
            System.out.println("Lutfen bir sayi girin");
            System.exit(-1);
        }
    }

    public static int[] calculateDigitsHistogram(String number) {
        int[] digitFreq = new int[10];
        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(number.charAt(i))) {
                // int digitIndex = number.charAt(i) - '0';
                int index = Integer.valueOf(number.charAt(i) + "");
                digitFreq[index]++;
            } else {
                System.out.println("Girdiginiz deger bir sayi degil");
                System.exit(-1);
            }
        }
        return digitFreq;
    }

    public static void printDigitsHistogram(int[] digitsHistogram) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digitsHistogram.length; i++) {
            sb.append(i).append(" ");
            for (int j = 0; j < digitsHistogram[i]; j++) {
                sb.append("*");
            }
            sb.append("\n");
            // sb.append(System.lineSeparator());
        }
        System.out.println(sb.toString());
    }
}
