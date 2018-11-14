package week10;
import week9.Utils;



        import java.io.File;
        import java.util.List;
import java.util.Random;

public class Task2 {



        /*void Bs(float[] arr) {
                float temp;
                for (int i = 0; i < 1000; i++) {
                        for (int j = 0; j < (1000); j++) {

                                if (arr[j - 1] > arr[j]) {
                                        temp = arr[j - 1];
                                        arr[j - 1] = arr[j];
                                        arr[j] = temp;

                                }

                        }

                 for ( i = 0; i < 1000; i++) {
                                System.out.println("  ");
                        }
                }

        }*/
        public static void main(String args[]) {

                float[] arr = new float[1000];
                System.out.println("\nKhởi tạo mảng : ");
                for (int i = 0; i < 1000; i++) {
                        Random rd = new Random();
                        int n = rd.nextInt();
                        arr[i] = rd.nextFloat() + n;
                        System.out.println(arr[i]);

                }
                System.out.println("\n");
                float temp;
                for (int i = 0; i < 1000 - 1; i++) {
                        for (int j = 1000 - 1; j >= 1; j--) {
                                // nếu phần tử đứng sau nhỏ hơn phần tử đứng trước
                                // thì đổi chỗ 2 phần tử đó cho nhau
                                // với cách sắp xếp này thì trong lần duyệt đầu tiên
                                // phần tử nhỏ nhất sẽ được chuyển lên trên cùng.
                                if (arr[j] < arr[j - 1]) {
                                        temp = arr[j];
                                        arr[j] = arr[j - 1];
                                        arr[j - 1] = temp;
                                }
                        }
                }

                System.out.println("\nMảng sau khi sắp xếp: ");
                for (int i = 0; i < 1000; i++) {
                        System.out.print(arr[i] + "\n");
                }

        }
}