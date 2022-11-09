package upchi.api.movie.pivots.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.actor.controllers.dtos.responses.ActorResponse;
import upchi.api.movie.actor.entities.projections.ActorProjection;
import upchi.api.movie.actor.services.interfaces.IActorService;
import upchi.api.movie.film.controllers.dtos.responses.FilmResponse;
import upchi.api.movie.film.services.interfaces.IFilmService;
import upchi.api.movie.pivots.controllers.dtos.request.PostFilmActorRequest;
import upchi.api.movie.pivots.controllers.dtos.response.PostFilmActorResponse;
import upchi.api.movie.pivots.entities.FilmActor;
import upchi.api.movie.pivots.entities.projections.FilmProjection;
import upchi.api.movie.pivots.repositories.IFilmActorRepository;
import upchi.api.movie.pivots.services.interfaces.IFilmActorService;

@Service
public class FilmActorServiceImpl implements IFilmActorService {

    @Autowired
    private IFilmActorRepository repository;

    @Autowired
    private IActorService actorService;

    @Autowired
    private IFilmService filmService;

    @Override
    public List<FilmResponse> listAllFilmsByActorId(Long actorId) {
        List<FilmProjection> films = repository.listAllFilmsByActorId(actorId);
        return films.stream()
                .map(this::from)
                .collect(Collectors.toList());
    }

    @Override
    public List<ActorResponse> listAllActorsByFilmId(Long filmId) {
        List<ActorProjection> actors = repository.listAllActorsByFilmId(filmId);
        return actors.stream()
                .map(this::from)
                .collect(Collectors.toList());
    }

    private FilmResponse from(FilmProjection fiml) {
        FilmResponse response = new FilmResponse();
        response.setId(fiml.getId());
        response.setTitle(fiml.GetTitle());
        return response;
    }

    private ActorResponse from(ActorProjection actor) {
        ActorResponse response = new ActorResponse();
        response.setId(actor.getId());
        response.setName(actor.getName());
        response.setFilmTitle(actor.getFilmTitle());
        return response;
    }

    @Override
    public PostFilmActorResponse create(PostFilmActorRequest request) {
        return postFilmResponsefromFilmActor(repository.save(filmActorFromPostRequest(request)));
    }

    private PostFilmActorResponse postFilmResponsefromFilmActor(FilmActor fa) {
        PostFilmActorResponse response = new PostFilmActorResponse();

        response.setId(fa.getId());
        response.setActorName(fa.getActor().getNickname());
        response.setFilmTitle(fa.getFilm().getTitle());

        return response;

    }

    private FilmActor filmActorFromPostRequest(PostFilmActorRequest request) {

        FilmActor fa = new FilmActor();

        fa.setActor(actorService.findOneAndEnsureExist(request.getId_actor()));
        fa.setFilm(filmService.findOneAndEnsureExist(request.getId_film()));

        return fa;

    }

}
