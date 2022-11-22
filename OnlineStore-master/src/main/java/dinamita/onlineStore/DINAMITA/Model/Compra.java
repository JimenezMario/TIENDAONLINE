package dinamita.onlineStore.DINAMITA.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="compra")
public class Compra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int folioCompra;
	@OneToOne
	@JoinColumn(name="codigoProducto")
	private Producto codigoProducto;
	@OneToOne
	@JoinColumn(name="claveCliente")
	private Cliente claveCliente;
	private int cantidad;
	@DateTimeFormat(pattern="aaaa-MMM-dd")
	private Date fechaCompra;
	private String horaCompra;
	private double total;
	
	
	public int getFolioCompra() {
		return folioCompra;
	}
	public void setFolioCompra(int folioCompra) {
		this.folioCompra = folioCompra;
	}
	public Producto getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(Producto codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public Cliente getClaveCliente() {
		return claveCliente;
	}
	public void setClaveCliente(Cliente claveCliente) {
		this.claveCliente = claveCliente;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public String getHoraCompra() {
		return horaCompra;
	}
	public void setHoraCompra(String horaCompra) {
		this.horaCompra = horaCompra;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Compra [folioCompra=" + folioCompra + ", codigoProducto=" + codigoProducto + ", claveCliente="
				+ claveCliente + ", canitdad=" + cantidad + ", fechaCompra=" + fechaCompra + ", horaCompra="
				+ horaCompra + ", total=" + total + "]";
	}
	
	
}
