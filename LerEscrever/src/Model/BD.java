package Model;

import java.util.ArrayList;

import Util.DocumentReader;
import Util.DocumentWriter;

public class BD {
	private ArrayList<Cliente> clientes;
	private String filename = "Clientes.txt";
	
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}



	//metodo construtor
	public BD(){
		//instanciar o array lista
		
		this.clientes= new ArrayList<Cliente>();
		//instanciar um document Reader
		DocumentReader dr = new DocumentReader();
		//ler as linhas
		ArrayList<String> Linhas = dr.read(filename);
		// percorrer o array list criando clients
		for (int i = 0; i < Linhas.size(); i++) {
			//separa a linha com ;
			String [] linhaCliente = Linhas.get(i).split(";");
			//cria o cliente
			Cliente c = new Cliente(linhaCliente[0], linhaCliente[1], Integer.parseInt(linhaCliente[2]));
			//enfiar cliente no arraylist
			this.clientes.add(c);
		}
	}
	
	
	
	//metodo que grava cliente
	public void gravarcliente (Cliente c){
		//colocar o cliente no arraylist
		this.clientes.add(c);
		//transformar cliente em string
		String cliente = c.getNome() + ";" + c.CPF + ";" + c.idade ;
		//instanciar um documentwiter
		DocumentWriter dw = new DocumentWriter();
		
		dw.write(this.filename, cliente);
	}
	
	
}
