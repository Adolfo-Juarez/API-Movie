package upchi.api.movie.pivots.controllers.dtos.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PostFilmActorResponse {
 
    private Long id;
    private String actorName;
    private String filmTitle;

}
