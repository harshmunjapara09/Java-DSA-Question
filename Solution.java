import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        String s = "abcba";
        String target = "abc";
        System.out.println(rearrangeCharacters(s,target));
    }
    public static int rearrangeCharacters(String s, String target) {
        ArrayList<Character> list = new ArrayList<>();
        char[] arr1 = s.toCharArray();
        char[] arr2 = target.toCharArray();
        for (char c : arr1) {
            for (char value : arr2) {
                if (c == value) {
                    list.add(c);
                }
            }
        }
        return 0;
    }
}