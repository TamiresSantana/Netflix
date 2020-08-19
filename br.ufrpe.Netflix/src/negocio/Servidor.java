package negocio;

import javafx.scene.image.ImageView;
import negocio.beans.Administrador;
import negocio.beans.Cliente;
import negocio.beans.Filme;

public class Servidor 
{
	private CadastroCliente clientes;
	private CadastroAdministrador administrador;
	private CadastroFilme filmes;
	
	private static Servidor instance;
	
	private Servidor()
	{
		this.clientes = new CadastroCliente();
		this.administrador = new CadastroAdministrador();
		this.filmes = new CadastroFilme();
	}
	
	public static Servidor getInstance()
	{
		 if (instance == null) 
		 {
			 instance = new Servidor();
	     }
		 return instance;
	}
	
	public void cadastrarCliente(Cliente x)
	{
		clientes.cadastrarCliente(x);
	}
	
	public Cliente buscarCliente(String x)
	{
		return clientes.buscarCliente(x);
	}
	
	public int buscarClienteIndice(String x)
	{
		return clientes.buscarClienteIndice(x);
	}
	
	public Cliente buscarClienteSenha(String email, String senha)
	{
		return clientes.buscarClienteSenha(email,senha);
	}
	
	public void alterarClienteSenha(String email, String senha)
	{
		clientes.alterarClienteSenha(email, senha);
	}
	
	//Adm
	
	public void cadastrarAdministrador(Administrador x)
	{
		this.administrador.cadastrarAdministrador(x);
	}
	
	public Administrador buscarAdministrador(String x)
	{
		return administrador.buscarAdministrador(x);
	}
	
	public int buscarAdministradorIndice(String x)
	{
		return administrador.buscarAdministradorIndice(x);
	}
	
	public Administrador buscarAdministradorSenha(String email, String senha)
	{
		return administrador.buscarAdministradorSenha(email, senha);
	}
	
	public void alterarAdministradorSenha(String email, String senha)
	{
		this.administrador.alterarAdministradorSenha(email, senha);
	}
	
	
	//Filmes
	
	public void cadastrarFilme(Filme x)
	{
		this.filmes.cadastrarFilme(x);
	}
	
	public Filme buscarFilme(String x)
	{
		return filmes.buscarFilme(x);
	}
	
	public int buscarFilmeIndice(String x)
	{
		return filmes.buscarFilmeIndice(x);
	}
	
	public void alterarFilmeSinopse(String titulo, String sinopse)
	{
		this.filmes.alterarFilmeSinopse(titulo, sinopse);
	}
	
	public void alterarFilmeCapa(String titulo, ImageView capa)
	{
		this.filmes.alterarFilmeCapa(titulo, capa);
	}
	
	public void apagarFilme(String titulo)
	{
		this.filmes.apagarFilme(titulo);
	}
}
















