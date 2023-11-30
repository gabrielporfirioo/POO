package pooAV2;

public class Funcionario {
	//atibutos privados
	private String nome;
	private int idade;
	
	
	public Funcionario (String nome, int idade) {
		this.nome = nome;
		this.idade=idade;
	}

	//encapsulamento dos atributos nome e idade
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//método polimorfico utilizado nas classes mensalista e horista
	public void realizarTarefa() {
		System.out.println("Modelar banco de dados");
		
	}
	
	
}
