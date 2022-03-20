public class Main {
    public static void main(String[] args) {
        Student student = new Student(52100174,"Tran Quang","Dang");
        
        //getId
        System.out.println("Id: " + student.getId());
        //getFirstName
        System.out.println("First Name: " + student.getFirstName());
        //getLastName
        System.out.println("Last Name: " + student.getLastName());
        //setId
        student.setID(123456);
        System.out.println("Id: " + student.getId());
        //setFirstName
        student.setFirstName("Nguyen Van");
        System.out.println("First Name: " + student.getFirstName());
        //setLastName
        student.setLastName("A");
        System.out.println("Last Name: " + student.getLastName());
        //toString
        System.out.println(student.toString());


    }
}
