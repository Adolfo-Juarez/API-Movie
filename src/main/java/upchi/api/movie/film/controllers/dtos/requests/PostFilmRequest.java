package upchi.api.movie.film.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class PostFilmRequest {

    private String title;
    private Float duration;
    private Integer year;
    private String genre;
    
}