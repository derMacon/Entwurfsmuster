package headfirst.proxy.kaugummi;

import java.io.*;
  
public interface Zustand extends Serializable {
	public void münzeEinwerfen();
	public void münzeAuswerfen();
	public void griffDrehen();
	public void kugelAusgeben();
}
