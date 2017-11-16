package Control;

import java.util.ArrayList;

import Model.BD;
import Model.Cliente;
import View.ViewExibirClientes;

public class ControleExibirClientes {
	private BD bds;
	private ViewExibirClientes vec;
	public ControleExibirClientes(BD bds) {
		super();
		this.bds = bds;
		this.vec = new ViewExibirClientes();
	}
	
	//metodo que recupera os cliente e exibe
	
	public void exibirClientes(BD bds){
		ArrayList<Cliente> clientes = bds.getClientes();
		
		this.vec.exibirClientes(clientes);
	}
	
}
