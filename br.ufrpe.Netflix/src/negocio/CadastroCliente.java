package negocio;

import dados.RepositorioClientes;
import negocio.beans.Cliente;

public class CadastroCliente 
{
	private RepositorioClientes repositorio;
	
	
	public CadastroCliente()
	{
		this.repositorio = RepositorioClientes.getInstance();
	}
	
	public void cadastrarCliente(Cliente x)
	{
		this.repositorio.cadastrarCliente(x);
	}
	
	public Cliente buscarCliente(String x)
	{
		return this.repositorio.buscarCliente(x);
	}
	
	public int buscarClienteIndice(String x)
	{
		return this.repositorio.buscarClienteIndice(x);
	}
	
	public Cliente buscarClienteSenha(String email, String senha)
	{
		return this.repositorio.buscarClienteSenha(email,senha);
	}
	
	public void alterarClienteSenha(String email, String senha)
	{
		this.repositorio.alterarClienteSenha(email, senha);
	}
	
}











