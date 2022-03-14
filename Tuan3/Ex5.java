
public class Ex5 {
    /*
    Write a program to count how many times one word appears in the paragraph. Expect result is 
    the 2-dimension array in which the first column contains only one word, and the second column 
    contains its frequency. Words are not case-sensitive.
    */
    public static boolean new_equal(String s1, String s2){
        return s1.toLowerCase().equals(s2.toLowerCase());
    }
    public static void Count(String s){
        String[] str = s.split("\\.|\\,|\\s");

        int[] cnt = new int[str.length];
        for(int i = 0; i < str.length; i++){
            cnt[i]=1;
        }
        for (int i = 0; i < str.length-1;i++) {
            for (int j = i+1; j <str.length; j++) {
                if(new_equal(str[i],str[j])){
                    cnt[i]++;
                    str[j]="";
                }
            }
        }
        int sz=0;
        for (int i = 0; i < str.length; i++) {
            if(!str[i].equals("")){
                if(sz!=0){
                    System.out.println(",");
                }
                sz++;
                System.out.print("'"+str[i]+"': "+cnt[i]);
            }
        }

    }
    public static void main(String[] args) {
        String s = "You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it.";
        Count(s);

    }

}
