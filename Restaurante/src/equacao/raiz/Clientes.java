package equacao.raiz;

public class Clientes {
	private String nome;
	private int quantidade;
	private double valorCompra;
	private double valorDiv;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public double getValorDiv() {
		this.valorDiv = valorDiv + valorCompra / quantidade;
		return valorDiv;
	}
}
