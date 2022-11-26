package ValidAnagram;


import static ValidAnagram.Solution.isAnagram;

public class Main {
    public static void main(String[] args) {
        boolean check = isAnagram("aacc","ccac");
        System.out.println(check);
    }
}
