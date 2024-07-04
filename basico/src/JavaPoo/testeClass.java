package JavaPoo;

public class testeClass {

	public static void main(String[] args) {
		ClassePessoa aluno1 = new ClassePessoa();
		aluno1.nome = "mila";
		System.out.println("Nome da primeira aluna: " + aluno1.nome);
		aluno1.comer();
		
		ClassePessoa aluno2 = new ClassePessoa();
		aluno2.nome = "Mia";
		System.out.println(aluno2.nome);

	}

}
