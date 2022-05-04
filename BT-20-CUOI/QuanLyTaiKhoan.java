import java.util.*;
import java.io.*;

public class QuanLyTaiKhoan{
    private ArrayList<TaiKhoan> tkList;

    public QuanLyTaiKhoan(String path){
        this.tkList = docDanhSachTaiKhoan(path);
    }

    public ArrayList<TaiKhoan> docDanhSachTaiKhoan(String path){
        ArrayList<TaiKhoan> temp = new ArrayList<TaiKhoan>();
        //code here
        try{
            File file = new File(path);
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] arr = line.split(",");
                if(arr.length == 3){
                    TaiKhoan tk = new TaiKhoan(arr[0], arr[1], arr[2]);
                    temp.add(tk);
                }else if(arr.length == 4){
                    TaiKhoanVIP tkvip = new TaiKhoanVIP(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]));
                    temp.add(tkvip);
                }
            }
        }catch(Exception e){
            System.out.println("Loi doc file");
            e.printStackTrace();
        }
        return temp;
    }

    public TaiKhoan dangNhap(String tenDangNhap, String matKhau){
        for (TaiKhoan taiKhoan : tkList) {
            if(taiKhoan.getTenDangNhap().equals(tenDangNhap) && taiKhoan.kiemTraDangNhap(matKhau)){
                return taiKhoan;
            }
        }
        return null;
    }
}