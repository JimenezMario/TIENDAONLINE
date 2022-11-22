package dinamita.onlineStore.DINAMITA.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dinamita.onlineStore.DINAMITA.Model.Categoria;
import dinamita.onlineStore.DINAMITA.Service.IntCategoria;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private IntCategoria serviceCategoria;
	
	@GetMapping("/listaCategoria")
	public String mostrarListaCategoria(Model model) {
		
		model.addAttribute("categorias", serviceCategoria.obtenerCategorias());
		
		return "categoria/ListaCategorias";
	}
	
	@GetMapping("/crear")
	public String crearCategoria(Categoria categoria) {
		return "categoria/formularioCategoria";
	}
	
	@GetMapping("/eliminar")
	public String eliminarCategoria(@RequestParam("claveCategoria") int claveCategoria, Model model) {
		serviceCategoria.eliminarCategoria(claveCategoria);
		return "redirect:/categoria/listaCategoria";
	}
	@PostMapping("/guardar")
	public String guardarCategoria(Categoria categoria) {
		serviceCategoria.guardar(categoria);
		return "redirect:/categoria/listaCategoria";
	}
	@GetMapping("/actualizar")
	public String actualizar(@RequestParam("claveCategoria") int claveCategoria, Model model) {
		model.addAttribute("categoria", serviceCategoria.buscarPorClave(claveCategoria));
		return "categoria/formularioCategoria";
	}
	
	
}
