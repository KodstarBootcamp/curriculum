import java.util.Arrays;

public class Main {

    public static void doSth (int intParam, int[] arr) {
        arr[0] = 100;
        intParam = 100;
    }

    //  int turunde parametre, pass by value
    //  Array turunde parametre, pass by reference
    public static void main(String[] args) {
        int newInt = 1;
	    int[] newArr = {1, 2, 3};
	    doSth(newInt, newArr);
        System.out.println(newInt + " " + Arrays.toString(newArr));
    }
}
