import java.io.*;

public class Example1 {

	public static void main(String[] args) {
		
		//Creates reference-Not the file on the disk
		File myFileRef = new File("c:\\myJava\\example1.txt");
		

		try {
			// Create the file on disk
			myFileRef.createNewFile();
	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
