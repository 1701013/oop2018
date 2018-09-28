package week3;



    public class Week3 {
        public
        int n;
        int m;

        int array[] = {1, 5, 6, 8, 1, 6, 2};

        double weight;
        double height;
    /*public Week3(int m,int n){
        this.m= m;
        this.n = n;
    }*/

        public static int max(int m, int n) {
            if (m >= n) return m;
            else return n;// TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhấ
        }

        public static int minOfArray(int[] array) {
            int min = array[0];
            int sz = array.length;
            for (int i = 0; i < sz; i++) {
                if (min > array[i]) {
                    min = array[i];// TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
                }
            }

            return min;

        }

        /**
         * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
         *
         * @param weight cân nặng
         * @param height chiều cao
         * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
         */
        public static String calculateBMI(double weight, double height) {
            double BMI = weight / (height * height);// TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
            if (BMI < 18.5) return "Thieu can";
            else if (BMI >= 18.5 && BMI <= 22.99) return "Binh thuong";
            else if (BMI >= 23 && BMI <= 24.99) return "Thua can";
            else return "Beo phi";
        }

   /* public static void main(String[] args) {
        Week3 m = new Week3();
        m.max(5, 6);
        //m.minOfArray();
        m.calculateBMI(48, 1.58);

    }*/
    }

