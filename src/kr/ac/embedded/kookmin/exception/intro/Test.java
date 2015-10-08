package kr.ac.embedded.kookmin.exception.intro;

import java.io.*;

class Trade {
	public void readFile() {
		try {
			File afile = new File("C:\\a.txt");
			FileReader reader = new FileReader(afile);
			BufferedReader input = new BufferedReader(reader);
			String data;

			while ((data = input.readLine()) != null) {
				System.out.println(data);
			}
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
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
