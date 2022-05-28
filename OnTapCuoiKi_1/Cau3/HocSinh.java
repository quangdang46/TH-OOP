public class HocSinh{
    protected String hoTen;
    protected double diemToan,diemVan,diemAnh;

    public HocSinh(){

    }
    public HocSinh(String hoTen,double diemToan,double diemVan,double diemAnh){
        this.hoTen=hoTen;
        this.diemToan=diemToan;
        this.diemVan=diemVan;
        this.diemAnh=diemAnh;
    }

    public double tinhDiemTB(){
        return (this.diemToan+this.diemVan+this.diemAnh)/3;
    }
    @Override
    public String toString(){
        return "("+this.hoTen+","+this.tinhDiemTB()+")";
    }
}