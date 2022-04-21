public class Student extends Person {
    private String id;
    private double score;
    public Student(String name,int yearOfBirth,String id, double score) {
        super(name,yearOfBirth);
        this.id = id;
        this.score = score;
    }
    public Student(){
        super();
    }
    //get   
    public String getId() {
        return this.id;
    }
    public double getScore() {
        return this.score;
    }
    //set
    public void setId(String id) {
        this.id = id;
    }
    public void setScore(double score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return super.toString() +
                "id='" + id + '\'' +
                ", score=" + score +
                '}';
    }
}
