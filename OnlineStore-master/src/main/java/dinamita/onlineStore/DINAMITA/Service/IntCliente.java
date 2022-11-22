package dinamita.onlineStore.DINAMITA.Service;

import java.util.List;

import dinamita.onlineStore.DINAMITA.Model.Cliente;

public interface IntCliente {
	
	public List<Cliente> obtenerClientes();
	public Cliente buscarClaveCliente(int claveCliente);
	public void eliminar(int claveCliente);
	public void guardar(Cliente cliente);

}
