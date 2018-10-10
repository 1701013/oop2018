/**
 * Package bài làm cho Câu 2
 * TODO: Khai báo các class, thuộc tính và phương thức như biểu đồ lớp của Câu 2. 1 file chỉ khai báo 1 class
 * TODO: Viết comment và khai báo getter, setter đầy đủ như yêu cầu ở Câu 1
 * TODO: Sử dụng số PI tự định nghĩa dùng cho các phương thức getArea() và getPerimeter()
 * @author cuong
 * @version 0.1
 */
package week4.task2;


 class Test{
    public static void main(String[] args ){//kiem tra tinh ke thừa
        Circle ci =new Circle(1);
        ci.toString();
        Rectangle re= new Rectangle("red",true,1.0 ,1.0);
        re.toString();
        Square sq= new Square("blue",true,0);
        sq.toString();
        Shape sh = new Shape("red",true);
        sh.toString();
    }

}