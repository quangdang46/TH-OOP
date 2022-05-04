public class TaiKhoanVIP extends TaiKhoan {
    private int diemTichLuy;

    public TaiKhoanVIP(String tenDangNhap, String matKhau, String ngayTao, int diemTichLuy) {
        super(tenDangNhap, matKhau, ngayTao);
        this.diemTichLuy = diemTichLuy;
    }

    public boolean congDiemThuong(int diemThuong) {
        if(diemThuong>0){
            this.diemTichLuy+=diemThuong;
            return true;
        }
        return false;
    }

    public String toString() {
        return super.toString() + " - " + this.diemTichLuy;
    }
}