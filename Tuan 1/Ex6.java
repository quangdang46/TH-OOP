public class Ex6 {
    public static int MinThreeNum(int x, int y) {
        return x<y?x:y;
    }

    public static void main(String[] args) {
        int x=1,y=2,z=3;
        System.out.println("Min of "+x+","+y+","+z+" is "+MinThreeNum(MinThreeNum(x,y),z));

    }
}
