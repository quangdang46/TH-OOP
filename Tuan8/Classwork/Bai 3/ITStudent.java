public class ITStudent extends Student {
    private int sID;
    public ITStudent(String sName, double gpa, int sID){
        super(sName, gpa);
        this.sID = sID;
    }
    public ITStudent(){
        super();
        this.sID = 0;
    }
    public int getID(){
        return this.sID;
    }
    public void setID(int sID){
        this.sID = sID;
    }

    @Override
    public String getRank() {
        if(this.gpa<=10 && this.gpa>8){
            return "A";
        }
        else if(this.gpa>=5){
            return "B";
        }
        return "C";
    }

    
}
