package dinamita.onlineStore.DINAMITA.ServiceJpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dinamita.onlineStore.DINAMITA.Model.Categoria;
import dinamita.onlineStore.DINAMITA.Repository.CategoriaRepository;
import dinamita.onlineStore.DINAMITA.Service.IntCategoria;
@Service
public class CategoriaServiceJpa implements IntCategoria{
	
	@Autowired
	private CategoriaRepository repoCategoria;

	@Override
	public List<Categoria> obtenerCategorias() {
		// TODO Auto-generated method stub
		return repoCategoria.findAll();
	}

	@Override
	public Categoria buscarPorClave(int claveCategoria) {
		// TODO Auto-generated method stub
		Optional<Categoria> categ = repoCategoria.findById(claveCategoria);
		if(categ.isPresent()) {
			return categ.get();
		}else {
			return null;
		}
		
	}

	@Override
	public void eliminarCategoria(int claveCategoria) {
		// TODO Auto-generated method stub
		repoCategoria.deleteById(claveCategoria);
	}

	@Override
	public void guardar(Categoria categoria) {
		// TODO Auto-generated method stub
		repoCategoria.save(categoria);
	}

}
