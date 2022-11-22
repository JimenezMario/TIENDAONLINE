package dinamita.onlineStore.DINAMITA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dinamita.onlineStore.DINAMITA.Model.Categoria;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
