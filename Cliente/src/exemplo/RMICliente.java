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
            Registry reg = LocateRegistry.getRegistry("192.168.1.9",1099); // especifica o ip do servidor e porta
            HelloInterface rmi = (HelloInterface) reg.lookup("Server");  // nome do servidor
            String text = rmi.getData("Texto enviado pelo cliente");  // obejeto a ser enviado para o servidor.
            System.out.println(text); // retorno do objeto vindo do servidor
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
