package week2.task1;


public class Task1 {
    //private :
    public
        int a;
        int b;
        int n;

    public static int gcd(int a, int b) {

        while (b!=0)
        {
            int r=a%b;
            a=b;
            b=r;
        }
        return a;


    }


    public static int fibonacci(int n) {
        if(n==0)return 0;
        else if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            int arr[] = new int[n];
            arr[0] = 1;
            arr[1] = 1;
            for (int i = 2; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            return arr[n-1];
            // Tìm số fibonacci ở vị trí n
        }

    }

    public static void main(String[] args) {


        System.out.println("Uoc chung lon nhat cua 30 va 9 là: " + gcd(30,9));
        //System.out.println("Nhập số tự nhiên n: ");
        //int n = nhapSoTN();

        System.out.println("Số Fibonacci thứ 0 là: ");
        System.out.println(fibonacci(0));
    }


}



