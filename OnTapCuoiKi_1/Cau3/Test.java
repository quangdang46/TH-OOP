public class Test {
    public static void main(String[] args) {
        HocSinh hs=new HocSinh("Nguyen Van A",9,8,7);
        System.out.println(hs);
        System.out.println(hs.tinhDiemTB());
        HocSinhChuyenVan hscv=new HocSinhChuyenVan("Nguyen Van B",9,8,7,"Lop A");
        System.out.println(hscv);
        System.out.println(hscv.tinhDiemTB());

    }
}
