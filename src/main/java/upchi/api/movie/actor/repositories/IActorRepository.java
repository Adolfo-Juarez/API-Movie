package upchi.api.movie.actor.repositories;

import org.springframework.stereotype.Repository;
import upchi.api.movie.actor.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IActorRepository extends JpaRepository<Actor, Long>{}