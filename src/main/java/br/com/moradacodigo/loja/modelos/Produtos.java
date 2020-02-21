package br.com.moradacodigo.loja.modelos;

public class Produtos {
	
	private String titulo;
	private String descricao;
	private Integer paginas;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Integer getPaginas() {
		return paginas;
	}
	
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Produtos [titulo=" + titulo + ", "
		+ "descricao=" + descricao + ", paginas=" + paginas + "]";
	}
	
	
}
