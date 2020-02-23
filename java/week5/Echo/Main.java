public class Main {

    public static void main(String[] args) {
        if (args.length == 1) {
            int girilenSayi = Integer.valueOf(args[0]);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < girilenSayi; i++) {
                sb.append(i).append(" ");
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("Kaca kadar sayacagimi bana soylemediniz");
        }
    }
}
