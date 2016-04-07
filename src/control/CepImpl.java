package control;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import model.Endereco;

@SuppressWarnings("serial")
public class CepImpl extends UnicastRemoteObject implements ICep {
	
	public CepImpl() throws RemoteException{
	super();	
	}
	
	public Object consulta(String cep) throws RemoteException{
		Endereco logradouro = new Endereco(cep);
		logradouro.consultaCep();
		
		return logradouro;
	}
	

}
