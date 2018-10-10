package week4.task1;

public class CamCaoPhong extends QuaCam {
        public String dactinh="ngot va thom, mat";
        void dactinh() {
            System.out.println( "Nơi Chuyên Canh: Huyen Cao Phong \n Vị: ngot va thom, mat");
        }

    public CamCaoPhong(int gia, int ngayNhap, int soluong, String dactinh) {
/**
 * constructor khai báo giá bán một cân, ngày nhập, số lượng nhập, dặc tính của cam cao phong
 */
 super(gia, ngayNhap, soluong);
 this.dactinh = dactinh;
 }

 @Override
 public String toString() {
 return super.toString();
 }
 }


