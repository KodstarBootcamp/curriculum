public class Main {

    public static void printPyramidRow(int row, int maxHeight) {
        for (int i = 0; i < (maxHeight - row); i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= row; i++) {
            System.out.print(i);
        }
        for (int i = (row - 1); i >= 1; i--) {
            System.out.print(i);
        }
    }

    public static void printPyramid(int height) {
        for (int i = 1; i <= height; i++) {
            printPyramidRow(i, height);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
	printPyramid(5);
        printPyramid(6);
    }
}
