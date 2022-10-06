package upchi.api.movie.actor.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class PostActorRequest {
    
    private String name;
    private String lastName;
    private String nickname;
    private Integer age;
    private String nacionality;
    
}