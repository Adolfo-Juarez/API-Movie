package upchi.api.movie.film.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.actor.controllers.dtos.responses.ActorResponse;
import upchi.api.movie.actor.entities.projections.ActorProjection;
import upchi.api.movie.film.controllers.dtos.responses.FilmResponse;
import upchi.api.movie.film.entities.projections.FilmProjection;
import upchi.api.movie.film.repositories.IFilmActorRepository;
import upchi.api.movie.film.services.interfaces.IFilmActorService;

@Service
public class FilmActorServiceImpl implements IFilmActorService {
    
    @Autowired
    private IFilmActorRepository repository;

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

    private FilmResponse from(FilmProjection fiml){
        FilmResponse response = new FilmResponse();
        response.setId(fiml.getId());
        response.setTitle(fiml.GetTitle());
        return response;
    }

    private ActorResponse from(ActorProjection actor){
        ActorResponse response = new ActorResponse();
        response.setId(actor.getId());
        response.setName(actor.getName());
        response.setFilmTitle(actor.getFilmTitle());
        return response;  
    }
}
