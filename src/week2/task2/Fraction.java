package week2.task2;
//import java.util.Scanner;

import week2.task1.Task1;

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
    public void toigian(){
        int m = Task1.gcd(nume,denom);
        if(m!=0){
            nume/=m;
            denom /=m;
        }
    }

    public Fraction add(Fraction other) {
        Fraction k = new Fraction(1, 1);
        k.nume = (this.getNume() * other.getDenom()) + (other.getNume() * this.getDenom());
        k.denom = other.getDenom() * this.getNume();

        //k.rutGon();
        if (k.denom == 1) System.out.println("Ket qua cong hai phan so: " + k.nume);
        else
            System.out.println("Ket qua Cong: " + k.nume + "/" + k.denom);
        k.toigian();
        return k;

    }

    ;

    public Fraction subtract(Fraction other) {
        Fraction k = new Fraction(1, 1);
        k.nume = (this.getNume() * other.getDenom()) - (other.getNume() * this.getDenom());
        k.denom = other.getDenom() * this.getNume();

        //k.rutGon();
        if (k.denom == 1) System.out.println("Ket qua tru phan so thu nhat cho phan so thu hai: " + k.nume);
        else
            System.out.println("Ket qua tru phan so thu nhat cho phan so thu hai: " + k.nume + "/" + k.denom);
        k.toigian();
        return k;
    }

    public Fraction multiply(Fraction other) {
        Fraction f1= new Fraction(0,0);
        f1.nume = (this.getNume() * other.getNume());
        f1.denom = other.getDenom() * this.getDenom();

        //k.rutGon();
        if (f1.denom == 1) System.out.println("Ket qua nhan hai phan so: " + f1.nume);
        else
            System.out.println("Ket qua nhan hai phan so: " + f1.nume + "/" + f1.denom);
        f1.toigian();
        return f1;
    }

    public Fraction divide(Fraction other) {
        Fraction k = new Fraction(1, 1);
        k.nume= (this.getNume() * other.getDenom());
        k.denom = other.getDenom() * this.getNume();

        //k.rutGon();
        if (k.denom == 1) System.out.println("Ket qua chia phan so thu nhat cho phan so thu hai: " + k.nume);
        else
            System.out.println("Ket qua chia phan so thu nhat cho phan so thu hai: " + k.nume + "/" + k.denom);
        k.toigian();
        return k;
    }

    //@Override
    public boolean equals(Object obj) {
        Fraction p2= new Fraction(1,1);
        p2= this.subtract((Fraction)obj);
        if(p2.nume*p2.denom==0)return true;
        else return false;
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
        if (p1.equals(p2)==true)
            System.out.println("Hai phan so bang nhau");

        else
            System.out.println("Hai phan so khong bang nhau");
    }
}
