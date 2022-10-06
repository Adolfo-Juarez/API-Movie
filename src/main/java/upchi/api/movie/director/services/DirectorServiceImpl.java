package upchi.api.movie.director.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.director.controllers.dtos.requests.PostDirectorRequest;
import upchi.api.movie.director.controllers.dtos.requests.UpdateDirectorRequest;
import upchi.api.movie.director.controllers.dtos.responses.GetDirectorResponse;
import upchi.api.movie.director.entities.Director;
import upchi.api.movie.director.repositories.IDirectorRepository;
import upchi.api.movie.director.services.interfaces.IDirectorService;

@Service
public class DirectorServiceImpl implements IDirectorService {

    @Autowired
    IDirectorRepository repository;

    @Override
    public GetDirectorResponse create(PostDirectorRequest request) {
        return directorToGetResponse(repository.save(postRequestToDirector(request)));
    }

    @Override
    public List<GetDirectorResponse> list() {
        return repository
                .findAll()
                .stream()
                .map(this::directorToGetResponse)
                .collect(Collectors.toList());
    }

    @Override
    public GetDirectorResponse get(Long id) {
        return directorToGetResponse(repository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Director no found")));
    }

    @Override
    public GetDirectorResponse update(Long id, UpdateDirectorRequest request) {

        Director director = repository.findById(id).orElseThrow(()-> new RuntimeException("Cannot update this director"));

        return directorToGetResponse(repository.save(updateRequestToDirector(director, request)));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    public GetDirectorResponse directorToGetResponse(Director director) {

        GetDirectorResponse response = new GetDirectorResponse();

        response.setId(director.getId());
        response.setName(director.getName());
        response.setNickname(director.getNickname());

        return response;

    }

    public Director postRequestToDirector(PostDirectorRequest request) {

        Director director = new Director();

        director.setAge(request.getAge());
        director.setName(request.getName());
        director.setLastname(request.getLastname());
        director.setNickname(request.getNickname());
        director.setNationality(request.getNationality());

        return director;

    }

    public Director updateRequestToDirector(Director director, UpdateDirectorRequest updated) {

        director.setAge(updated.getAge());
        director.setNationality(updated.getNationality());

        return director;

    }

}