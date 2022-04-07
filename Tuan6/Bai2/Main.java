public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", "123 Main St.", "CS", 2019, 0.0);
        Person person = new Person("John", "123 Main");
        Staff staff =new Staff("John", "123 Main", "TDTU", 34.2);
        //get student
        System.out.println(student.getName());
        System.out.println(student.getAddress());
        System.out.println(student.getProgram());
        System.out.println(student.getYear());
        System.out.println(student.getFee());
        //get person
        System.out.println(person.getName());
        System.out.println(person.getAddress());
        //get staff
        System.out.println(staff.getName());
        System.out.println(staff.getAddress());
        System.out.println(staff.getSchool());
        System.out.println(staff.getPay());
        //set student
        student.setProgram("CS");
        student.setYear(2029);
        student.setFee(10.0);
        
        //toString
        System.out.println(student.toString());
        System.out.println(person.toString());
        System.out.println(staff.toString());
        

            



    }
}
