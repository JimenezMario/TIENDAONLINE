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
@Table(name="entrega")
public class Entrega {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int claveEntrega;
	private String detalleEntrega;
	@DateTimeFormat(pattern="aaaa-MMM-dd")
	private Date fechaEntrega;
	@OneToOne
	@JoinColumn(name="folioCompra")
	private Compra folioCompra;
	
	public int getClaveEntrega() {
		return claveEntrega;
	}
	public void setClaveEntrega(int claveEntrega) {
		this.claveEntrega = claveEntrega;
	}
	public String getDetalleEntrega() {
		return detalleEntrega;
	}
	public void setDetalleEntrega(String detalleEntrega) {
		this.detalleEntrega = detalleEntrega;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public Compra getFolioCompra() {
		return folioCompra;
	}
	public void setFolioCompra(Compra folioCompra) {
		this.folioCompra = folioCompra;
	}
	@Override
	public String toString() {
		return "Entrega [claveEntrega=" + claveEntrega + ", detalleEntrega=" + detalleEntrega + ", fechaEntrega="
				+ fechaEntrega + ", folioCompra=" + folioCompra + "]";
	}
	
	

}
