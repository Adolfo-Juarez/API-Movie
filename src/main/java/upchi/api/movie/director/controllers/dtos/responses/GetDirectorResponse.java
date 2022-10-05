package upchi.api.movie.director.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class GetDirectorResponse {

    private Long id;

    private String name;
    private String nickname;

}
