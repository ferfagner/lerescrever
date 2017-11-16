package Main;

import java.util.ArrayList;

import Control.ControleCadastrarCliente;
import Control.ControleExibirClientes;
import Model.BD;
import Model.Cliente;

public class Principal {

	public static void main(String[] args) {
		BD bd = new BD();
	//instanciar controleExibirClientes
		ControleExibirClientes cec = new ControleExibirClientes(bd);
		ControleCadastrarCliente ccc = new ControleCadastrarCliente(bd);
		//exibir todos os clientes
		cec.exibirClientes(bd);
		ccc.cadastrarCliente();
		cec.exibirClientes(bd);
	
		
}
}
