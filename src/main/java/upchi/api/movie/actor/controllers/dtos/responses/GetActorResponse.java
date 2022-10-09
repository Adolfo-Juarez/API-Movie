package upchi.api.movie.actor.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class GetActorResponse {

    private Long id;

    private String name;
    private String lastname;
    private Integer age;
    private String nacionality;

}