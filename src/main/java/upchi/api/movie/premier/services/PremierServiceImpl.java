package upchi.api.movie.premier.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.premier.controllers.dtos.requests.PostPremierRequest;
import upchi.api.movie.premier.controllers.dtos.responses.GetPremierResponse;
import upchi.api.movie.premier.entities.Premier;
import upchi.api.movie.premier.repositories.IPremierRepository;
import upchi.api.movie.premier.services.interfaces.IPremierService;

@Service
public class PremierServiceImpl implements IPremierService{

    @Autowired
    IPremierRepository repository;

    @Override
    public GetPremierResponse create(PostPremierRequest request) {
        Premier save = repository.save(from(request));
        return from(save);
    }

    @Override
    public GetPremierResponse get(Long id) {
        Premier premier = findAndEnsureExist(id);
        return from(premier);
    }

    @Override
    public List<GetPremierResponse> list() {
        return repository.findAll().stream()
        .map(this::from)
        .collect(Collectors.toList());
    }

    @Override
    public GetPremierResponse update(Long id, PostPremierRequest request) {
        Premier premier = findAndEnsureExist(id);
        premier.setDate(request.getDate());
        premier.setCinema(request.getCinema());
        return from(repository.save(premier));
    }

    @Override
    public void delete(Long id) {
        repository.delete(findAndEnsureExist(id));
    }

    private Premier from(PostPremierRequest request){
        Premier premier = new Premier();
        premier.setDate(request.getDate());
        premier.setCinema(request.getCinema());
        return premier;
    }

    private GetPremierResponse from(Premier premier){
        GetPremierResponse response = new GetPremierResponse();
        response.setId(premier.getId());
        response.setDate(premier.getDate());
        response.setCinema(premier.getCinema());
        return response;
    }

    private Premier findAndEnsureExist(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("not found exist"));
    }
    
}