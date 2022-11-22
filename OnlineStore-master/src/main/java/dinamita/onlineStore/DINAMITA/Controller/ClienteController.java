package dinamita.onlineStore.DINAMITA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dinamita.onlineStore.DINAMITA.Model.Cliente;
import dinamita.onlineStore.DINAMITA.ServiceJpa.ClienteServiceJpa;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteServiceJpa serviceCliente;
	
	@GetMapping("/listaClientes")
	public String mostrarListaClientes(Model model) {
		model.addAttribute("clientes", serviceCliente.obtenerClientes());
		
		return "clientes/Clientes";
	}
	
	@GetMapping("/crear")
	public String crearCliente(Cliente cliente) {
		return "clientes/formularioCliente";
	}
	
	@PostMapping("/guardar")
	public String guardar(Cliente cliente) {
		serviceCliente.guardar(cliente);
		return "redirect:/cliente/listaClientes";
	}
	
	@GetMapping("/eliminar")
	public String eliminar(@RequestParam("claveCliente") int claveCliente) {
		serviceCliente.eliminar(claveCliente);
		return "redirect:/cliente/listaClientes";
	}
	
	@GetMapping("/actualizar")
	public String actualizar(@RequestParam("claveCliente") int claveCliente, Model model) {
		model.addAttribute("cliente", serviceCliente.buscarClaveCliente(claveCliente));
		return "clientes/formularioCliente";
	}

}
