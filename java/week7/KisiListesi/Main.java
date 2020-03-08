import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {};
        int[] ages = {};
        while (true) {
            // Listeye eklenecek kişinin adı ve yaşı sorulacak
            System.out.println("Kisinin adini girin: ");
            String name = scanner.next();
            // Ad olarak cikis girildiğinde program sonlandırılacak
            if (name.equals("cikis")) {
                break;
            }
            System.out.println("Kisinin yasini girin: ");
            int age = scanner.nextInt();
            names = addName(names, name);
            ages = addAge(ages, age);
            printTable(names, ages);
        }
    }

    public static int[] addAge(int[] ages, int age) {
        ages = Arrays.copyOf(ages, ages.length + 1);
        ages[ages.length - 1] = age;
        return ages;
    }

    public static String[] addName(String[] names, String name) {
        names = Arrays.copyOf(names, names.length + 1);
        names[names.length - 1] = name;
        return names;
    }

    public static void printTable(String[] namesToPrint, int[] agesToPrint) {
        //  Her ekleme yapıldıktan sonra
        //  Kişi ve yaş listesi formatlı gösterilecek
        //  Başlık satırı gösterilecek (Ad, Yaş)
        System.out.printf("%-20s %-20s\n", "Ad", "Yas");
        System.out.printf("%-20s %-20s\n", "-".repeat(20), "-".repeat(20));
        float sum = 0;
        for (int i = 0; i < namesToPrint.length; i++) {
            System.out.printf("%-20s %-20d\n", namesToPrint[i], agesToPrint[i]);
            sum += agesToPrint[i];
        }
        //  Son satırda yaş ortalaması gösterilecek
        System.out.printf("%-20s %-17.2f\n", "ORTALAMA", (sum / agesToPrint.length));
    }
}
