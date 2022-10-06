package upchi.api.movie.film.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upchi.api.movie.film.controllers.dtos.requests.PostFilmRequest;
import upchi.api.movie.film.controllers.dtos.requests.UpdateFilmRequest;
import upchi.api.movie.film.controllers.dtos.responses.GetFilmResponse;
import upchi.api.movie.film.controllers.dtos.responses.PostFilmResponse;
import upchi.api.movie.film.services.interfaces.IFilmService;

@RestController
@RequestMapping("film")
public class FilmController {

    @Autowired
    IFilmService service;

    @GetMapping("{id}")
    public GetFilmResponse get(@PathVariable Long id){
        return service.get(id);
    }

    @GetMapping
    public List<GetFilmResponse> list(){
        return service.list();
    }

    @PostMapping
    public PostFilmResponse create(@RequestBody PostFilmRequest request){
        return service.create(request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @PutMapping("{id}")
    public GetFilmResponse update (@PathVariable Long id, @RequestBody UpdateFilmRequest request){
        return service.update(id, request);
    }

}