public class Main {

    public static String theEnd(String str, boolean front) {
        if (front) return str.substring(0,1);
        return str.substring(str.length()-1);
    }

    //  Tercih edilen kullanim
    //     her zaman suslu parantex
    //     metoddan tek cikis
    public static String theEndAlternative(String str, boolean front) {
        String result;
        if (front) {
            result = str.substring(0,1);
        } else {
            result = str.substring(str.length()-1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(theEnd("test", true));
    }
}
