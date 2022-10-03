package upchi.api.movie.studio.services.interfaces;

import upchi.api.movie.studio.controllers.dtos.requests.PostStudioRequest;
import upchi.api.movie.studio.controllers.dtos.requests.UpdateStudioRequest;
import upchi.api.movie.studio.controllers.dtos.responses.GetStudioResponse;
import upchi.api.movie.studio.entities.Studio;

import java.util.List;

public interface IStudioService {
    // Por Hacer:
    // - Genera las interfaces de lo métodos para los servicios

    // Recuerda que mínimo deberán haber 4 métodos (del protocolo HTTP)
    List<GetStudioResponse>list();
    GetStudioResponse get(Long id);
    GetStudioResponse create(PostStudioRequest request);
    GetStudioResponse update(Long id, UpdateStudioRequest request);
    void delete(Long id);
    Studio findOneAndEnsureExist(Long id);
    Studio save(Studio studio);
}
