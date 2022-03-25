public class Employee{
    private String eID;
    private String eName;
    private int eSalary;
    private String eDept;

    public Employee(String eID, String eName, int eSalary, String eDept){
        //code here
        boolean changed = false;
        String str[]={"Accounting","Administration","Human Resources","Customer Service"};
        this.eID = eID;
        this.eName = eName;
        this.eSalary = eSalary;
        this.eDept = eDept;
        for(int i=0;i<str.length;i++){
            if(str[i].equalsIgnoreCase(this.eDept)){
                changed = true;
                break;
            }
        }
        if(!changed){
            this.eDept = "Administration";
        }
    }

    public double getBonus(){
        //code here
        if(this.eDept.equalsIgnoreCase("Administration")){
            return this.eSalary*0.5;
        }else if(this.eDept.equalsIgnoreCase("Human Resources") || this.eDept.equalsIgnoreCase("Accounting")){
            return this.eSalary*0.3;
        }
        return this.eSalary*0.1;
    }

    public double totalSalary(int numOfWorkingDays){
        //code here
        double total=this.eSalary*numOfWorkingDays+this.getBonus();
        if(numOfWorkingDays>=20){
            total+=total*0.05;
        }
        return total;
    }

    public String geteID() {
        return eID;
    }

    public void seteID(String eID) {
        this.eID = eID;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteSalary() {
        return eSalary;
    }

    public void seteSalary(int eSalary) {
        this.eSalary = eSalary;
    }

    public String geteDept() {
        return eDept;
    }

    public void seteDept(String eDept) {
        this.eDept = eDept;
    }

   
}