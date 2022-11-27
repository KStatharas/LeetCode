package ValidPalindrome;

public class Solution {
    public static boolean isPalindrome(String s) {

        String sFiltered = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        for (int i = 0, j = sFiltered.length()-1; i < j ; i ++, j--) {
            if(sFiltered.charAt(i) != sFiltered.charAt(j)) return false;
        }
        return true;
    }
}
