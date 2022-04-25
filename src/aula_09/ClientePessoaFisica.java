package aula_09;

public class ClientePessoaFisica extends Cliente {
	private String cpf;

	public ClientePessoaFisica(String cpf, String nome, String endereco) {
		super(nome, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente Pessoa Fisica: \nNome: " + getNome() + "\nCpf: " + cpf + "\nEndereço: " + getEndereco();
	}

}
