package h1;

public class Faculdade {

	public static void main(String[] args) {
		Aluno bia = new Aluno("bia", "324", "654", "432");
		System.out.printf("\n\n===ALUNO===\nNome: %s\nCPF: %s\nTel: %s\nMatricula: %s", bia.nome, bia.CPF, bia.telefone, bia.matricula);
		
		Professor tio = new Professor("tio", "987", "34416445", 60.6, "istoria");
		System.out.printf("\n\n===PROFESSOR===\nNome: %s\nCPF: %s\nTel: %s\nSalario: %.2f\nDisciplinas: %s", tio.nome, tio.CPF, tio.telefone, tio.salario, tio.disciplinas);
		
		Funcionario tia = new Funcionario("tia", "645", "758", 800.76, "Tia da merenda");
		System.out.printf("\n\n===FUNCIONÁRIO===\nNome: %s\nCPF: %s\nTel: %s\nSalario: %.2f\nCargo: %s", tia.nome, tia.CPF, tia.telefone, tia.salario, tia.cargo);
	
	}

}
