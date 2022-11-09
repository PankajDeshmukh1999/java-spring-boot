package fileHandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileHandlingDemo {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\LENOVO\\IdeaProjects\\pankaj\\src\\fileHandling\\test.txt");   //creating object of the file
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
// Byte stream
        try {
             fileOutputStream = new FileOutputStream(file);
            String str = "Welcome to the jungle";
            byte []  arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("File handled successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                fileOutputStream.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        try {
            fileInputStream = new FileInputStream(file);
            int i = fileInputStream.read();
            while ( i > 0){
                System.out.print((char) i);
                i  = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
// finally always execute
// fileOutPutStream for create  file0