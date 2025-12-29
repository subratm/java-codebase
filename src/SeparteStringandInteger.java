import java.util.Arrays;

public class SeparteStringandInteger {
    public static void main(String[] args) {
        String input = "1hello8";
        StringBuilder numbers = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        for(char c : input.toCharArray()){
            if(Character.isLetter(c)){
                letters.append(c);
            }
            else {
                Character.isDigit(c);
                numbers.append(c);
            }
        }
        System.out.println(letters);
        System.out.println(numbers);

    }
}
