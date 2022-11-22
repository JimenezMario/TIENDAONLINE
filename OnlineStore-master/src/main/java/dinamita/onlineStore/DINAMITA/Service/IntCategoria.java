package dinamita.onlineStore.DINAMITA.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import dinamita.onlineStore.DINAMITA.Model.Categoria;

public interface IntCategoria {
	
	public List<Categoria> obtenerCategorias();
	public Categoria buscarPorClave(int claveCategoria);
	public void eliminarCategoria(int claveCategoria);
	public void guardar(Categoria categoria); 

}
