package String;

public class StringQue {

    public static void main(String[] args) {

//        String str = "racecar";
//        System.out.println(palindrome(str));
//        System.out.println(palindrome_2(str));

//        String path = "NSWNSESNNSWES";
//        System.out.println(getSortestPath(path));

//        String str = "Hello, Harsh Munjapara";
//        System.out.println(str.substring(1,4));
////        User Defind Funcation
//        getSubString(str,1,4);

//        String[] str = {"Apple" , "Mongo" , "Banana"};
//        getLargestString(str);

//        String str = "hii, harsh munjapara";
//        System.out.println(getUpperCase(str));

//        String str = "wwaahhhee";
//        System.out.println(getCompression(str));

//        String str = "harshMuNJapara";
//        System.out.println(getLowerCase(str));


//        String str  = "Harsh Munjapara";
//        String ans = reverse(str);
//        System.out.println(ans);

//        String str  = "racecar";
//        String str1  = "harsh";
//        Boolean ans = palindrome1(str);
//        System.out.println(ans);

//        String str  = "He is good boy";
//        int ans = countWord(str);
//        System.out.println(ans);

//        String str = "bcabc";
//        findduplicate(str);

//        String s1 = "Hars11";
//        String s2 = "Harsh1";
//        isSameOrNOt(s1,s2);

//        String str = "Harsh";
//        char [] arr = str.toCharArray();
//        char oldS = 'a';
//        char newS = 'H';
//        replace(str,arr,oldS,newS);

//        String str = "AabcBEDAS";
//        sortedStr(str);

//        String str = "Harsh is Good Boy";
//        frequencyCount(str);

//        String str = "HArsh";
//        removeVowels(str);

//        String str ="let's Munjapara harsh ";
//        System.out.println(Arrays.toString(revserseWord(str)));

//        String str = "Harsh5 is2 a3 Good4 Boy1";
//        removeDigit(str);

//        String str1 = "Harsh Munjapara";
//        String str2 = "Harsh";
//        MergeString(str1, str2);

//        String str = "manam racecar";
//        allWordPalindrome(str);

//        String str ="harsh1234";
//        System.out.println(checkNumAndChar(str));

//        String str = "kkevin";
//        removeDuplicate(str);
    }

    public static void removeDuplicate(String str) {
        boolean[] arr = new boolean[128];
        String str1 = "";
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(arr[ascii]==false){
                str1+=ch;
                arr[ascii]=true;
            }
        }
            System.out.println(str1);
    }

    public static Boolean checkNumAndChar(String str) {
        str = str.replaceAll("\\d", "-");
        int digit = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                digit++;
            }
        }
        int character = str.length() - digit;
        if (digit == character) {
            return true;
        }
        return false;
    }

    public static void allWordPalindrome(String str) {
        str = str.trim();
        String[] arr = str.split(" ");
        for (String s : arr) {
            if (palindrome1(s) == false) {
                System.out.println("String is't Palindrome");
                return;
            }
        }
        System.out.println("String is Palindrome");
    }

    public static void MergeString(String str1, String str2) {
        StringBuilder s1 = new StringBuilder();
        int n1 = str1.length();
        int n2 = str2.length();
        int maxlength = Math.max(n1, n2);
        for (int i = 0; i < maxlength; i++) {
            if (i < n1) {
                s1.append(str1.charAt(i));
            }
            if (i < n2) {
                s1.append(str2.charAt(i));
            }
        }
        System.out.println(s1.toString());
    }

    public static void removeDigit(String str) {


        str = str.replaceAll("\\d", "");
        System.out.println(str);

//        char[] ch = str.toCharArray();
//        for (char s : ch) {
//            if (!Character.isDigit(s)) {
//                System.out.print(s);
//            }
//        }
    }

    public static String[] revserseWord(String str) {
        str = str.trim();
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverse(arr[i]);
        }
        return arr;
    }


    public static void removeVowels(String str) {
        str = str.replace("a", "");
        str = str.replace("e", "");
        str = str.replace("i", "");
        str = str.replace("o", "");
        str = str.replace("u", "");
        str = str.replace("A", "");
        str = str.replace("E", "");
        str = str.replace("I", "");
        str = str.replace("O", "");
        str = str.replace("U", "");
        System.out.println(str);
    }

    public static void frequencyCount(String str) {
        int n = str.length();
        int[] arr = new int[128];
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            int ascii = (int) c;
            int existing = arr[ascii];
            arr[ascii] = existing + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println((char) i + " " + arr[i]);
            }
        }
    }

    public static void sortedStr(String str) {
        int n = str.length();
        int[] arr = new int[128];
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            int ascii = (int) c;
            int existing = arr[ascii];
            arr[ascii] = existing + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                System.out.print((char) i + " ");
            }
            if (arr[i] > 1) {
                int duptotal = arr[i];
                for (int j = 0; j < duptotal - 1; j++) {
                    System.out.print((char) i + " ");
                }
            }


        }
    }

    private static void replace(String str, char[] arr, char oldS, char newS) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldS) {
                arr[i] = newS;
            }
        }
        String newStr = new String(arr);
        System.out.println(newStr);
    }


    public static void isSameOrNOt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println("Not Same");
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                System.out.println("Not Same");
                return;
            }
        }
        System.out.println("Same");
    }

