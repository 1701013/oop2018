package week4.task1;

 class Testlopkethua {

    public static void main(String[] args) {
            CamCaoPhong ccp= new CamCaoPhong(35000,15,2,"ngọt");
            ccp.dactinh();
            ccp.dacdiem(true,150);
            ccp.DonHang(35000,29/11,1);
            ccp.toString();
            QuaTao tao = new QuaTao(15000,25,3,"Nam Định");
            //tao.DonHang(20000,22/2,3,"Nhap khau My");
            tao.toString();
            CamSanh cs= new CamSanh(22000,22,3,"Nam Định","Xanh Đậm");
            cs.dacdiem(true,160);
            cs.DonHang(40000,25/10,4);
            cs.toString();

         }
     }



/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */