package upchi.api.movie.pivots.controllers.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PostFilmActorRequest {
    private Long id;
    private Long id_film;
    private Long id_actor;
}
