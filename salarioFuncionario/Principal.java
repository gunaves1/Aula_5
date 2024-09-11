package salarioFuncionario;

public class Principal {

	public static void main(String[] args) {
		Jornada jornada = new Jornada();
		Horista horista = new Horista();
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		
		jornada.id();
		jornada.nome();
		jornada.telefone();
		jornada.matricula();
		jornada.endereco();
		jornada.calculaSalario();

		horista.id();
		horista.nome();
		horista.telefone();
		horista.matricula();
		horista.endereco();
		horista.calculaSalario();
		
		pessoaJuridica.id();
		pessoaJuridica.nome();
		pessoaJuridica.telefone();
		pessoaJuridica.matricula();
		pessoaJuridica.endereco();
		pessoaJuridica.calculaSalario();
	}

}
