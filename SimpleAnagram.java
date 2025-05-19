public class SimpleAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean result = isAnagram(str1, str2);
        System.out.println("Are the strings anagrams: " + result);
    }

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[26]; 

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
