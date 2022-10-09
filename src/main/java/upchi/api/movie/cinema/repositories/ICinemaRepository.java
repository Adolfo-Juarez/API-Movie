package upchi.api.movie.cinema.repositories;

import org.springframework.stereotype.Repository;
import upchi.api.movie.cinema.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

// No es necesario ninguna acción acá

@Repository
public interface ICinemaRepository extends JpaRepository<Cinema, Long>{}
