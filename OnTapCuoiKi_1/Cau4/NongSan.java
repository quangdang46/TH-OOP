public class NongSan extends MatHang{

    private String loaiNongSan;
    public NongSan(String maMH, String tenMH, double giaMH,String loaiNongSan) {
        super(maMH, tenMH, giaMH);
        this.loaiNongSan = loaiNongSan;
    }
    public double tinhThue(){
        if(this.loaiNongSan.equalsIgnoreCase("Bap Cai") || this.loaiNongSan.equalsIgnoreCase("Ca Chua")){
            return 0.1;
        }
        return 0.05;
    }
    @Override
    public double tinhGiaBan(int soLuong){
        return super.tinhGiaBan(soLuong)*(1+this.tinhThue());
    }
    @Override
    public double tinhKhuyenMai(int soLuong){
        return 0.1*this.tinhGiaBan(soLuong);
    }
    ////////////////////////////////
    @Override
    public String toString() {
        return super.toString()+"_"+this.loaiNongSan;
    }

}
