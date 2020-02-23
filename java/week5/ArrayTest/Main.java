import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
		int[] arr = {8, 3, 5, 1, 10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int indexOfOne = Arrays.binarySearch(arr, 10);
        System.out.println(indexOfOne);
    }

}
