import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static int maxEven(int[] a) {
        if (a.length == 0)
            return -1;
        int max = 0;
        boolean check = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                check = true;
                max = a[i];
                break;
            }
        }
        if (!check)
            return -1;
        else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0 && a[i] > max) {
                    max = a[i];
                }
            }
        }
        return max;
    }

    public static int minOdd(int[] a) {
        if (a.length == 0)
            return -1;
        int min = 0;
        boolean check = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                check = true;
                min = a[i];
                break;
            }
        }
        if (!check)
            return -1;
        else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0 && a[i] < min) {
                    min = a[i];
                }
            }
        }
        return min;
    }

    public static int sumMEMO(int[] a) {
        int max, min;
        max = maxEven(a) != -1 ? maxEven(a) : 0;
        min = minOdd(a) != -1 ? minOdd(a) : 0;
        return max + min;
    }

    public static int sumEven(int[] a) {
        int sum = 0;
        if (a.length == 0)
            return 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    public static int prodOdd(int[] a) {
        if (a.length == 0)
            return 0;
        int prod = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                prod *= a[i];
            }
        }
        return prod;
    }

    public static int idxFirstEven(int[] a) {
        if (a.length == 0)
            return -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                return i;
        }
        return -1;
    }

    public static int idxLastOdd(int[] a) {
        if (a.length == 0)
            return -1;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 != 0)
                return i;
        }
        return -1;
    }

    public static int[] input(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 7 };
        System.out.println("the greatest even number:" + maxEven(a));
        System.out.println("the smallest odd number:" + minOdd(a));
        System.out.println("sum of the greatest even number and the smallest odd:" + sumMEMO(a));
        System.out.println("sum of even numbers:" + sumEven(a));
        System.out.println("product of odd numbers:" + prodOdd(a));
        System.out.println("the position of the first even:" + idxFirstEven(a));
        System.out.println("the position of the last odd:" + idxLastOdd(a));
        System.out.println("Nhap n:");
        int n = sc.nextInt();
        int arr[] = input(n);
        System.out.println("Array:" + Arrays.toString(arr));
    }

}