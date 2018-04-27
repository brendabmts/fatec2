package br.emprestimo.modelo;

public class Livro {
	private String isbn;
	private String titulo;
	private String autor;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		//if (isbn == "" | isbn == null)
		if (isbn == null) {
			throw new RuntimeException("ISBN invalido");
		}
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
		
	public void setAutor(String autor) {
		if (autor == null) {
			throw new RuntimeException("Autor invalido");
			}
		this.autor = autor;
	}
}
