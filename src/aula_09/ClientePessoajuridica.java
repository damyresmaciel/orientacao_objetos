package aula_09;

public class ClientePessoajuridica extends Cliente {
	private String cnpj;

	public ClientePessoajuridica(String cnpj, String nome, String endereco) {
		super(nome, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "ClientePessoajuridica \nCnpj= " + cnpj + "\nNome: " + getNome() + "\nEndereço: " + getEndereco();
	}
	

}
