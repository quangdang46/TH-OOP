public class HocSinhChuyenVan extends HocSinh{
    private String maLop;
    public HocSinhChuyenVan(){

    }
    public HocSinhChuyenVan(String hoTen,double diemToan,double diemVan,double diemAnh,String maLop){
        super(hoTen,diemToan,diemVan,diemAnh);
        this.maLop=maLop;
    }
    public double tinhDiemTB(){
        return (this.diemToan+this.diemVan*2+this.diemAnh)/4;
    }
    @Override
    public String toString(){
        return "("+this.hoTen+","+this.maLop+","+this.tinhDiemTB()+")";
    }
}
