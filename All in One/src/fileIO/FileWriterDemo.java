package fileIO;


import java.io.*;

public class FileWriterDemo {

    public static void main(String[] args) {
        // character stream

//        try {
//            FileWriter fileWriter = new FileWriter("C:\\Users\\M1082861\\Desktop\\demo.txt");
////            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//            fileWriter.write("Today is friday");
//            System.out.println("File write successfully");
//
////            bufferedWriter.close();
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            FileReader fileReader = new FileReader("C:\\Users\\M1082861\\Desktop\\demo.txt");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println("File read successfully");
            int i = fileReader.read();
            while ( i > 0){
                System.out.print((char) i);
                i = fileReader.read();
            }
//            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}