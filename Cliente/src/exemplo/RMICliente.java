package exemplo;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMICliente {

	public static void main(String[] args) {

            RMICliente cliente = new RMICliente();
            cliente.conectSeerver();
            
	}

    private void conectSeerver() {
        try {
            Registry reg = LocateRegistry.getRegistry("192.168.1.36",1099);
            HelloInterface rmi = (HelloInterface) reg.lookup("Server");
            String text = rmi.getData("Texto enviado pelo cliente");
            System.out.println(text);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
