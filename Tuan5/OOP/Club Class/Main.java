public class Main {
    public static void main(String[] args) {
        Club club = new Club();
        Club club2 = new Club("A",3,4,1);
        Club club3 = new Club(club2);
        System.out.println(club3);
        club3.setName("B");
        System.out.println(club3);
        System.out.println(club2);
        System.out.println(club);
        System.out.println(club2.numMatchesPlayed());
        System.out.println(club3.numMatchesPlayed());
        System.out.println(club2.isFinish());

    }
}
