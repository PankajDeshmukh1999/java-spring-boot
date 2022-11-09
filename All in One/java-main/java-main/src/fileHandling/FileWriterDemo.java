package fileHandling;

import java.io.*;

public class FileWriterDemo {

    public static void main(String[] args) {
        // character stream

        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\LENOVO\\IdeaProjects\\pankaj\\src\\fileHandling\\fileWriterTest.txt");
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            fileWriter.write("Today is Sunday");
            System.out.println("File write successfully");

//            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader("C:\\Users\\LENOVO\\IdeaProjects\\pankaj\\src\\fileHandling\\fileWriterTest.txt");
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
