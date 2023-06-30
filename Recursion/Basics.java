package Recursion;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

public class Basics {
    public static void main(String[] args) {
//        int n = 5;

//        System.out.println("Print Number in Decreasing Order");
//        printDecreasing(n);

//        System.out.println("Print Number in Increasing Order");
//        printIncreasing(n);

//        System.out.println("N number of factorial");
//        System.out.println(factorial(n));

//        System.out.println("Print Sum of Number");
//        System.out.println(sumofNumber(n));

//        System.out.println("Fibonacci Number ");
//        System.out.println(fibonacci(n));

//        int[] arr = {6,7,8,9,10};
//        System.out.println(check_Sorted(arr,0));

//        int [] arr = {2,5,7,4,9,3,24,5,10};
//        int key =10;
//        System.out.println(firstOccurence(arr,key,0));

//        int [] arr = {7,7,7,7,7,7};
//        int key =1;
//        ArrayList<Integer> list = new ArrayList<>();
//        One Way
//        System.out.println(lastOccurence(arr,list,key,0));
//        Secound Way
//        System.out.println(lastOccurence1(arr,key,0));

//        int n = 2;
//        int power = 10;
////        One Way
//        System.out.println(findPower(n, power, 1));
////        Secound Way
//        System.out.println(findPower1(n, power));
////        Third Way Optimize
//        System.out.println(optimizeFindPower(n,power));

//        int n= 5;
//        System.out.println(tiling(n));

//        int[] arr = {1, 2, 3, 4, 5, 2, 5, 6, 2, 2, 6, 6};
//        int key = 2;
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(findKeyIndex(arr, key, 0, list));

//        int n = 982002;
//        StringBuilder s = new StringBuilder();
//        System.out.println(numberConvertString(n,s));

//        int n=3;
//        System.out.println(friendPairing(n));


        int [] arr ={1,2,3,4,5,6,7,8};
        int target = 12;
        System.out.println(Search(arr,target,0,arr.length-1));

    }

    public static int Search(int[] arr,int target,int si,int ei) {
        if (si > ei){
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid]==target){
            return mid;
        }

        if (target < arr[mid]){
            return Search(arr,target,si,mid-1);
        }
        return Search(arr,target,mid+1,ei);
    }

    private static int friendPairing(int n) {
        if (n==1 || n==2){
            return n;
        }
        return  friendPairing(n-1) + (n-1) * friendPairing(n-2);
    }

    private static String numberConvertString(int n,StringBuilder s) {
        if (n==0){
            s.reverse();
            return "";
        }
        int last = n % 10;
        switch (last){
            case 0 :
                s.append("zero ");
                break;

            case 1 :
                s.append("one ");
                break;

            case 2 :
                s.append("two ");
                break;

            case 3 :
                s.append("three ");
                break;

            case 4 :
                s.append("four ");
                break;

            case 5 :
                s.append("five ");
                break;

            case 6 :
                s.append("six ");
                break;

            case 7 :
                s.append("seven ");
                break;

            case 8 :
                s.append("eight ");
                break;

            case 9 :
                s.append("nine ");
                break;

        }
        n = n/10;
        numberConvertString(n,s);
        StringBuilder s11 = new StringBuilder();
        String [] arr = s.toString().split(" ");
        for (String s1 : arr){
            s11.append(replace(s1)).append(" ");
        }
        return s11.toString().trim();
    }

    private static String replace(String s1) {
        char [] arr = s1.toCharArray();
        StringBuilder s = new StringBuilder();
        int left =0;
        int right= s1.length()-1;
        while (left < right){
            char temp = arr[left];
            arr[left]= arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for (int i = 0; i < arr.length; i++) {
            s.append(arr[i]);
        }
        return s.toString();
    }

    public static List<Integer> findKeyIndex(int[] arr, int key, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == key) {
            list.add(i);
        }
        findKeyIndex(arr, key, i + 1, list);
        return list;
    }

    public static int tiling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = tiling(n - 1);
        int fnm2 = tiling(n - 2);

        int total = fnm1 + fnm2;
        return total;
    }

    public static int optimizeFindPower(int n, int power) {
        if (power == 0) {
            return 1;
        }
        int halfpower = optimizeFindPower(n, power / 2);
        int fullpower = halfpower * halfpower;

        if (power % 2 != 0) {
            fullpower = n * fullpower;
        }
        return fullpower;
    }

    public static int findPower1(int n, int power) {
        int ans = 1;
        if (power == 0) {
            return ans;
        }
        ans = n * findPower1(n, power - 1);
        return ans;
    }

    public static int findPower(int n, int power, int ans) {
        if (power == 0) {
            return ans;
        }
        ans = ans * n;
        return findPower(n, power - 1, ans);
    }

    public static int lastOccurence1(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence1(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int lastOccurence(int[] arr, ArrayList<Integer> list, int key, int i) {
        if (list.isEmpty()) {
            return -1;
        }
        if (i == arr.length) {
            return list.get(list.size() - 1);
        }
        if (arr[i] == key) {
            list.add(i);
        }
        return lastOccurence(arr, list, key, i + 1);
    }

    public static int firstOccurence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    public static boolean check_Sorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return check_Sorted(arr, i + 1);
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fib1 = fibonacci(n - 1);
        int fib2 = fibonacci(n - 2);
        int fn = fib1 + fib2;
        return fn;
    }

    public static int sumofNumber(int n) {
        if (n == 1) {
            return 1;
        }
        int smn = sumofNumber(n - 1);
        int sn = n + sumofNumber(n - 1);
        return sn;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fmn = factorial(n - 1);
        int fn = n * factorial(n - 1);
        return fn;
    }

    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }

    public static void printDecreasing(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }


}
