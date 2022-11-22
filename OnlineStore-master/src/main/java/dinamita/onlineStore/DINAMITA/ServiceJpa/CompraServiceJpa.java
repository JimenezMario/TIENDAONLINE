package dinamita.onlineStore.DINAMITA.ServiceJpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dinamita.onlineStore.DINAMITA.Model.Compra;
import dinamita.onlineStore.DINAMITA.Repository.CompraRepository;
import dinamita.onlineStore.DINAMITA.Service.IntCompra;

@Service
public class CompraServiceJpa implements IntCompra{
	
	@Autowired
	private CompraRepository repoCompra;

	@Override
	public List<Compra> obtenerCompras() {
		// TODO Auto-generated method stub
		return repoCompra.findAll();
	}

	@Override
	public Compra buscarPoFolio(int folioCompra) {
		// TODO Auto-generated method stub
		Optional<Compra> compra = repoCompra.findById(folioCompra);
			if(compra.isPresent()) {
				return compra.get();
			}else {
				return null;
			}
		
	}

	@Override
	public void eliminar(int folioCompra) {
		// TODO Auto-generated method stub
		repoCompra.deleteById(folioCompra);
		
	}

	@Override
	public void guardar(Compra compra) {
		// TODO Auto-generated method stub

		repoCompra.save(compra);
	}

}
