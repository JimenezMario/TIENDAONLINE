package dinamita.onlineStore.DINAMITA.Service;

import java.util.List;

import dinamita.onlineStore.DINAMITA.Model.Producto;

public interface IntProducto {
	
	public List<Producto> obtenerProductos();
	public Producto buscarPorCodigo(int codigoProducto);
	public void eliminar(int codigoProducto);
	public void guardar(Producto producto);

}
