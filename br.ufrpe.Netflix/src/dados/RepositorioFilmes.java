package dados;

import java.util.ArrayList;

import javafx.scene.image.ImageView;
import negocio.beans.Filme;


public class RepositorioFilmes 
{
ArrayList <Filme> filmes;
	
	private static RepositorioFilmes instance;
	
	
	public static RepositorioFilmes getInstance() 
	{
		if (instance == null) 
	    {
	       instance = new RepositorioFilmes();
	    }
	      return instance;
	 }

	private RepositorioFilmes()
	{
		this.filmes = new ArrayList();
	}
	
	
	public void cadastrarFilme(Filme x)
	{
		filmes.add(x);
	}
	
	
	public Filme buscarFilme(String x)
	{
		for(int i = 0; i < filmes.size(); i++)
		{
			if(filmes.get(i).getTitulo().equals(x))
			{
				return filmes.get(i);
			}
		}
		return null;
	}
	
	public int buscarFilmeIndice(String x)
	{
		for(int i = 0; i < filmes.size(); i++)
		{
			if(filmes.get(i).getTitulo().equals(x))
			{
				return i;
			}
		}
		return -1;
	}
	
	
	public void alterarFilmeSinopse(String titulo, String sinopse)
	{
		if(buscarFilme(titulo) != null)
		{
			buscarFilme(titulo).setSinopse(sinopse);
		}
	}
	
	
	public void alterarFilmeCapa(String titulo, ImageView capa)
	{
		if(buscarFilme(titulo) != null)
		{
			buscarFilme(titulo).setCapa(capa);
		}
	}
	
	
	public void apagarFilme(String titulo)
	{
		if(buscarFilme(titulo) != null)
		{
			filmes.remove(buscarFilme(titulo));
		}
	}
	
}









