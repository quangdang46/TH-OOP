public class Ex1 {
    // check
    public static int index(int a[], int k) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static boolean new_remove(int[] a, int k) {
        if (index(a, k) == -1) {
            return false;
        }
        for (int i = k; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }

        return true;
    }

    // function to insert an element a specific position into an array
    public static void insert(int[] a, int k, int pos) {
        for (int i = a.length - 1; i > pos; i--) {
            a[i] = a[i - 1];
        }
        a[pos] = k;
    }

    // function to find the duplicate values of an array of integer values
    public static void findDuplicates(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (index(a, a[i]) != i) {
                System.out.println(a[i]);
            }
        }
    }

    // function to remove the duplicate values of an array of integer values
    public static void removeDuplicates(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (index(a, a[i]) != i) {
                new_remove(a, a[i]);
            }
        }
    }
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4,5, 5, 6, 7, 8, 9 };
        int k = 5;
        if (new_remove(arr, k)) {
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        insert(arr, k, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        findDuplicates(arr);
        removeDuplicates(arr);
        printArray(arr);
    }
}
