package dinamita.onlineStore.DINAMITA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dinamita.onlineStore.DINAMITA.Model.Producto;
import dinamita.onlineStore.DINAMITA.ServiceJpa.ProductoServiceJpa;

@Controller
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private ProductoServiceJpa serviceProducto;

	@GetMapping("/listaProducto")
	public String mostrarIndex(Model model) {
		model.addAttribute("productos", serviceProducto.obtenerProductos());
		return "productos/listaProductos";
	}	

	@GetMapping("/crear")
	public String crearProducto(Producto producto) {
		return "productos/CtrlProductos";
	}
	@GetMapping("/eliminar")
	public String eliminar(@RequestParam("codigoProducto") int codigoProducto) {
		serviceProducto.eliminar(codigoProducto);
		return "redirect:/producto/listaProducto";
	}
	@GetMapping("/actualizar")
	public String actualizar(@RequestParam("codigoProducto") int codigoProducto, Model model) {
		model.addAttribute("producto", serviceProducto.buscarPorCodigo(codigoProducto));
		return "productos/CtrlProductos";
	}
	
	@PostMapping("/guardar")
	public String guardar(Producto producto, Model model) {
		serviceProducto.guardar(producto);
		return "redirect:/producto/listaProducto";
	}
	
	
}
