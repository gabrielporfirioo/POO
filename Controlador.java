package pooAV2;

public class Controlador {

	public static void main(String[] args) {
		
		
		Mensalista men = new Mensalista("caio", 20);
		System.out.println(men.getNome());
		System.out.println(men.getIdade());
		men.diaria=100;
		men.dias=25;
		men.calSalario();
		men.realizarTarefa();
		
		System.out.println();
		
		Horista hor = new Horista("leticia", 21);
		System.out.println(hor.getNome());
		System.out.println(hor.getIdade());
		hor.horas= 150;
		hor.valorHora=20;
		hor.calSalario();
		hor.realizarTarefa();
		

	}

}
