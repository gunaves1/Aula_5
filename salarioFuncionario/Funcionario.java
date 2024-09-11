package salarioFuncionario;

public interface Funcionario {
	
	public long id();
	public String nome();
	public String telefone();
	public int matricula();
	public String endereco();
	public void calculaSalario();
	
}
