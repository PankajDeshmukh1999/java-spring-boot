package fileHandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferWriterDemo {

    public static void main(String[] args) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\LENOVO\\IdeaProjects\\pankaj\\src\\fileHandling\\BufferDemo.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            String str = "I am in pune";
            byte [] arr = str.getBytes();
            bufferedOutputStream.write(arr);
            System.out.println("File write successfully");

            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\LENOVO\\IdeaProjects\\pankaj\\src\\fileHandling\\BufferDemo.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            int i  = fileInputStream.read();
            while (i > 0){
                System.out.print((char) i);
                i = fileInputStream.read();
            }
            bufferedInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
