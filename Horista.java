package pooAV2;


//Herança de funcionario
public class Horista extends Funcionario{
	
	//Construtor
	public Horista(String nome, int idade) {
		super(nome, idade);
		
	}


	int salarioHorista;
	int horas;
	int valorHora;

		//Calcular o salario do horista
		public void calSalario() {
			salarioHorista = horas * valorHora;
			System.out.println("salario horista: " + salarioHorista); 
			
		}

		// (Polimorfismo) utilizando o método realizarTarefa() da classe Funcionario.
		public void realizarTarefa() {
			super.realizarTarefa();
		}

}
