package control;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ProgramaServidor {

	public static void main(String[] args) throws Exception {
		//Instancia do Repositório
		LocateRegistry.createRegistry(1099);
		
		//Instancia do Serviço
		CepImpl impl = new CepImpl();
		
		//publico o serviço no repositorio
		Naming.bind("ConsultarLogradouro", impl);
		System.out.println("Servidor está Online");
	}

}
