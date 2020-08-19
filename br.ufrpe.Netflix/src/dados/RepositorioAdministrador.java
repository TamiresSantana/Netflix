package dados;

import java.util.ArrayList;

import negocio.beans.Administrador;


public class RepositorioAdministrador 
{
	ArrayList <Administrador> adms;
	
	private static RepositorioAdministrador instance;
	
	
	public static RepositorioAdministrador getInstance() 
	{
		if (instance == null) 
	    {
	       instance = new RepositorioAdministrador();
	    }
	      return instance;
	 }

	private RepositorioAdministrador()
	{
		this.adms = new ArrayList();
	}
	
	
	public void cadastrarAdministrador(Administrador x)
	{
		adms.add(x);
	}
	
	//buscar email
	public Administrador buscarAdministrador(String x)
	{
		for(int i = 0; i < adms.size(); i++)
		{
			if(adms.get(i).getEmail().equals(x))
			{
				return adms.get(i);
			}
		}
		return null;
	}
	
	
	//buscar indice
	public int buscarAdministradorIndice(String x)
	{
		for(int i = 0; i < adms.size(); i++)
		{
			if(adms.get(i).getEmail().equals(x))
			{
				return i;
			}
		}
		return -1;
	}
	
	
	//buscar email senha
	public Administrador buscarAdministradorSenha(String email, String senha)
	{
		for(int i = 0; i < adms.size(); i++)
		{
			if(adms.get(i).getEmail().equals(email))
			{
				if(adms.get(i).getSenha().equals(senha))
				{
					return adms.get(i);
				}
			}
		}
		return null;
	}
	
	
	public void alterarAdministradorSenha(String email, String senha)
	{
		if(buscarAdministrador(email) != null)
		{
			buscarAdministrador(email).setSenha(senha);
		}
	}

}
