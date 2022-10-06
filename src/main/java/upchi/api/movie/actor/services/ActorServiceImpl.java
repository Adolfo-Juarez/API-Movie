package upchi.api.movie.actor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.actor.controllers.dtos.requests.PostActorRequest;
import upchi.api.movie.actor.controllers.dtos.requests.UpdateActorRequest;
import upchi.api.movie.actor.controllers.dtos.responses.GetActorResponse;
import upchi.api.movie.actor.entities.Actor;
import upchi.api.movie.actor.repositories.IActorRepository;
import upchi.api.movie.actor.services.interfaces.IActorService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActorServiceImpl implements IActorService{

    @Autowired
    IActorRepository repository;

    @Override
    public GetActorResponse create(PostActorRequest request){
        Actor actor = from(request);
        return from(repository.save(actor));
    }

    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }

    @Override
    public GetActorResponse getById(Long id){
        return from (id);
    }

    @Override
    public List<GetActorResponse> list(){
        return repository
                .findAll()
                .stream()
                .map(this::from)
                .collect(Collectors.toList());
    }

    @Override
    public GetActorResponse update(Long id, UpdateActorRequest request){
        Actor actor = repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Actor not found"));
        actor = update(actor, request);
        return from(actor);
    }

    private Actor update(Actor actor, UpdateActorRequest request){
        actor.setAge(request.getAge());
        actor.setNationality(request.getNationality());
        return repository.save(actor);
    }

    private Actor from (PostActorRequest request){
        Actor actor = new Actor();
        actor.setAge(request.getAge());
        actor.setName(request.getName());
        actor.setNationality(request.getNationality());
        actor.setNickname(request.getNickname());
        actor.setLastName(request.getLastname());
        return actor;
    }

    private GetActorResponse from(Actor actor){
        GetActorResponse response = new GetActorResponse();
        response.setId(actor.getId());
        response.setAge(actor.getAge());
        response.setName(actor.getName());
        response.setLastName(actor.getLastName());
        response.setNacionality(actor.getNationality());
        return response;
    }

    private GetActorResponse from (Long id){
        return repository.findById(id).map(this::from)
                .orElseThrow(()-> new RuntimeException("Actor not found"));
    }
   
}