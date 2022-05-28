import java.util.*;
public class Test {
    public static ArrayList<MatHang> mh;
        ////////////////////////////////////////////////////////////////
        final static int soLuongToiDa = 10;
        ///////////////////////////////////////////////////////////////
    public static MatHang timMatHang(){
        Collections.sort(mh,new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return (int)(o2.tinhKhuyenMai(soLuongToiDa)-o1.tinhKhuyenMai(soLuongToiDa));
            }
        });
        return mh.get(0);
    }
    public static void main(String[] args) {
        mh = new ArrayList<MatHang>();
        mh.add(new NongSan("1","NongSan",100,"Xu Hao"));
        mh.add(new NongSan("2","NongSan",150,"Ca Chua"));
        mh.add(new HaiSan("3","HaiSan",300,"Muc"));
        mh.add(new HaiSan("4","HaiSan",170,"Tom"));
        mh.add(new HaiSan("5","HaiSan",80,"Ca Kho"));
        mh.add(new NongSan("6","NongSan",30,"Bap Cai"));
        System.out.println(timMatHang());
    }
}
