package upchi.api.movie.director.repositories;

import org.springframework.stereotype.Repository;
import upchi.api.movie.director.entities.Director;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IDirectorRepository extends JpaRepository<Director, Long>{}