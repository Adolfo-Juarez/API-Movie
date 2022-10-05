package upchi.api.movie.premier.repositories;

import org.springframework.stereotype.Repository;
import upchi.api.movie.premier.entities.Premier;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IPremierRepository extends JpaRepository<Premier, Long>{

}
