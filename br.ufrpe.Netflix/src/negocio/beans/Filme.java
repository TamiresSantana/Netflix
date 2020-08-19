package negocio.beans;

import java.io.File;

import javafx.scene.image.ImageView;

public class Filme 
{
	String titulo;
	String generos;
	int qdtAssist;
	String sinopse;
	ImageView capa;
	File filme;
	
	public Filme(String titulo, String generos, String sinopse, ImageView capa, File filme) 
	{
		super();
		this.titulo = titulo;
		this.generos = generos;
		this.qdtAssist = 0;
		this.sinopse = sinopse;
		this.capa = capa;
		this.filme = filme;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGeneros() {
		return generos;
	}

	public void setGeneros(String generos) {
		this.generos = generos;
	}

	public int getQdtAssist() 
	{
		return qdtAssist;
	}

	public void setQdtAssist() 
	{
		this.qdtAssist++;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public ImageView getCapa() {
		return capa;
	}

	public void setCapa(ImageView capa) {
		this.capa = capa;
	}

	public File getFilme() {
		return filme;
	}

	public void setFilme(File filme) {
		this.filme = filme;
	}

	@Override
	public String toString() 
	{
		return "" + titulo + "\n" + generos + "\n" + qdtAssist + " pessoas assistiram esse filme.";
	}
	
	public String toStringSinopse() 
	{
		return "" + titulo + "\n" + generos + "\n" + qdtAssist + " pessoas assistiram esse filme.\n" + sinopse;
	}
	
}
