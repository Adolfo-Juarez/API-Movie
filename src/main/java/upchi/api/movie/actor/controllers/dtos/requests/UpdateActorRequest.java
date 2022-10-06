package upchi.api.movie.actor.controllers.dtos.requests;


import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class UpdateActorRequest {

    private Integer age;
    private String nationality;
    
}