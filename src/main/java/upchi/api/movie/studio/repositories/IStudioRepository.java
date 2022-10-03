package upchi.api.movie.studio.repositories;

import org.springframework.stereotype.Repository;
import upchi.api.movie.studio.entities.Studio;
import org.springframework.data.jpa.repository.JpaRepository;

// No es necesario ninguna acción acá

@Repository
public interface IStudioRepository extends JpaRepository<Studio, Long>{}
