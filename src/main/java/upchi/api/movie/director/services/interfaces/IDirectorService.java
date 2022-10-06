package upchi.api.movie.director.services.interfaces;

import java.util.List;

import upchi.api.movie.director.controllers.dtos.requests.PostDirectorRequest;
import upchi.api.movie.director.controllers.dtos.requests.UpdateDirectorRequest;
import upchi.api.movie.director.controllers.dtos.responses.GetDirectorResponse;

public interface IDirectorService {

    public GetDirectorResponse create (PostDirectorRequest request); 

    public List<GetDirectorResponse> list();

    public GetDirectorResponse get(Long id);

    public GetDirectorResponse update(Long id, UpdateDirectorRequest request);

    public void delete(Long id);

}