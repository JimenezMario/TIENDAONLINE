package dinamita.onlineStore.DINAMITA.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int codigoProducto;
	private String nombreProducto;
	private String descripcion;
	private double precio;
	private String imagen;
	@OneToOne
	@JoinColumn(name="claveCategoria")
	private Categoria claveCategoria;


	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	public Categoria getClaveCategoria() {
		return claveCategoria;
	}

	public void setClaveCategoria(Categoria claveCategoria) {
		this.claveCategoria = claveCategoria;
	}

	
	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", descripcion="
				+ descripcion + ", precio=" + precio + ", imagen=" + imagen + ", claveCategoria=" + claveCategoria
				+ ", getCodigoProducto()=" + getCodigoProducto() + ", getNombreProducto()=" + getNombreProducto()
				+ ", getDescripcion()=" + getDescripcion() + ", getPrecio()=" + getPrecio() + ", getClaveCategoria()="
				+ getClaveCategoria() + ", getImagen()=" + getImagen() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	



}
