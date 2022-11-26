package ValidAnagram;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        if (s.equals(t)) return true;

        int[] charArray = new int[256];

        for (int i = 0; i < s.length(); i++) {

                charArray[s.charAt(i)]++;
                charArray[t.charAt(i)]--;
        }

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != 0) return false;
        }

        return true;

    }
}
