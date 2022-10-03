package upchi.api.movie.director.repositories;

import org.springframework.stereotype.Repository;
import upchi.api.movie.director.entities.Director;
import org.springframework.data.jpa.repository.JpaRepository;

// No es necesario ninguna acción acá

@Repository
public interface IDirectorRepository extends JpaRepository<Director, Long>{}
