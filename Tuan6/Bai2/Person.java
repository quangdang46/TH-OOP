public class Person{
    protected String name;
    protected String address;
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    @Override
    public String toString(){
        return "Person[" + this.name + "," + this.address + "]";
    }
}