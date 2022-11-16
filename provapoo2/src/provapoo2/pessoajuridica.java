package provapoo2;

public class pessoajuridica extends Pessoa{
	protected String cnpj;
	public pessoajuridica(String nome, String telefone, String endereco) {
		super(nome, telefone, endereco);
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public pessoajuridica(String nome, String telefone, String endereco, String cnpj) {
		super(nome, telefone, endereco);
		this.cnpj = cnpj;
	}
	@Override
	public String toString() {
		return "pessoajuridica [cnpj=" + cnpj + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco;
	}

	
	

}
