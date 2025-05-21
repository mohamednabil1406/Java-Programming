 public class CountCharacters {
    public static void main(String[] args) {
        String s = "Hello123 @#";
        int letters = 0, digits = 0, spaces = 0, special = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) letters++;
            else if (Character.isDigit(ch)) digits++;
            else if (Character.isWhitespace(ch)) spaces++;
            else special++;
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Special Characters: " + special);
    }
}

