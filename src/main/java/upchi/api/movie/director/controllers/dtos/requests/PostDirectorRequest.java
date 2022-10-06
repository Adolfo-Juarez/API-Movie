package upchi.api.movie.director.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class PostDirectorRequest {
    
    private String name;
    private String lastname;
    private String nickname;
    private Integer age;
    private String nationality;

}