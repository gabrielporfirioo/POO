package pooAV2;


//Herança de funcionario
public class Mensalista extends Funcionario {
	
	
	//Construtor
	public Mensalista(String nome, int idade) {
		super(nome, idade);
}


	int salarioMensal;
	int diaria;
	int dias;

		//Calculo salario mensalista
		public void calSalario() {
			salarioMensal = diaria * dias;
			System.out.println("salario mensal: " + salarioMensal); 
		}

		// (Polimorfismo) utilizando o método realizarTarefa() da classe Funcionario.
		public void realizarTarefa() {
			super.realizarTarefa();
		}
				
}
