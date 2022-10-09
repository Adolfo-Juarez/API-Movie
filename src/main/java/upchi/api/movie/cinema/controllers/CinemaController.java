package upchi.api.movie.cinema.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import upchi.api.movie.cinema.controllers.dtos.requests.PostCinemaRequest;
import upchi.api.movie.cinema.controllers.dtos.requests.UpdateCinemaRequest;
import upchi.api.movie.cinema.controllers.dtos.responses.GetCinemaResponse;
import upchi.api.movie.cinema.services.interfaces.ICinemaService;

import java.util.List;

@RestController
@RequestMapping("cinema")
public class CinemaController {

    @Autowired
    ICinemaService service;

    @GetMapping("{id}")
    public GetCinemaResponse get(@PathVariable Long id){
        return service.getById(id);
    }
    @GetMapping
    public List<GetCinemaResponse> list(){
        return service.list();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @PostMapping
    public GetCinemaResponse create(@RequestBody PostCinemaRequest request){
        return service.create(request);
    }

    @PutMapping("{id}")
    public GetCinemaResponse update(@PathVariable Long id, @RequestBody UpdateCinemaRequest request){
        return service.update(id, request);
    }
}
