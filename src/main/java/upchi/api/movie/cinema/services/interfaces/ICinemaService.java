package upchi.api.movie.cinema.services.interfaces;

import upchi.api.movie.cinema.controllers.dtos.requests.PostCinemaRequest;
import upchi.api.movie.cinema.controllers.dtos.requests.UpdateCinemaRequest;
import upchi.api.movie.cinema.controllers.dtos.responses.GetCinemaResponse;
import java.util.List;

public interface ICinemaService {
    //Método para actualizar un cinema
    public GetCinemaResponse update(Long id, UpdateCinemaRequest request);

    /* Método para agregar un cinema nuevo */
    public GetCinemaResponse create(PostCinemaRequest request);


    /*Método para eliminar un cinema*/
    public void delete(Long id);

    // Método para regresar una lista de cinema
    public List<GetCinemaResponse> list();

    //Método para obtener un cinema por medio de un id
    public GetCinemaResponse getById(Long id);
}
