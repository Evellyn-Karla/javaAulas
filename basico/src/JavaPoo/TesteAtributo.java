package JavaPoo;

public class TesteAtributo {

	public static void main(String[] args) {
		AtributosClasse cliente1 = new AtributosClasse();
		System.out.println(cliente1.fnome);
		System.out.println(cliente1.lnome);
		System.out.println(cliente1.idade);
		System.out.printf("O aluno %s %s tem %d anos", cliente1.fnome, cliente1.lnome, cliente1.idade);

	}

}
