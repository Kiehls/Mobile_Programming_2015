package kr.ac.embedded.kookmin.exception.intro;

import java.io.*;

class Trade {
	public void readFile() {
		FileReader reader = null;
		BufferedReader input = null;
		
		try {
			reader = new FileReader("C:\\a.txt");
			input = new BufferedReader(reader);
			String data;

			while ((data = input.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trade a = new Trade();
		a.readFile();
	}

}
