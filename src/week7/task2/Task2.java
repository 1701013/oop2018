package week7.task2;

import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.NullPointerException ;
import java.lang.ArrayIndexOutOfBoundsException ;
import java.lang.ArithmeticException ;
import java.lang.ClassCastException;
import java.io.IOException;


public class Task2 {
    BufferedReader a;
    public void nullPoiter() throws NullPointerException {
        String string=null;
        System.out.println(string.length());
    }
    public void arrayIndex() throws ArrayIndexOutOfBoundsException {
        int a[]= new int[5];
        a[8]=4;
        System.out.println(a[8]);
    }
    public void arithmetic()throws ArithmeticException {
        int re= 50/0;
        System.out.println(re);
    }
    public void classCast() throws ClassCastException {
        class dad {}
        class kid extends dad {};
        dad  d= new dad();
        kid k=(kid) d;
    }
    public void ioEx() throws IOException {
        a= new BufferedReader(new FileReader("file.txt"));
        StringBuilder sb= new StringBuilder();
        String line= a.readLine();
        while(line!=null) {
            sb.append(line+"\n");
            line=a.readLine();
        }
        String result= sb.toString();
        System.out.println(result);
    }


    public static void main(String[] argvs) {
        Task2 t= new Task2();
        try {
            t.nullPoiter();
        }
        catch (NullPointerException e) {
            System.out.println("null poiter");
        }
        try {
            t.arithmetic();
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic");
        }
        try {
            t.classCast();
        }
        catch (ClassCastException e) {
            System.out.println("Class cast");
        }
        try {
            t.ioEx();
        }
        catch (FileNotFoundException e)  {
            System.out.println("file not found");
        }
        catch (IOException e) {
            System.out.println("IO");
        }
    }
}












/*




class ArrayIndexOfBoundsExceptionDemo {// lõi truy cập phần ử tạ vị trí ko tồn tại trog mảng


        void method() throws ArrayIndexOutOfBoundsException {
            throw new ArrayIndexOutOfBoundsException("Enorr: Array Index Of Bounds Exception");
        }


    public static void main(String[] args) {

        String[] strs = new String[] { "One", "Two", "Three" };
        // Truy cập vào phần tử tại chỉ số 0.
        String str1 = strs[0];

        System.out.println("String at 0 = " + str1);

        // Truy cập vào phần tử tại chỉ số 5
        // ArrayIndexOfBoundsException xẩy ra tại đây.
        String str2 = strs[5];

        System.out.println("String at 5 = " + str2);

    }

}
class ArithmeticExceptionDemo{// lỗi chia cho 0
    void method() throws ArithmeticException{
        throw new ArithmeticException("Enrorr: Arithmetic Exception");
    }
    public static void main(String[] args) {
        System.out.println("Three");

        // Phép chia này không có vấn đề.
        int value = 10 / 2;

        System.out.println("Two");

        // Phép chia này không có vấn đề.
        value = 10 / 1;

        System.out.println("One");

        // Phép chia này có vấn đề, chia cho 0.
        // Lỗi đã xẩy ra tại đây.
        value = 10 / 0;

        // Và dòng code dưới đây sẽ không được thực hiện.
        System.out.println("oop!");

    }
}
class ClassCastExceptionDemo{//Khi chuyển kiểu (Cast) từ đối tượng của 1 lớp cha về lớp con, hoặc từ 2 lớp không liên quan (không cha-con) với nhau.
    void method() throws ClassCastException{
        throw new ClassCastException("Class Cast Exception");
    }
    public static void main(String[] args) {
        System.out.println("True");
        //Lỗi

        Object x = new Integer (0);
        System.out.println ((String) x);

    }
}
class IOExceptionDemo {
    void method() throws IOException {
        throw new IOException("IO Exception ");
    }
    public static void main(String[] args ){}
}
class FileNotFoundExceptionDemo{
        void method() throws  FileNotFoundException{
        throw new FileNotFoundException("IO Exception ");
        }
    public static void main(String[] args) {
        /*File x = new File("src\\week7\\task2\\task2.txt");

        System.out.println( x.getName());*/
        /*try {
            File x = new File("src\\week7\\task2\\task2.txt");
            Scanner sc = new Scanner(x);
            String content = "";
            while(sc.hasNextLine()) {
                content += sc.nextLine()+"\r\n";
            }
            System.out.println(content);

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }//ko có lỗi


        try {
            File x = new File("src\\week7\\task2\\task21.txt");
            Scanner sc = new Scanner(x);
            String content = "";
            while(sc.hasNextLine()) {
                content += sc.nextLine()+"\r\n";
            }
            System.out.println(content);

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File Not Found Exception");
        }// có lỗi
    }
    }

*/

