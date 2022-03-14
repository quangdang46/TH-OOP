import java.math.BigDecimal;
import java.util.Arrays;

public class Ex{
    public static int findMax(int arr[]){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int findMin(int arr[]){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    // sum all even numbers of an array
    public static int sumEven(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        return sum;
    }


    // count how many specific element in an array

    public static int count(int arr[], int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }


    // isPreme
    public static boolean isPrime(int x){
        if(x < 2){
            return false;
        }
        for(int i = 2; i*i <x; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

    //  count how many prime number in an array
    public static int countPrime(int arr[]){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(isPrime(arr[i])){
                count++;
            }
        }
        return count;
    }


    //find the index of an element k in an array, if the element doesn’t exist in an array return -1.
    public static int findIndex(int arr[], int k){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }

    // public static void square(int arr[]) to square all elements of an array
    public static void square(int arr[]){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
    }
    // to find the maximum value of an BigDecimal object array
    public static BigDecimal findMax(BigDecimal arr[]){
        BigDecimal max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i].compareTo(max) > 0){
                max = arr[i];
            }
        }
        return max;
    }

    // find the third largest element in an array
    public static int findThirdLargest(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length - 3];
    }

    //function public static int[] divisibleNumbers(int arr[], int k) to find the elements which divisible by k in an array. 
    public static int[] divisibleNumbers(int arr[], int k){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % k == 0){
                count++;
            }
        }
        int[] result = new int[count];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % k == 0){
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] a = new int[] { 1, 8, 2, 6, 4, 3, 7, 9 };

        //max array
        System.out.println("Max array: " + findMax(a));
        //min array
        System.out.println("Min array: " + findMin(a));
        //sum even array
        System.out.println("Sum even array: " + sumEven(a));
        //count specific element
        System.out.println("Count specific element: " + count(a, 8));
        //is prime
        System.out.println("Is prime: " + isPrime(5));

        //count prime
        System.out.println("Count prime: " + countPrime(a));
        //find index
        System.out.println("Find index: " + findIndex(a, 8));
        //square array
        square(a);
        System.out.println("Square array: " + Arrays.toString(a));
        //find max BigDecimal
       
        BigDecimal[] b = new BigDecimal[] { new BigDecimal(1), new BigDecimal(8), new BigDecimal(2), new BigDecimal(6), new BigDecimal(4), new BigDecimal(3), new BigDecimal(7), new BigDecimal(9) };
       
        System.out.println("Find max BigDecimal: " + findMax(b));
        //find third largest
        System.out.println("Find third largest: " + findThirdLargest(a));

        //divisible numbers
        System.out.println("Divisible numbers: " + Arrays.toString(divisibleNumbers(a, 3)));
    }
}