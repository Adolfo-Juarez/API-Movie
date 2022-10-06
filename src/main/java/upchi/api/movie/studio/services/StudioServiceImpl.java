package upchi.api.movie.studio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.studio.controllers.dtos.requests.PostStudioRequest;
import upchi.api.movie.studio.controllers.dtos.requests.UpdateStudioRequest;
import upchi.api.movie.studio.controllers.dtos.responses.GetStudioResponse;
import upchi.api.movie.studio.entities.Studio;
import upchi.api.movie.studio.repositories.IStudioRepository;
import upchi.api.movie.studio.services.interfaces.IStudioService;

import java.util.stream.Collectors;
import java.util.List;

@Service
public class StudioServiceImpl implements IStudioService{

    @Autowired
    IStudioRepository repository;

    @Override
    public List<GetStudioResponse> list(){
        return repository
                .findAll()
                .stream()
                .map(this::from)
                .collect(Collectors.toList());
    }
    @Override
    public GetStudioResponse get(Long id) {
        return from(id);
    }
    @Override
    public GetStudioResponse create(PostStudioRequest request){
        Studio studio = from(request);
        return from(repository.save(studio));
    }
    @Override
    public GetStudioResponse update(Long id, UpdateStudioRequest request){
        Studio studio = findOneAndEnsureExist(id);
        studio = update(studio, request);
        return from(studio);
    }
    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Studio findOneAndEnsureExist(Long id){
        return repository.findById(id)
                .orElseThrow(()-> new RuntimeException("The Studio does not exist"));
    }
    @Override
    public Studio save(Studio studio) {
        return repository.save(studio);
    }

    private Studio update(Studio studio, UpdateStudioRequest request){
        studio.setName(request.getName());
        studio.setHeadquarters(request.getHeadquarters());
        return repository.save(studio);
    }
    private Studio from(PostStudioRequest request){
        Studio studio = new Studio();
        studio.setName(request.getName());
        studio.setHeadquarters(request.getHeadquarters());
        return studio;
    }
    private GetStudioResponse from(Studio studio) {
        GetStudioResponse response = new GetStudioResponse();
        response.setId(studio.getId());
        response.setName(studio.getName());
        response.setHeadquarters(studio.getHeadquarters());
        return response;
    }

    private GetStudioResponse from(Long idUser) {
        return repository.findById(idUser)
                .map(this::from)
                .orElseThrow(() -> new RuntimeException("The user does not exist"));
    }
}