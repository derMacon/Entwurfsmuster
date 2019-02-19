package headfirst.decorator.io;

import java.io.*;

public class EingabeTest {
	public static void main(String[] args) throws IOException {
		int c;

		try {
			InputStream in = 
				new KleinbuchstabenInputStream(
					new BufferedInputStream(
						new FileInputStream("test.txt")));

			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
