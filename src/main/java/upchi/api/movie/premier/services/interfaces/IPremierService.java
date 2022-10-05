package upchi.api.movie.premier.services.interfaces;

import java.util.List;

import upchi.api.movie.premier.controllers.dtos.requests.PostPremierRequest;
import upchi.api.movie.premier.controllers.dtos.responses.GetPremierResponse;

public interface IPremierService {

    GetPremierResponse create(PostPremierRequest request);
    // Por Hacer:
    // - Genera las interfaces de lo métodos para los servicios

    GetPremierResponse get(Long id);

    List<GetPremierResponse> list();

    GetPremierResponse update(Long id, PostPremierRequest request);

    void delete(Long id);

    // Recuerda que mínimo deberán haber 4 métodos (del protocolo HTTP)
}
