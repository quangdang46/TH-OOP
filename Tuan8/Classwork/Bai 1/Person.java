public class Person {
    private String name;
    private int yearOfBirth;
    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
    public Person(){

    }
    //get
    public String getName() {
        return this.name;
    }
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    //set
    public void setName(String name) {
        this.name = name;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth;
    }
}
