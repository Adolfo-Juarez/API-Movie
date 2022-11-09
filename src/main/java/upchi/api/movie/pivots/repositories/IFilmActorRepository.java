package upchi.api.movie.pivots.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upchi.api.movie.actor.entities.projections.ActorProjection;
import upchi.api.movie.pivots.entities.FilmActor;
import upchi.api.movie.pivots.entities.projections.FilmProjection;

@Repository
public interface IFilmActorRepository extends JpaRepository<FilmActor, Long>{
    
    @Query(value = "select films.* from films_actors " +
    "inner join films on films_actors.film_id = films.id " +
    "inner join actors on films_actors.actor_id = actors.id " +
    "where films_actors.actor_id = :actorId", nativeQuery = true)
    List<FilmProjection> listAllFilmsByActorId(Long actorId);


    @Query(value = "select actors.*, films.name as filmTitle from films_actors " +
    "inner join fimls on films_actors.film_id = films.id " +
    "inner join actors on films_actors.actor_id = actors.id " +
    "where films_actors.film_id = :filmId", nativeQuery = true)
     List<ActorProjection> listAllActorsByFilmId(Long filmId);
}
