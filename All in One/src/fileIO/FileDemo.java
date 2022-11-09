package fileIO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\M1082861\\Desktop");
		int data = 0;
		while((data=fileInputStream.read())!=-1) {
			System.out.println((char)data);
		}
		fileInputStream.close();
	}
}
