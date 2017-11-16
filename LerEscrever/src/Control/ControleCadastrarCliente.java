package Control;

import Model.BD;
import Model.Cliente;
import View.ViewCadastrarCliente;

public class ControleCadastrarCliente {
	//atributo
	private BD bds;
	
	public ControleCadastrarCliente(BD bds){
		this.bds = bds;
		
	}
	public void cadastrarCliente(){
		ViewCadastrarCliente vcc = new ViewCadastrarCliente();
		vcc.obterDadosCliente();
		Cliente c = new Cliente(vcc.getNome(), vcc.getCpf(), Integer.parseInt(vcc.getIdade()));
		//guardar cliente no banco de dados
		this.bds.gravarcliente(c);
	}
}
