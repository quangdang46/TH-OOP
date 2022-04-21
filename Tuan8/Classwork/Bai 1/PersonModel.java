import java.util.ArrayList;

public class PersonModel<T> {
    private ArrayList<T> al = new ArrayList<T>();

    public void add(T obj) {
        al.add(obj);
    }

    public void display() {
        for (T obj : al) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        PersonModel<Student> stu = new PersonModel<Student>();
        stu.add(new Student("Huyen", 1990, "S123", 100));
        stu.add(new Student("Dang", 1990, "S456", 100));
        stu.add(new Student("Hong", 1990, "S789", 100));
        stu.display();


        PersonModel<Employee> emp = new PersonModel<Employee>();
        emp.add(new Employee("Khanh", 1990, "E123", 100000));
        emp.add(new Employee("Luan", 1990, "E456", 200000));
        emp.add(new Employee("Trieu", 1990, "E789", 300000));
        emp.display();

    }
}
