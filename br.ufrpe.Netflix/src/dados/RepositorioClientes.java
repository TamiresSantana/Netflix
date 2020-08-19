package dados;

import java.util.ArrayList;

import negocio.beans.Cliente;

public class RepositorioClientes 
{
	ArrayList <Cliente> clientes;
	
	private static RepositorioClientes instance;
	
	
	public static RepositorioClientes getInstance() 
	{
		if (instance == null) 
	    {
	       instance = new RepositorioClientes();
	    }
	      return instance;
	 }

	private RepositorioClientes()
	{
		this.clientes = new ArrayList();
	}
	
	
	public void cadastrarCliente(Cliente x)
	{
		clientes.add(x);
	}
	
	//buscar email
	public Cliente buscarCliente(String x)
	{
		for(int i = 0; i < clientes.size(); i++)
		{
			if(clientes.get(i).getEmail().equals(x))
			{
				return clientes.get(i);
			}
		}
		return null;
	}
	
	
	//buscar indice
	public int buscarClienteIndice(String x)
	{
		for(int i = 0; i < clientes.size(); i++)
		{
			if(clientes.get(i).getEmail().equals(x))
			{
				return i;
			}
		}
		return -1;
	}
	
	
	//buscar email senha
	public Cliente buscarClienteSenha(String email, String senha)
	{
		for(int i = 0; i < clientes.size(); i++)
		{
			if(clientes.get(i).getEmail().equals(email))
			{
				if(clientes.get(i).getSenha().equals(senha))
				{
					return clientes.get(i);
				}
			}
		}
		return null;
	}
	
	
	public void alterarClienteSenha(String email, String senha)
	{
		if(buscarCliente(email) != null)
		{
			buscarCliente(email).setSenha(senha);
		}
	}
	
}









