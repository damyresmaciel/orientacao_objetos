package oo;


public class Programa {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Maria Cruz", "Avenida S�o Sebasti�o, S�o Paulo. ");
		cliente.getNome();
		cliente.getEndereco();
		
		ClientePessoaFisica pf = new ClientePessoaFisica("044-122-334.33", "Pedro Alves", "Rio de janeiro");
		pf.getCpf();
		pf.getNome();
		pf.getEndereco();
		ClientePessoajuridica pj = new ClientePessoajuridica("948664748484", "J�ao Lu�z", "Minas Gerais");
		pj.getCnpj();
		pj.getNome();
		pj.getEndereco();
		
		System.out.println(cliente.toString());
		System.out.println();
		System.out.println(pf.toString());
		System.out.println();
		System.out.println(pj.toString());
		
		
	}
}
