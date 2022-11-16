package provapoo2;

public class Pessoafisica extends Pessoa {
	protected String cpf;
	public Pessoafisica(String nome, String telefone, String endereco) {
		super(nome, telefone, endereco);
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Pessoafisica(String nome, String telefone, String endereco, String cpf) {
		super(nome, telefone, endereco);
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "Pessoafisica [cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco;
	}
	
	
}
