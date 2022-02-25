public class Ex13 {
    public static boolean Is_palidom(int n){
        String nString = Integer.toString(n);
        int length = nString.length();
        int left = 0;
        int right = length-1;
        while(left < right){
            if(nString.charAt(left) != nString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Is_palidom(12345));
        System.out.println(Is_palidom(123422219));    
        System.out.println(Is_palidom(1234321));
    }
}
