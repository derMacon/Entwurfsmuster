package headfirst.proxy.kaugummi;

import java.rmi.*;
 
public interface KaugummiAutomatRemote extends Remote {
	public int getAnzahl() throws RemoteException;
	public String getStandort() throws RemoteException;
	public Zustand getZustand() throws RemoteException;
}
