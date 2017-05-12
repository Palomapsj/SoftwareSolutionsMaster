package equacao.raiz;

public class Teste {

	public static void main(String[] args) {
		Clientes teste = new Clientes();
		teste.setNome("Paloma");
		teste.setQuantidade(2);
		teste.setValorCompra(280);
		
		Clientes pp = new Clientes();
		pp.setNome("Marcela");
		pp.setQuantidade(1);
		pp.setValorCompra(280);
		
		System.out.println("Nome: " + teste.getNome() + " Quantidade de pessoas: " + teste.getQuantidade() + " Valor dividido: " + teste.getValorDiv());
		System.out.println("Nome: " + pp.getNome() + " Quantidade de pessoas: " + pp.getQuantidade() + " Valor dividido: " + pp.getValorDiv());

	}

}
