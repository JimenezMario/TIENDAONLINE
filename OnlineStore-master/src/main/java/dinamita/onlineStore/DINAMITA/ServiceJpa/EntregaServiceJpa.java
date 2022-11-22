package dinamita.onlineStore.DINAMITA.ServiceJpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dinamita.onlineStore.DINAMITA.Model.Entrega;
import dinamita.onlineStore.DINAMITA.Repository.EntregaRepository;
import dinamita.onlineStore.DINAMITA.Service.IntEntrega;

@Service
public class EntregaServiceJpa implements IntEntrega{
	
	@Autowired
	private EntregaRepository repoEntrega;

	@Override
	public List<Entrega> obtenerEntregas() {
		// TODO Auto-generated method stub
		return repoEntrega.findAll();
	}

	@Override
	public void guardar(Entrega entrega) {
		// TODO Auto-generated method stub
		repoEntrega.save(entrega);
	}

	@Override
	public Entrega buscarPorClave(int claveEntrega) {
		// TODO Auto-generated method stub
		Optional<Entrega> entrega = repoEntrega.findById(claveEntrega);
			if(entrega.isPresent()) {	
				return entrega.get();
			}else {
				return null;
			}
		
	}

	@Override
	public void eliminar(int claveEntrega) {
		// TODO Auto-generated method stub
		repoEntrega.deleteById(claveEntrega);
	}

}
