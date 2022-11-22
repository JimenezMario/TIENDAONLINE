package dinamita.onlineStore.DINAMITA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dinamita.onlineStore.DINAMITA.Model.Compra;
@Repository
public interface CompraRepository extends JpaRepository<Compra, Integer> {

}
