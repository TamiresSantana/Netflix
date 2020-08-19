package negocio;

import dados.RepositorioFilmes;
import javafx.scene.image.ImageView;
import negocio.beans.Filme;

public class CadastroFilme 
{
	private RepositorioFilmes repositorio;
	
	
	public CadastroFilme()
	{
		this.repositorio = RepositorioFilmes.getInstance();
	}
	
	public void cadastrarFilme(Filme x)
	{
		this.repositorio.cadastrarFilme(x);
	}
	
	public Filme buscarFilme(String x)
	{
		return repositorio.buscarFilme(x);
	}
	
	public int buscarFilmeIndice(String x)
	{
		return repositorio.buscarFilmeIndice(x);
	}
	
	public void alterarFilmeSinopse(String titulo, String sinopse)
	{
		this.repositorio.alterarFilmeSinopse(titulo, sinopse);
	}
	
	public void alterarFilmeCapa(String titulo, ImageView capa)
	{
		this.repositorio.alterarFilmeCapa(titulo, capa);
	}
	
	public void apagarFilme(String titulo)
	{
		this.repositorio.apagarFilme(titulo);
	}
	
}

















