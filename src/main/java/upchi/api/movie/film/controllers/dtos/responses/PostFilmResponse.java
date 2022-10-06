package upchi.api.movie.film.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PostFilmResponse {
    
    private Long id;
    private String title;
    private Float duration;

}