//    public static void findduplicate(String str) {
//        int arr[] = new int[128];
//        int n = str.length();
//
//        for (int i = 0; i < n; i++) {
//            int ascii = (int) str.charAt(i);
//
//            if (arr[ascii] == 0) {
//                arr[ascii] = arr[ascii] + 1;
//            } else if (arr[ascii] == 1) {
//                arr[ascii] = arr[ascii] + 1;
//                char c = str.charAt(i);
//                if(c!=' '){
//                System.out.print(c );
//                }
//            }
//        }
//
//    }

    public static void findduplicate(String str) {
        int n = str.length();
        for (int i = 0; i <= n; i++) {

            for (int j = i + 1; j < n; j++) {
                if ((str.charAt(i) == str.charAt(j) && str.charAt(i) != ' ')) {
                    if (str.charAt(i) != ' ') {
                        System.out.print(str.charAt(i));
                    }
                    int k = i;
                    while (k < n) {
                        if (str.charAt(k) == str.charAt(i)) {
                            str = str.replace(str.charAt(k), ' ');
                        }
                        k++;
                    }
                }

            }

        }
    }

    public static int countWord(String str) {
        String[] arr = str.split(" ");

        return arr.length;
    }

    private static Boolean palindrome1(String str) {
        int n = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String reverse(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        str = new String(arr);
        return str;
    }


    public static boolean palindrome(String str) {
        int n = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    //Palindrome String Builder
    public static boolean palindrome_2(String str) {
        StringBuilder string1 = new StringBuilder(str);
        String str1 = string1.toString();
        String rev = string1.reverse().toString();
        if (str1.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }

    public static float getSortestPath(String path) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            if (ch == 'N') {
                y++;
            } else if (ch == 'S') {
                y--;
            } else if (ch == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void getSubString(String str, int start, int end) {
        String subString = "";
        for (int i = start; i < end; i++) {
            subString += str.charAt(i);
        }
        System.out.println(subString);
    }

    private static void getLargestString(String[] str) {
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }
        System.out.println(largest);
    }

    public static String getUpperCase(String str) {
        StringBuilder s1 = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        s1.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                s1.append(str.charAt(i));
                i++;
                s1.append(Character.toUpperCase(str.charAt(i)));
            } else {
                s1.append(str.charAt(i));
            }
        }
        return s1.toString();
    }

    public static String getCompression(String str) {
        StringBuilder s1 = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            s1.append(str.charAt(i));
            if (count > 1) {
                s1.append(count);
            }
        }
        return s1.toString();
    }

    public static int getLowerCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.toLowerCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

}
