public abstract class Student{
    protected String sName;
    protected double gpa;
    public Student(String sName, double gpa){
        this.sName = sName;
        this.gpa = gpa;
    }
    public Student(){
        this.sName = "";
        this.gpa = 0.0;
    }
    public String getName(){
        return this.sName;
    }
    public double getGpa(){
        return this.gpa;
    }
    public void setName(String sName){
        this.sName = sName;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public abstract String getRank();

}