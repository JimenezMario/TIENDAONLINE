package dinamita.onlineStore.DINAMITA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dinamita.onlineStore.DINAMITA.Model.Entrega;
@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Integer> {

}
