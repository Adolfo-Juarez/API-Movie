package upchi.api.movie.pivots.services.interfaces;

import java.util.List;

import upchi.api.movie.actor.controllers.dtos.responses.ActorResponse;
import upchi.api.movie.film.controllers.dtos.responses.FilmResponse;
import upchi.api.movie.pivots.controllers.dtos.request.PostFilmActorRequest;
import upchi.api.movie.pivots.controllers.dtos.response.PostFilmActorResponse;

public interface IFilmActorService {

    List<FilmResponse> listAllFilmsByActorId(Long actorId);

    List<ActorResponse> listAllActorsByFilmId(Long filmId);

    PostFilmActorResponse create(PostFilmActorRequest request);
    
}
