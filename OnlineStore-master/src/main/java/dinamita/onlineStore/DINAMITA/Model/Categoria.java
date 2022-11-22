package dinamita.onlineStore.DINAMITA.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int claveCategoria;
	private String nombreCategoria;
	
	

	public int getClaveCategoria() {
		return claveCategoria;
	}

	public void setClaveCategoria(int claveCategoria) {
		this.claveCategoria = claveCategoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	@Override
	public String toString() {
		return "Categoria [claveCategoria=" + claveCategoria + ", nombreCategoria=" + nombreCategoria + "]";
	}
	
	
	

}
