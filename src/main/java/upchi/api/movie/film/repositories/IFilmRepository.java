package upchi.api.movie.film.repositories;

import org.springframework.stereotype.Repository;
import upchi.api.movie.film.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IFilmRepository extends JpaRepository<Film, Long>{}
