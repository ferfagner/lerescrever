package View;

import javax.swing.JOptionPane;

public class ViewCadastrarCliente {
	//atributos
	private String nome;
	private String cpf;
	private String idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	
	//metodo obter dados do cliente
	
	public void obterDadosCliente (){
		// obtendo dados do cliente
		this.setNome(JOptionPane.showInputDialog("Informe o nome do Cliente"));
		this.setCpf(JOptionPane.showInputDialog("Digite o CPF"));
		this.setIdade(JOptionPane.showInputDialog("Informe a IDADE"));
	}
	
	
	
}
