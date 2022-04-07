public class Manager extends Employee {
    private String Position,Department;
    public Manager() {
        super();
        this.Position = "head";
        this.Department = "administrative";
        this.coefficientsSalary = 5.0;
    }
    public Manager(String ID,String fullName,double coefficientsSalary){
        super(ID,fullName,coefficientsSalary);
    }

    public String considerEmulation(){
        return "A";
    }
    public double bonusByPosition(){
        return this.salary*this.coefficientsSalary;
    }

    public double getSalary(){
        if(this.Position.equalsIgnoreCase("Manager")){
            return this.salary+this.salary*(this.coefficientsSalary+this.bonusByPosition())+this.getSenioritySalary();//+position bonus???????
        }
        return this.salary;
    }
}
