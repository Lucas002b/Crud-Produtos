package CRUD;


public class Bean {
	private String  nome;
	private Double valor;		
	private String categoria;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getCategoria() {
		return categoria;
	}
	public Bean setCategoria(String categoria) {
		this.categoria = categoria;
		return null;
	}	
	


}
