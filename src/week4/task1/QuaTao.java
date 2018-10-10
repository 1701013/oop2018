package week4.task1;

public  class QuaTao extends HoaQua {
    private int gia;
    private String NguonGoc;
    private int NgayNhap;
    private int Soluong;

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getNguonGoc() {
        return NguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        NguonGoc = nguonGoc;
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
    public QuaTao(int gia, int ngayNhap, int soluong, String NguonGoc   ){
        /**
         * constructor nói chung về giá bán, ngày nhập , số lượng, nguồn goccs mặ hàng
         */
        this.gia=gia;
        this.NgayNhap= ngayNhap;
        this.Soluong =soluong;
        this.NguonGoc= NguonGoc;
    }
}

