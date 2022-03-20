public class Main {
    public static void main(String[] args) {
        House house = new House("A", 3, true, 100, 2500000);
        //housecode
        System.out.println("HouseCode: "+house.getHouseCode());
        //numOfBedrooms
        System.out.println("NumOfBedrooms: "+house.getNumOfBedrooms());
        //hasSwimmingPool
        System.out.println("HasSwimmingPool: "+house.getHasSwimmingPool());
        //Area
        System.out.println("Area: "+house.getArea());
        //costPerSquareMeter
        System.out.println("costPerSquareMeter: "+house.getCostPerSquareMeter());
        //calculateSellingPrice
        System.out.println("calculateSellingPrice: "+house.calculateSellingPrice());
        //toString
        System.out.println(house.toString());
        //setName,setHouseCode,setNumOfBedrooms,setHasSwimmingPool,setArea,setCostPerSquareMeter
        house.setHouseCode("B");
        house.setnumOfBedrooms(4);
        house.setHasSwimmingPool(false);
        house.setArea(200);
        house.setCostPerSquareMeter(200);
        System.out.println(house.toString());
    }
}
