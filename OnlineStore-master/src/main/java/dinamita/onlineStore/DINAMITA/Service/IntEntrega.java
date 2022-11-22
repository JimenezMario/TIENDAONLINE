package dinamita.onlineStore.DINAMITA.Service;

import java.util.List;

import dinamita.onlineStore.DINAMITA.Model.Entrega;

public interface IntEntrega {
	
	public List<Entrega> obtenerEntregas();
	public void guardar(Entrega entrega);
	public Entrega buscarPorClave(int claveEntrega);
	public void eliminar(int claveEntrega);
}
