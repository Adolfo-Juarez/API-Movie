package upchi.api.movie.film.services.interfaces;

import java.util.List;

import upchi.api.movie.actor.controllers.dtos.responses.ActorResponse;
import upchi.api.movie.film.controllers.dtos.responses.FilmResponse;

public interface IFilmActorService {

    List<FilmResponse> listAllFilmsByActorId(Long actorId);

    List<ActorResponse> listAllActorsByFilmId(Long filmId);
    
}
