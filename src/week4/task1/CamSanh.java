package week4.task1;

public class CamSanh extends QuaCam {
    private String VungChuyenCanh ;
    private String MauSac;

    /*public CamSanh(String vungChuyenCanh, String mauSac) {
        VungChuyenCanh = vungChuyenCanh;
        MauSac = mauSac;
    }*/

    public CamSanh(int gia, int ngayNhap, int soluong, String vungChuyenCanh, String mauSac) {
        /**
         * constructor khai báo giá bán một cân, ngày nhập, số lượng nhập, vùng chuyên canh, dặc tính bên ngoài của cam sành
         */
        super(gia, ngayNhap, soluong);
        VungChuyenCanh = vungChuyenCanh;
        MauSac = mauSac;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}