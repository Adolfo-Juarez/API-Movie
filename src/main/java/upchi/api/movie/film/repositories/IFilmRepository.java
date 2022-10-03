package upchi.api.movie.film.repositories;

import org.springframework.stereotype.Repository;
import upchi.api.movie.film.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

// No es necesario ninguna acción acá

@Repository
public interface IFilmRepository extends JpaRepository<Film, Long>{}
