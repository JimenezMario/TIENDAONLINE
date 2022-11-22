package dinamita.onlineStore.DINAMITA.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dinamita.onlineStore.DINAMITA.Model.Compra;
import dinamita.onlineStore.DINAMITA.ServiceJpa.CompraServiceJpa;

@Controller
@RequestMapping("/compras")
public class CompraController {
	
	
	@Autowired
	private CompraServiceJpa serviceCompra;
	
	@GetMapping("/realizarCompra")
	public String realizarCompra(Compra compra) {
		return "compras/compra";
	}
	
	@GetMapping("/listaCompras")
	public String mostrarListaCompras(Model model) {
		
		model.addAttribute("compras", serviceCompra.obtenerCompras());
		return "compras/listaCompras";
	}
	@PostMapping("/comprar")
	public String comprar(Compra compra) {

		serviceCompra.guardar(compra);
		return "redirect:/compras/realizarCompra";
	}
	@GetMapping("/eliminar")
	public String eliminar(@RequestParam("folioCompra") int folioCompra) {
		serviceCompra.eliminar(folioCompra);
		return "redirect:/compras/listaCompras";
	}
	@GetMapping("/actualizar")
	public String actualizar(@RequestParam("folioCompra") int folioCompra, Model model) {
		model.addAttribute("compra", serviceCompra.buscarPoFolio(folioCompra));
		return "redirect:/compras/realizarCompra";
	}
	

	/*Control de error Date (Format in MariaDB)*/
	@InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
	/*Control de error Date (Format in MariaDB)*/
}
