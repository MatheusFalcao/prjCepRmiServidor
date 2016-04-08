package control;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import model.Endereco;

@SuppressWarnings("serial")
public class CepImpl extends UnicastRemoteObject implements ICep {
	
	public CepImpl() throws RemoteException{
	super();	
	}
	
	public String[] consulta(String cep) throws RemoteException{
		Endereco logradouro = new Endereco(cep);
		logradouro.consultaCep();
		String dados[] = new String[4];
		
		dados[0] = logradouro.getCep();
		dados[1] = logradouro.getEstado();
		dados[2] = logradouro.getRua();
		dados[3] = logradouro.getTipoLog();
		
		return dados;
	}
	

}
