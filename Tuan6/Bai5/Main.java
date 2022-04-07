public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("123","Nguyen Van A",1.0);    
        System.out.println(employee.getSalary());
        System.out.println(employee.getSenioritySalary());
        System.out.println(employee.considerEmulation());
        Manager manager = new Manager();
        System.out.println(manager.getSalary());
        System.out.println(manager.getSenioritySalary());
        System.out.println(manager.considerEmulation());
        System.out.println(manager.bonusByPosition());

    }
}
