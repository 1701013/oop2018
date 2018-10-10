package week4.task1;

public class QuaCam extends HoaQua {
    //private boolean ngot;
    private int gia;
    //private int NguonGoc;
    private int NgayNhap;
    private int Soluong;



    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }


    public int getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(int ngayNhap) {
        NgayNhap = ngayNhap;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int soluong) {
        Soluong = soluong;
    }

    public QuaCam(int gia, int ngayNhap, int soluong) {
        /**
         * constructor khai bào giá cam , ngày nhập, số lượng nói chung của mặt hàng cam
         */
        this.gia = gia;
        NgayNhap = ngayNhap;
        Soluong = soluong;
    }

    void DonHang(int gia, int ngayNhap, int soluong ){
        this.gia=gia;
        this.NgayNhap= ngayNhap;
        this.Soluong =soluong;
    }
}