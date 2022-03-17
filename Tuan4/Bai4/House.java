public class House {
    private String houseCode="A01";
    private int numOfBedrooms=2;
    private boolean hasSwimmingPool=false;
    private double area=0.0f;
    private double costPerSquareMeter=0.0f;

    public House(String houseCode, int numOfBedrooms, boolean hasSwimmingPool,double area,double costPerSquareMeter) {
        this.houseCode = houseCode;
        this.numOfBedrooms = numOfBedrooms;
        this.hasSwimmingPool = hasSwimmingPool;
        this.area = area;
        this.costPerSquareMeter = costPerSquareMeter;
    }
    public String getHouseCode() {
        return this.houseCode;
    }
    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }

    public int getNumOfBedrooms() {
        return this.numOfBedrooms;
    }
    public void setnumOfBedrooms(int numOfBedrooms) {
        this.numOfBedrooms = numOfBedrooms;
    }

    public boolean getHasSwimmingPool() {
        return this.hasSwimmingPool;
    }
    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public double getArea() {
        return this.area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public double getCostPerSquareMeter() {
        return this.costPerSquareMeter;
    }
    public void setCostPerSquareMeter(double costPerSquareMeter) {
        this.costPerSquareMeter = costPerSquareMeter;
    }


    public double calculateSellingPrice(){
        double tmp= this.area*this.costPerSquareMeter;
        if(this.hasSwimmingPool){
            return tmp*1.375;
        }
        return tmp;
    }

    @Override
    public String toString(){
        return "House["+this.houseCode+","+this.numOfBedrooms+","+this.hasSwimmingPool+","+this.area+","+calculateSellingPrice()+"]";
    }





}
