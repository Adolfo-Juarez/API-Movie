package upchi.api.movie.actor.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActorResponse {
    
    private Long id;
    private String name;
    private String filmTitle;

}
