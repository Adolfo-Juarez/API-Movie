package upchi.api.movie.actor.services.interfaces;

import upchi.api.movie.actor.controllers.dtos.requests.PostActorRequest;
import upchi.api.movie.actor.controllers.dtos.requests.UpdateActorRequest;
import upchi.api.movie.actor.controllers.dtos.responses.GetActorResponse;
import upchi.api.movie.actor.entities.Actor;

import java.util.List;

public interface IActorService {

    //Método para actualizar un actor
    public GetActorResponse update(Long id, UpdateActorRequest request);

    /* Método para agregar un actor nuevo */
    public GetActorResponse create(PostActorRequest request);


    /*Método para eliminar un actor*/
    public void delete(Long id);

    // Método para regresar una lista de actores
    public List<GetActorResponse> list();

    //Método para obtener un actor por medio de un id
    public GetActorResponse getById(Long id);

    public Actor findOneAndEnsureExist(Long id);

}