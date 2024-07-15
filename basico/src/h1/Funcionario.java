package h1;

public class Funcionario extends Pessoa{
	
	public String cargo;
	public double salario;

	public Funcionario(String nome, String CPF, String telefone, double salario, String cargo ) {
		super(nome, CPF, telefone);
		this.cargo = cargo;
		this.salario = salario;
	
	}

}
