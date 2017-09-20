package exemplo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInterface extends Remote {
	
	public String getData(String text) throws RemoteException; 

}
