package dinamita.onlineStore.DINAMITA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dinamita.onlineStore.DINAMITA.Model.Producto;
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
