public class Employee extends Person {
    private String id;
    private long salary;
    public Employee(String name,int yearOfBirth,String id, long salary) {
        super(name,yearOfBirth);
        this.id = id;
        this.salary = salary;
    }
    public Employee(){
        super();
    }
    //get
    public String getId() {
        return this.id;
    }
    public long getSalary() {
        return this.salary;
    }
    //set
    public void setId(String id) {
        this.id = id;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return super.toString() +
                "id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }
}
