
public class JavaBasic {
    public static int sumNegativeElements(int a[]) {
        // sinh vien code tai day
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    public static String uppercaseFirstVowels(String str) {
        // sinh vien code tai day
        String[] cnt = str.split("");
        String[] names = { "a", "i", "e", "o", "u" };
        String ans = "";
        for (int i = 0; i < cnt.length; i++) {
            boolean check = false;
            for (int j = 0; j < names.length; j++) {
                if (names[j].equalsIgnoreCase(cnt[i])) {
                    check = true;
                    break;
                }
            }
            if (check && (i == 0 || cnt[i - 1].equals(" "))) {
                ans += cnt[i].toUpperCase();
            } else {
                ans += cnt[i].toLowerCase();
            }
        }
        return ans;

    }

    public static int findMinNegativeElement(int a[]) {
        if (a.length == 0)
            return -1;
        // sinh vien code tai day
        int min = a[0];
        boolean found = false;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min && a[i] < 0) {
                found = true;
                min = a[i];
            }
        }
        if (!found && a[0] >= 0) {
            return -1;
        }
        return min;
    }

    public static String getName(String str){
    //sinh vien code tai day
        String[] names=str.split(":");
        return names[1].trim();
    }

    public static int findFirstMod3Element(int[] a){
    //sinh vien code tai daye
        if(a.length==0) return -1;
        for (int i= 0; i <a.length; i++) {
            if(a[i]<0 && a[i]%3==0) {            
                return a[i];
            }
        }
        return -1;
    }



    public static int countString(String str, String k){
    //sinh vien code tai day
        String[] names = str.split(" ");
        int cnt=0;
        for(int i=0; i<names.length; i++){
            if(names[i].equalsIgnoreCase(k)){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int a[] = {1,-2,3,4,-2,1,-9};
        //sinh vien code tai day
        String s = "nguyen thi uyen an";
        //sinh vien code tai day
        String s1 = "Ho ten: Nguyen Thi Anh Dao";
        //sinh vien code tai day
        String s2 = "Nguyen Phuong Hoang Anh Phuong Oanh";
        //sinh vien code tai day

    }

}