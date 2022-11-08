package upchi.api.movie.premier.services.interfaces;

import java.util.List;

import upchi.api.movie.premier.controllers.dtos.requests.PostPremierRequest;
import upchi.api.movie.premier.controllers.dtos.responses.GetPremierResponse;

public interface IPremierService {

    GetPremierResponse create(PostPremierRequest request);

    GetPremierResponse get(Long id);

    List<GetPremierResponse> list();
 
    GetPremierResponse update(Long id, PostPremierRequest request);

    void delete(Long id);

}