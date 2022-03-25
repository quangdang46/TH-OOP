public class RegularPolygon{
    private String name="";
    private int egdeAmount=3;
    private double egdeLength=1;
    public RegularPolygon(){

    }
    public RegularPolygon(String name, int edgeAmount,double edgeLength){
        this.name=name;
        this.egdeAmount=edgeAmount;
        this.egdeLength=edgeLength;
    }
    public RegularPolygon (String name, int edgeAmount){
        this.name=name;
        this.egdeAmount=edgeAmount;
    }
    public RegularPolygon(RegularPolygon polygon){
        this.name=polygon.name;
        this.egdeAmount=polygon.egdeAmount;
        this.egdeLength=polygon.egdeLength;
    }
    public String getName(){
        return this.name;
    }
    public int getEdgeAmount(){
        return this.egdeAmount;
    }
    public double getEdgeLength(){
        return this.egdeLength;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEdgeAmount(int edgeAmount){
        this.egdeAmount=edgeAmount;
    }
    public void setEdgeLength(double edgeLength){
        this.egdeLength=edgeLength;
    }
    public String getPolygon(){
        if(this.egdeAmount==3){
            return "Triangle";
        }else if(this.egdeAmount==4){
            return "Quadrangle";
        }else if(this.egdeAmount==5){
            return "Pentagon";
        }else if(this.egdeAmount==6){
            return "Hexagon";
        }
        return "Polygon has the number of edges greater than 6";
    }
    public double getPerimeter(){
        return this.egdeAmount*this.egdeLength;
    }
    public double getArea(){
        double[] a={0,0,0,0.433,1,1.72,2.595};
        if(this.egdeAmount>6){
            return -1;
        }
        return Math.pow(this.egdeLength,2)*a[this.egdeAmount];
    }
    @Override
    public String toString(){
        return this.name+"-"+this.getPolygon()+"-"+this.getArea();    
    }

}   