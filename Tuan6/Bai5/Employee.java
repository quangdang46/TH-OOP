import java.util.HashMap;
import java.util.Map;

public class Employee{
    protected String ID;
    protected String fullName;
    protected int yearJoined;
    protected double coefficientsSalary;
    protected int numDaysOff;
    ///////////////////////
    protected double salary;
    //////////////////////
    public Employee(){
        this.yearJoined = 2020;
        this.coefficientsSalary =1.0;
    }
    public Employee(String ID,String fullName,double coefficientsSalary){
        this.ID = ID;
        this.fullName = fullName;
        this.coefficientsSalary = coefficientsSalary;
        this.yearJoined = 2020;
        this.numDaysOff = 0;
    }
    public double getSenioritySalary(){
        if((2022-this.yearJoined)>=5){
            return (2022-this.yearJoined)*this.coefficientsSalary/100;
        }
        return 0;
    }
    public String considerEmulation(){
        if(this.numDaysOff<=1){
            return "A";
        }else if(this.numDaysOff<=3){
            return "B";
        }
        return "C";
    }
    public double getSalary (){

        /*
        double emulation_coefficient;
        if(this.considerEmulation().equals("A")){
            emulation_coefficient = 1;
        }else if(this.considerEmulation().equals("B")){
            emulation_coefficient = 0.75;
        }else{
            emulation_coefficient = 0.5;
        }
        */ 
        Map<String, Double> map = new HashMap<String, Double>();
        map.put("A", 1.0);
        map.put("B", 0.75);
        map.put("C", 0.5);
        // basic salary????????
        return this.salary+this.salary*(this.coefficientsSalary+map.get(this.considerEmulation()))+this.getSenioritySalary();
    }
}