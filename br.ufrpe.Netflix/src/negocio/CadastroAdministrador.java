package negocio;

import dados.RepositorioAdministrador;
import negocio.beans.Administrador;

public class CadastroAdministrador 
{
	private RepositorioAdministrador repositorio;
	
	
	public CadastroAdministrador()
	{
		this.repositorio = RepositorioAdministrador.getInstance();
	}
	
	public void cadastrarAdministrador(Administrador x)
	{
		this.repositorio.cadastrarAdministrador(x);
	}
	
	public Administrador buscarAdministrador(String x)
	{
		return repositorio.buscarAdministrador(x);
	}
	
	public int buscarAdministradorIndice(String x)
	{
		return repositorio.buscarAdministradorIndice(x);
	}
	
	public Administrador buscarAdministradorSenha(String email, String senha)
	{
		return repositorio.buscarAdministradorSenha(email, senha);
	}
	
	public void alterarAdministradorSenha(String email, String senha)
	{
		this.repositorio.alterarAdministradorSenha(email, senha);
	}
	
	
}















