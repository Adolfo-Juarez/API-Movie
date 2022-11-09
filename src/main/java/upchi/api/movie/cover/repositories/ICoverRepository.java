package upchi.api.movie.cover.repositories;

import org.springframework.stereotype.Repository;
import upchi.api.movie.cover.entities.Cover;
import org.springframework.data.jpa.repository.JpaRepository;

// No es necesario ninguna acción acá

@Repository
public interface ICoverRepository extends JpaRepository<Cover, Long>{}
