package dinamita.onlineStore.DINAMITA.ServiceJpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dinamita.onlineStore.DINAMITA.Model.Producto;
import dinamita.onlineStore.DINAMITA.Repository.ProductoRepository;
import dinamita.onlineStore.DINAMITA.Service.IntProducto;

@Service
public class ProductoServiceJpa implements IntProducto {

	@Autowired
	private ProductoRepository repoProducto;

	@Override
	public List<Producto> obtenerProductos() {
		// TODO Auto-generated method stub
		return repoProducto.findAll();
	}

	@Override
	public Producto buscarPorCodigo(int codigoProducto) {
		// TODO Auto-generated method stub
		Optional<Producto> producto = repoProducto.findById(codigoProducto);
		if (producto.isPresent()) {
			return producto.get();
		} else {
			return null;
		}
	}

	@Override
	public void eliminar(int codigoProducto) {
		// TODO Auto-generated method stub
		repoProducto.deleteById(codigoProducto);

	}

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		repoProducto.save(producto);

	}

}
