package upchi.api.movie.cinema.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.cinema.controllers.dtos.requests.PostCinemaRequest;
import upchi.api.movie.cinema.controllers.dtos.requests.UpdateCinemaRequest;
import upchi.api.movie.cinema.controllers.dtos.responses.GetCinemaResponse;
import upchi.api.movie.cinema.entities.Cinema;
import upchi.api.movie.cinema.repositories.ICinemaRepository;
import upchi.api.movie.cinema.services.interfaces.ICinemaService;

@Service
public class CinemaServiceImpl implements ICinemaService{

    @Autowired
    ICinemaRepository repository;

    @Override
    public GetCinemaResponse getById(Long id){
        return from(id);
    }

    @Override
    public List<GetCinemaResponse> list(){
        return repository
                .findAll()
                .stream()
                .map(this::from)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }

    @Override
    public GetCinemaResponse create(PostCinemaRequest request){
        Cinema cinema = from(request);
        return from(repository.save(cinema));
    }

    @Override
    public GetCinemaResponse update(Long id, UpdateCinemaRequest request){
        Cinema cinema = repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Cinema not found"));
        cinema = update(cinema, request);
        return from(cinema);
    }


    private Cinema update(Cinema cinema, UpdateCinemaRequest request){
        cinema.setName(request.getName());
        cinema.setLocation(request.getLocation());
        return repository.save(cinema);
    }


    private Cinema from (PostCinemaRequest request){
        Cinema cinema = new Cinema();
        cinema.setName(request.getName());
        cinema.setLocation(request.getLocation());
        return cinema;
    }

    private GetCinemaResponse from(Cinema cinema){
        GetCinemaResponse response = new GetCinemaResponse();
        response.setId(cinema.getId());
        response.setLocation(cinema.getLocation());
        response.setName(cinema.getName());
        return response;
    }

    private GetCinemaResponse from (Long id){
        return repository.findById(id).map(this::from)
                .orElseThrow(()-> new RuntimeException("Cinema not found"));
    }

}
