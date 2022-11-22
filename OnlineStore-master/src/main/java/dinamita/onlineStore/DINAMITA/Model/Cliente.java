package dinamita.onlineStore.DINAMITA.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int claveCliente;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String calleNumero;
	private String colonia;
	private String entidad;
	private int codigoPostal;
	private String telefono;
	
	
	public int getClaveCliente() {
		return claveCliente;
	}
	public void setClaveCliente(int claveCliente) {
		this.claveCliente = claveCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getCalleNumero() {
		return calleNumero;
	}
	public void setCalleNumero(String calleNumero) {
		this.calleNumero = calleNumero;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Cliente [claveCliente=" + claveCliente + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", calleNumero=" + calleNumero + ", colonia=" + colonia
				+ ", entidad=" + entidad + ", codigoPostal=" + codigoPostal + ", telefono=" + telefono + "]";
	}
	
	

}
