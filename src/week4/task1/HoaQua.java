package week4.task1;

public class HoaQua {
    private boolean CoHat;
    private int GiaTriDinhDuong;

    public boolean isCoHat() {
        return CoHat;
    }

    public void setCoHat(boolean coHat) {
        CoHat = coHat;
    }

    public int getGiaTriDinhDuong() {
        return GiaTriDinhDuong;
    }

    public void setGiaTriDinhDuong(int giaTriDinhDuong) {
        GiaTriDinhDuong = giaTriDinhDuong;
    }
    void dacdiem (boolean CoHat,int GiaTriDinhDuong){
        this.CoHat= CoHat;
        this.GiaTriDinhDuong=GiaTriDinhDuong;
    }

}