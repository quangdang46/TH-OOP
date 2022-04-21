public class MathStudent extends Student {
    public String sID;
    public MathStudent(String sName, double gpa, String sID){
        super(sName, gpa);
        this.sID = sID;
    }
    public MathStudent(){
        super();
        this.sID = "";
    }
    public String getID(){
        return this.sID;
    }
    public void setID(String sID){
        this.sID = sID;
    }


    @Override
    public String getRank() {
        if(this.gpa>=5){
            return "Passed";
        }
        return "Failed";

    }
}

    
