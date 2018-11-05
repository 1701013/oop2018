package week9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

import static javax.script.ScriptEngine.FILENAME;

public class Utils {
    public static  String readContentFromFile(String path) {
        /*File x = new File("src\\week7\\task2\\task2.txt");

        System.out.println( x.getName());*/
        /*path="src\\week7\\task2\\task2.txt";
        try {
            File x = new File(path);
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
    return null;


    };*/

            StringBuilder contentBuilder = new StringBuilder();

            try (Stream<String> stream = Files.lines( Paths.get(path), StandardCharsets.UTF_8))
            {
                stream.forEach(s -> contentBuilder.append(s).append("\n"));
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            return contentBuilder.toString();
        }

    public static void writeContentToFile(String path){

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            String content = "OOP week9\n";

            bw.write(content);//tự đong file



            //System.out.println("Viet file xong!");

        } catch (IOException e) {

            e.printStackTrace();

        }


    }
    public static void writeToFile(String path){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            String content = "Write to file\n";
            bw.write(content);
            //System.out.println("Xong");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath);
        if (file.exists()) {
            if (file.isFile()) {
                if (file.getName().endsWith(fileName)) {
                    System.out.println(file.getAbsolutePath() + "\n");
                }
                else{System.out.println("Không tìm thấy ");}
            }


                //kiểm tra đường dẫn có dẫn đến 1 file hay ko
                //true -> kiểm tra file có là fileName hay ko
                File[] listFile = file.listFiles();
             if (listFile != null) {
                    for (File f : listFile) {
                        findFileByName(f.getAbsolutePath(), fileName);
                    }
                }
                //false(là thư mục) ->kiểm tra trong thư mục có file == file Name hay ko

            }

        else {
            System.out.println("source không tồn tại");
        }
        return null;
    }
    public static void main(String[] args) {
        String path = "src\\week7\\task2\\task2.txt";
        System.out.println( readContentFromFile(path ) );
         writeContentToFile(path ) ;
        System.out.println( readContentFromFile(path ) );
        writeToFile(path);
        System.out.println( readContentFromFile(path ) );
        findFileByName("src\\week7\\task2","task2.txt");
        findFileByName("src\\week10","OOP.txt");// folderPath sai
        findFileByName("src\\week7\\task2","task3.txt");// trong week7\\task2 chứa 2 file >> so sánh 2 lần >> in ra 2 lần "không tìm thấy"

    }
}
