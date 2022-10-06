package upchi.api.movie.actor.controllers;

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

import upchi.api.movie.actor.controllers.dtos.requests.PostActorRequest;
import upchi.api.movie.actor.controllers.dtos.requests.UpdateActorRequest;
import upchi.api.movie.actor.controllers.dtos.responses.GetActorResponse;
import upchi.api.movie.actor.services.interfaces.IActorService;

@RestController
@RequestMapping("actor")
public class ActorController {

    @Autowired
    IActorService service;

    @GetMapping
    public List<GetActorResponse> list(){
        return service.list();
    }

    @GetMapping("{id}")
    public GetActorResponse get(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping
    public GetActorResponse create(@RequestBody PostActorRequest request){
        return service.create(request);
    }

    @PutMapping("{id}")
    public GetActorResponse update(@PathVariable Long id, @RequestBody UpdateActorRequest request){
    return service.update(id, request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}