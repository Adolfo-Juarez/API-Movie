package upchi.api.movie.producer.services.interfaces;

import java.util.List;
import upchi.api.movie.producer.controllers.dtos.requests.PostProducerRequest;
import upchi.api.movie.producer.controllers.dtos.requests.UpdateProducerRequest;
import upchi.api.movie.producer.controllers.dtos.responses.GetProducerResponse;

public interface IProducerService {
    public GetProducerResponse create (PostProducerRequest request);

    public List<GetProducerResponse> list();

    public GetProducerResponse get(Long id);

    public GetProducerResponse update(Long id, UpdateProducerRequest request);

    public void delete(Long id);
}