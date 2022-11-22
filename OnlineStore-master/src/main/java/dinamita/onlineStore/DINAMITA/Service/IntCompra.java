package dinamita.onlineStore.DINAMITA.Service;

import java.util.List;

import dinamita.onlineStore.DINAMITA.Model.Compra;
import dinamita.onlineStore.DINAMITA.Model.Producto;

public interface IntCompra {

	public List<Compra> obtenerCompras();
	public Compra buscarPoFolio(int folioCompra);
	public void eliminar(int folioCompra);
	public void guardar(Compra compra);
}
