public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Dang","Nam","Ht",9.5);
        Student s2 = new Student("Hong","Nu","Qn",7.3);
        Student.StudentOperator sop = s1.new StudentOperator();
        Student.StudentOperator sop2 = s2.new StudentOperator();
        System.out.println(sop.print());
        System.out.println(sop.type());
        System.out.println(sop2.print());
        System.out.println(sop2.type());
    }
}
