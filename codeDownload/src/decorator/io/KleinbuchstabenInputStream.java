package headfirst.decorator.io;

import java.io.*;

public class KleinbuchstabenInputStream extends FilterInputStream {

	public KleinbuchstabenInputStream(InputStream in) {
		super(in);
	}
 
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}
		
	public int read(byte[] b, int offset, int len) throws IOException {
		int ergebnis = super.read(b, offset, len);
		for (int i = offset; i < offset+ergebnis; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return ergebnis;
	}
}
