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

import dinamita.onlineStore.DINAMITA.Model.Entrega;
import dinamita.onlineStore.DINAMITA.ServiceJpa.EntregaServiceJpa;

@Controller
@RequestMapping("/entregas")
public class EntregasController {
	
	@Autowired
	private EntregaServiceJpa serviceEntrega;
	
	@GetMapping("/listaEntregas")
	public String mostrarListaEntregas(Model model) {
		model.addAttribute("entregas", serviceEntrega.obtenerEntregas());
		return "entrega/ListaEntregas";
	}
	
	@GetMapping("/crear")
	public String crearEntrega(Entrega entrega) {
		return "entrega/formularioEntregas";
	}

	@PostMapping("/guardar")
	public String guardar(Entrega entrega){
		serviceEntrega.guardar(entrega);
		return "redirect:/entregas/listaEntregas";
	}
	
	@GetMapping("/actualizar")
	public String eliminar(@RequestParam("claveEntrega") int claveEntrega, Model model) {
		model.addAttribute("entrega", serviceEntrega.buscarPorClave(claveEntrega));
		return "entrega/formularioEntregas";
	}
	@GetMapping("/eliminar")
	public String eliminar(@RequestParam("claveEntrega") int claveEntrega) {
		serviceEntrega.eliminar(claveEntrega);
		return "redirect:/entregas/listaEntregas";
	}
	
	

	/*Control de error Date (Format in MariaDB)*/
	@InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
	/*Control de error Date (Format in MariaDB)*/
}
