package upchi.api.movie.actor.controllers;

import org.hibernate.sql.ordering.antlr.GeneratedOrderByFragmentRendererTokenTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import upchi.api.movie.actor.controllers.dtos.requests.PostActorRequest;
import upchi.api.movie.actor.controllers.dtos.requests.UpdateActorRequest;
import upchi.api.movie.actor.controllers.dtos.responses.GetActorResponse;
import upchi.api.movie.actor.services.interfaces.IActorService;

import java.util.List;

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
