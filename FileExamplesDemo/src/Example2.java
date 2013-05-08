import java.io.*;
import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<String>();
		File input = new File("c:\\myjava\\words.txt");

		FileInputStream in;

		try {
			in = new FileInputStream(input);
			int byteRead;
			try {
				String word = "";
				while ((byteRead = in.read()) != -1) {
					if (byteRead == 13) {
						wordList.add(word);
						in.read();
						word = "";
					} else {
						word += "" + (char) byteRead;

					}
				}

			} catch (IOException ex) {
			}
			System.out.println(wordList.size());
		} catch (FileNotFoundException ex) {
			System.out.println("No file Found");
		}
	}
}