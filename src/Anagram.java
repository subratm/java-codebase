import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] chArr1 = s1.toLowerCase().toCharArray();
        char[] chArr2 = s2.toLowerCase().toCharArray();
        Arrays.sort(chArr1);
        Arrays.sort(chArr2);
        return Arrays.equals(chArr1, chArr2);
    }
    public static void main(String[] args) {
        boolean result = isAnagram("Hello", "Ehllo");
        System.out.println(result);
    }
}
