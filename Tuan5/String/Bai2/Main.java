public class Main{
    public static int countWord(String paragraph){
        return paragraph.split("\\.|\\,|\\s").length;
    }

    public static int countSentences(String paragraph){
        return paragraph.split("\\.").length;
    }
    public static int countAppear(String paragraph, String word){
        String[] str = paragraph.split("\\.|\\,|\\s");
        int cnt = 0;
        for(String s : str){
            if(s.equalsIgnoreCase(word)){
                cnt++;
            }
        }
        return cnt;
    }
    // String[] str = s.split("\\.|\\,|\\s");
    public static void main(String[] args) {
        String str="The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";
        System.out.println(countWord(str));
        System.out.println(countSentences(str));
        System.out.println(countAppear(str,"lot"));
    }
}