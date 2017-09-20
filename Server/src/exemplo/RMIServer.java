package exemplo;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer extends UnicastRemoteObject implements HelloInterface {

    protected RMIServer() throws RemoteException {	
	}
        @Override
	public String getData(String text) throws RemoteException { 
            text = "Ola ...." + text; 
            return text;	
        }
        
	public static void main(String[] args) {
		try {
                        Registry reg = LocateRegistry.createRegistry(1099);
			reg.rebind("Server", new RMIServer());
			System.out.println("Ola o servidor esta pronto e inicializado, execute o cliente para obter o resultado");
		} catch (Exception e) {
			System.out.println("Hello Server failed: " + e);
			e.printStackTrace();
		}
	}

}
