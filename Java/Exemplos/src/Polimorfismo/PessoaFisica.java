package Polimorfismo;

public class PessoaFisica extends Pessoa1
{
	private long cpf;
	
	public PessoaFisica()//-------------------------------------------------------------Construtor Vazio
	{
		
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	
	public String getNome()
	{
		return "Pessoa f�sica " +super.getNome()+" - CPF: "+this.getCpf();
	}
	
	
}
