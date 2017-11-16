package Model;

public class Cliente {
	public String nome;
	public String CPF;
	public int	idade;
	
	
	
	
	
	public Cliente(String nome, String cPF, int idade) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.idade = idade;
	}
	
	
	@Override
	public String toString() {
		return "Cliente Nome: " + nome + "\n" + "CPF: " + CPF + "\n" + "Idade: " + idade +
				"\n " + "---------------------";
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
}
