package Models;

public class Livro {
	
	/**
	 * Nomes de variáveis trocadas para a facilitar o entendimento.
	 */
	
	private String titulo;
	private String autor;
	private String genero;
	private int ano;
	private boolean foiLido;

	
	public Livro(String titulo, String autor, String genero, int ano, boolean lido) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.ano = ano;
		this.foiLido = lido;
	}
	
	public String toString() {
		return "Titulo: " + this.titulo + 
				" Autor: " + this.autor + 
				" Genero: " + this.genero + 
				" Ano: " + this.ano +
				"Lido: " + this.foiLido;
	}

	public String getTitle() {
		return titulo;
	}

	public void setTitle(String title) {
		this.titulo = title;
	}

	public String getAuthor() {
		return autor;
	}

	public void setAuthor(String author) {
		this.autor = author;
	}

	public String getGender() {
		return genero;
	}

	public void setGender(String gender) {
		this.genero = gender;
	}

	public int getYear() {
		return ano;
	}

	public void setYear(int year) {
		this.ano = year;
	}

	public boolean isRead() {
		return foiLido;
	}

	public void setRead(boolean isRead) {
		this.foiLido = isRead;
	}
	
	
}
