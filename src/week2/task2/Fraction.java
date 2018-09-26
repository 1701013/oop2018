package week2.task2;
//import java.util.Scanner;

public class Fraction {

    private

    int nume;
    int denom;// TODO: khai báo các thuộc tính


    public int getNume() {
        return nume;
    }

    public void setNume(int nume) {
        this.nume = nume;
    }

    ;

    public int getDenom() {
        return denom;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }

    public Fraction(int nume, int denom) {
        this.nume = nume;
        this.denom = denom;// TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
    }

    /*public static int gcd(int a, int b) {

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;


    }

    public void rutGon() {
        int i = gcd(this.getNume(), this.getDenom());
        this.setNume(this.getNume() / i);
        this.setDenom(this.getDenom() / i);
    }*/

    public Fraction add(Fraction other) {
        /*Fraction ps = new Fraction();
        ps.nume = other.getDenom()*nume+denom* other.getNume();
        ps.denom = other.getDenom()*denom;// TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        return ps;*/
        int a = (this.getNume() * other.getDenom()) + (other.getNume() * this.getDenom());
        int b = other.getDenom() * this.getNume();
        Fraction k = new Fraction(a, b);
        //k.rutGon();
        if (k.denom == 1) System.out.println("Ket qua cong hai phan so: " + k.nume);
        else
            System.out.println("Ket qua Cong: " + k.nume + "/" + k.denom);
        return null;
    }

    public Fraction subtract(Fraction other) {
        /*Fraction ps1 = new Fraction();
        ps1.nume = other.getDenom()*nume-denom* other.getNume();
        ps1.denom = other.getDenom()*denom;
        return ps1;// TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        //return null;*/
        int a = (this.getNume() * other.getDenom()) - (other.getNume() * this.getDenom());
        int b = other.getDenom() * this.getNume();
        Fraction k = new Fraction(a, b);
        //k.rutGon();
        if (k.denom == 1) System.out.println("Ket qua tru phan so thu nhat cho phan so thu hai: " + k.nume);
        else
            System.out.println("Ket qua tru phan so thu nhat cho phan so thu hai: " + k.nume + "/" + k.denom);
        return null;
    }

    public Fraction multiply(Fraction other) {
        /*Fraction ps2;// = new Fraction();
        ps2.nume = other.getNume()*nume;
        ps2.denom = other.getDenom()*denom;
        return ps2;// TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        //return null;*/
        int a = (this.getNume() * other.getNume());
        int b = other.getDenom() * this.getDenom();
        Fraction k = new Fraction(a, b);
        //k.rutGon();
        if (k.denom == 1) System.out.println("Ket qua nhan hai phan so: " + k.nume);
        else
            System.out.println("Ket qua nhan hai phan so: " + k.nume + "/" + k.denom);
        return null;
    }

    public Fraction divide(Fraction other) {
        /*Fraction ps3;// = new Fraction();
        ps3.nume = denom* other.getNume();
        ps3.denom = other.getDenom()*nume;
        return ps3;// TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        //return null;*/
        int a = (this.getNume() * other.getDenom());
        int b = other.getDenom() * this.getNume();
        Fraction k = new Fraction(a, b);
        //k.rutGon();
        if (k.denom == 1) System.out.println("Ket qua chia phan so thu nhat cho phan so thu hai: " + k.nume);
        else
            System.out.println("Ket qua chia phan so thu nhat cho phan so thu hai: " + k.nume + "/" + k.denom);
        return null;
    }

    //@Override
    public boolean equals(Object obj) {
        // Nếu other = null thì trả về false.
        if (obj == null) {
            return false;
        }
        // Nếu 'other' không phải là kiểu Fraction
        // thì trả về false.
        if (!(obj instanceof Fraction)) {
            return false;
        }

        Fraction otherN = (Fraction) obj;

        if (this.nume/ otherN.nume == this.denom / otherN.denom) {
            return true;
        }
        return false;
        //return super.equals(obj);
    }


    public static void main(String[] agrs) {
        //Scanner input = new Scanner(System.in);


        Fraction p1 = new Fraction(1, 2);
        Fraction p2 = new Fraction(4, 5);

        p1.add(p2);
        p1.divide(p2);
        p1.multiply(p2);
        p1.subtract(p2);
       // p1.rutGon();
        //p2.rutGon();
        if (p1.equals(p2) == true)
            System.out.println("Hai phan so bang nhau");

        else
            System.out.println("Hai phan so khong bang nhau");
    }
}
