package upchi.api.movie.actor.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Setter @Getter
public class PostActorRequest {
    // Este DTO es para mandar información para crear un nuevo registro
    // de la entidad Actor en la base de datos
    private String name;
    private String lastName;
    private String nickname;
    private Integer age;
    private String nacionality;
}
