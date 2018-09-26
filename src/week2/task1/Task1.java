package week2.task1;
import java.util.Scanner;// import gói nhập xuất dữ liệu


public class Task1 {
    //private :
    public
    int a;
    int b;
    int n;
    //public :

    /*public double getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
*/
    public static int gcd(int a, int b) {
        //int ucln(int a, int b){
            /*if(a==0&&b==0)return -1;
            else {
                if(b==0)return a;
                else return gcd(b, b%a);
                // TODO: Tính ước chung lớn nhất của 2 số a, b
            }*/
        while (b!=0)
        {
            int r=a%b;
            a=b;
            b=r;
        }
        return a;


    }

    /*public static int kiemtra(int k) {

        //Scanner input = new Scanner(System.in);
        boolean check = false;
         //k = 0;
        while (!check) {
            try {
               k = Integer.parseInt(input.nextLine());
                if (k <= 0) {
                    System.out.println("Bạn phải nhập số tự nhiên! Hãy nhập lại.");
                    continue;
                }
                check = true;}
            catch (Exception e) {
                System.out.println("Bạn phải nhập số tự nhiên! Hãy nhập lại.");
           }
        }
        return (k);
    }*/
    public static int nhapSoTN() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            try {
                n = Integer.parseInt(input.nextLine());
                if (n < 0) {
                    System.out.println("Bạn phải nhập số tự nhiên! Hãy nhập lại.");
                    continue;
                }
                check = true;
            } catch (Exception e) {
                System.out.println("Bạn phải nhập số tự nhiên! Hãy nhập lại.");
            }
        }
        return (n);
    }
    public static int fibonacci(int n) {
        if(n==0) return 0;
        else if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            int arr[] = new int[n];
            arr[0] = 1;
            arr[1] = 1;
            for (int i = 2; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            return arr[n-1];// TODO: Tìm số fibonacci ở vị trí n
        }

    }

    public static void main(String[] args) {
        //Scanner inp = new Scanner(System.in);////tao doi tuong inp thuoc lop Scanner
        System.out.println("Nhập số tự nhiên a: ");
        int a = nhapSoTN();

        System.out.println("Nhập số tự nhiên b: ");
        int b = nhapSoTN();

        System.out.println("Uoc chung lon nhat cua a va b là: " + gcd(a,b));
        System.out.println("Nhập số tự nhiên n: ");
        int n = nhapSoTN();

        System.out.println("Số Fibonacci thứ " + n + " là: ");
        System.out.println(fibonacci(n));
    }


}



