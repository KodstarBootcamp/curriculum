import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[][] rectArr = new int[2][3];
        for (int i = 0; i < rectArr.length; i++) {
            for (int j = 0; j < rectArr[i].length; j++) {
                rectArr[i][j] = (i * 100) + (j * 10);
            }
        }
        for (int i = 0; i < rectArr.length; i++) {
            System.out.println(Arrays.toString(rectArr[i]));
        }

        int[][] nonRectArr = new int[3][];
        nonRectArr[0] = new int[2];
        nonRectArr[1] = new int[3];
        nonRectArr[2] = new int[4];

        int[][][] threeDimArr = new int[2][][];
    }
}
