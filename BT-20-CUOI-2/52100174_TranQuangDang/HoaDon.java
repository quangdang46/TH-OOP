import java.util.*;
import java.io.*;

public class HoaDon{
    private ArrayList<SanPham> dsSanPham;

    public HoaDon(String path){
       dsSanPham = docDSSanPham(path);
    }

    public ArrayList<SanPham> docDSSanPham(String path){
        ArrayList<SanPham> temp = new ArrayList<SanPham>();
        try{
            File f = new File(path);
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] arr = line.split(",");
                if(this.layDonViTinh(arr[0]).equals("kg")){
                    temp.add(new TraiCay(arr[0], arr[1],this.layDonViTinh(arr[0]),Double.parseDouble(arr[2]), Double.parseDouble(arr[3])));
                }else if(this.layDonViTinh(arr[0]).equals("hop")){
                    temp.add(new BanhMut(arr[0], arr[1],this.layDonViTinh(arr[0]),Double.parseDouble(arr[2]), Integer.parseInt(arr[3])));
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
        return temp;
    }

    private String layDonViTinh(String maSP){
        if(maSP.startsWith("T")){
            return "kg";
        }
        return "hop";
    }

    public double tinhTongGiaTriHoaDon(){
        double tong = 0;
        for(SanPham sp : dsSanPham){
            tong += sp.thanhTien()+sp.tinhThue()*sp.thanhTien();
        }
        return tong;
    }

    public void inThongTinSanPham(){
        if(dsSanPham == null){
            System.out.println("Khong co san pham");
            return;
        }
        for(SanPham s : dsSanPham){
           System.out.println(s);
        }
    }


}