package Array;

import java.util.Arrays;

public class Practice_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        System.out.println(sumofarr(arr));

        System.out.println(avgofarr(arr));

        System.out.println(evenOddCount(arr));

        printrevorder(arr);

        System.out.println(nthNode(arr, 4));

        System.out.println(nthNodefromLast(arr, 3));

        seprateoddeven(arr);

        seprateoddeveninnewArr(arr);

        System.out.println(Arrays.toString(bubblesort(arr)));

        System.out.println(secoundMax(arr));

        System.out.println(thirdMax(arr));

    }

    private static int thirdMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                thirdMax = secMax;
                secMax = max;
                max = arr[i];
            } else if (secMax < arr[i] && max!=arr[i]) {
                thirdMax= secMax;
                secMax = max;
            } else if (thirdMax < arr[i] && secMax!=arr[i]) {
                thirdMax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secMax);
        return thirdMax;
    }

    private static int secoundMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                secMax = max;
                max = arr[i];
            } else if (secMax < arr[i] && arr[i]!=max) {
                secMax = arr[i];
            }
        }
        System.out.println(max);
        return secMax;
    }

    private static int[] bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    

    private static void seprateoddeveninnewArr(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int[] arr2 = new int[arr.length];
        for (int k = 0; k < arr.length; k++) {
            if (arr[k]%2==0){
                arr2[j]=arr[k];
                j--;
            }else {
                arr2[i]=arr[k];
                i++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

    private static void seprateoddeven(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] % 2 == 0 && arr[j] % 2 != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else if (arr[j] % 2 == 0) {
                j--;
            } else if (arr[i] % 2 != 0) {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int nthNodefromLast(int[] arr, int i) {
        int len = arr.length - i + 1;
        try {
            return arr[len];
        } catch (Exception e) {
            System.out.println(i + " Node not Found");
            return -1;
        }
    }

    private static int nthNode(int[] arr, int i) {
        try {
            return arr[i - 1];
        } catch (Exception e) {
            System.out.println("Node not Found");
            return -1;
        }
    }

    private static void printrevorder(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    private static String evenOddCount(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return "Odd : " + odd + " Even : " + even;
    }

    private static int avgofarr(int[] arr) {
        return sumofarr(arr) / arr.length;
    }

    private static int sumofarr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


}
