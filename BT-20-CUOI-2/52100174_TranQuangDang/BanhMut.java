public class BanhMut extends SanPham{
    private int soLuong;

    public BanhMut(String maSanPham, String tenSanPham, String donViTinh, double giaTien, int soLuong){
        super(maSanPham, tenSanPham, donViTinh, giaTien);
        this.soLuong = soLuong;
    }

    public double thanhTien(){
        return this.giaTien * this.soLuong;
    }

    public double tinhThue(){
        return 0.1;
    }

    public String toString(){
        return super.toString() + "_" + soLuong;
    }
}