
interface vegetable{
    String getInfo();
}
public class VegetableFactory{
    public class Carrot{
        private String type;
        vegetable carrot = new vegetable(){
            @Override
            public String getInfo(){
                return "Carrot";
            }
        };
    }
    public class Cabbage{
        private String type;
        vegetable cabbage = new vegetable(){
            @Override
            public String getInfo(){
                return "cabbage";
            }
        };
    }
    public class Pumpkin{
        private String type;
        vegetable pumpkin = new vegetable(){
            @Override
            public String getInfo(){
                return "pumpkin";
            }
        };
    }
    public vegetable getVegetable(String type){
        switch(type){
            case "carrot":
                return new Carrot().carrot;
            case "cabbage":
                return new Cabbage().cabbage;
            case "pumpkin":
                return new Pumpkin().pumpkin;
        }
        return null;
    }

    public static void main(String[] args) {
        VegetableFactory factory = new VegetableFactory();
        vegetable vegetable = factory.getVegetable("carrot");
        System.out.println(vegetable.getInfo());

    }
}
    
