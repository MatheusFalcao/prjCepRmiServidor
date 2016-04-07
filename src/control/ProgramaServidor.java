package control;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ProgramaServidor {

	public static void main(String[] args) throws Exception {
		//Instancia do Reposit�rio
		LocateRegistry.createRegistry(1099);
		
		//Instancia do Servi�o
		CepImpl impl = new CepImpl();
		
		//publico o servi�o no repositorio
		Naming.bind("ConsultarLogradouro", impl);
		System.out.println("Servidor est� Online");
	}

}
