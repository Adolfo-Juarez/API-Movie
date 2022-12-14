package upchi.api.movie.pivots.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upchi.api.movie.actor.controllers.dtos.responses.ActorResponse;
import upchi.api.movie.film.controllers.dtos.responses.FilmResponse;
import upchi.api.movie.pivots.controllers.dtos.request.PostFilmActorRequest;
import upchi.api.movie.pivots.controllers.dtos.response.PostFilmActorResponse;
import upchi.api.movie.pivots.services.interfaces.IFilmActorService;

@RestController
@RequestMapping("films-actor")
public class FilmActorController {
    
    @Autowired
    private IFilmActorService service;

    @GetMapping("films/actor/{actorId}")
    public List<FilmResponse> listAllFilmsByActorId(@PathVariable Long actorId){
        return service.listAllFilmsByActorId(actorId);
    }

    @GetMapping("actors/film/{filmId}")
    public List<ActorResponse> listAllActorsByFilmId(@PathVariable Long filmId){
        return service.listAllActorsByFilmId(filmId);
    }

    @PostMapping
    public PostFilmActorResponse create(@RequestBody PostFilmActorRequest request){
        return service.create(request);
    }
}
