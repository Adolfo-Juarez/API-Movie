package upchi.api.movie.actor.repositories;

import org.springframework.stereotype.Repository;
import upchi.api.movie.actor.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

// No es necesario ninguna acción acá

@Repository
public interface IActorRepository extends JpaRepository<Actor, Long>{}
