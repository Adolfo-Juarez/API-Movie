package upchi.api.movie.film.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class GetFilmResponse {

    private Long id;
    private String title;
    private String img;
    private Float duration;

}
