import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static boolean check(HashMap<String, String> map, String key){
        if(map.containsKey(key)){
            return true;
        }
        return false;
    }
    public static String getValue(HashMap<String, String> map,String s){
        return map.get(s);
    }
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("dog","cho");
        map.put("cat","meo");
        map.put("bird","chim");
        map.put("fish","ca");
        map.put("horse","xe");
        map.put("cow","bo");
        map.put("pig","heo");
        map.put("sheep","he");
        map.put("chicken","ga");
        map.put("duck","con cái");
        System.out.println("Nhap tu can tim nghia:");
        String s=new Scanner(System.in).nextLine();        
        if(check(map,s)){
            System.out.println("Tu "+s+" co nghia la: "+getValue(map,s));
        }
        else{
            System.out.println("Tu "+s+" khong ton tai trong tu dien");
        }


    }
}