import java.util.HashSet;

class Solution {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }
    public static char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();

        for (Character c: s.toCharArray()) {
            if (set.contains(c)){
                return c;
            }else {
                set.add(c);
            }
        }
        return ' ';
    }
}