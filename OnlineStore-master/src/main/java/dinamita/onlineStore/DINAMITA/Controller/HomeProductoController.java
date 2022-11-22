package dinamita.onlineStore.DINAMITA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dinamita.onlineStore.DINAMITA.Model.Producto;
import dinamita.onlineStore.DINAMITA.ServiceJpa.ProductoServiceJpa;

@Controller
public class HomeProductoController {
	
	@Autowired
	private ProductoServiceJpa serviceProducto;
	
	@GetMapping("/")
	public String mostrarIndex(Model model) {
		model.addAttribute("productos", serviceProducto.obtenerProductos());
		return "index";
	}	
	
	
}
