public class TaiKhoan{
    private String tenDangNhap;
    private String matKhau;
    private String ngayTao;

    public TaiKhoan(String tenDangNhap, String matKhau, String ngayTao){
        //code here
    }

    public boolean doiMatKhau(String matKhauCu, String matKhauMoi){
        //code here
        return false;
    }

    public boolean kiemTraDangNhap(String matKhau){
        //code here
        return false;
    }

    public String getTenDangNhap(){
        return this.tenDangNhap;
    }

    public String toString(){
        return this.tenDangNhap + " - " + this.matKhau;
    }
}