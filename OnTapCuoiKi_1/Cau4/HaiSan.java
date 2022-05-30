public class HaiSan extends MatHang{
    private String loaiHaiSan;
    public HaiSan(String maMH, String tenMH, double giaMH,String loaiHaiSan) {
        super(maMH, tenMH, giaMH);
        this.loaiHaiSan = loaiHaiSan;
    }
    @Override
    public double tinhKhuyenMai(int soLuong){
        return soLuong<=5?0:0.05*super.tinhGiaBan(soLuong);
    }
    //////////////////////////////////
    @Override
    public String toString() {
        return super.toString()+"_"+this.loaiHaiSan;
    }
}
