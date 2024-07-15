package Polimorfismo;

public class TesteExe {

	public static void main(String[] args) {
		Exe teste = new Exe("Super");
		ExeSub testinho = new ExeSub("Sub");
		
		teste.exp();
		testinho.exp();

	}

}
