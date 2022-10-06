package upchi.api.movie.studio.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class GetStudioResponse {

    private Long id;
    private String name;
    private String headquarters;

}