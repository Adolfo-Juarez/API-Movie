package upchi.api.movie.cinema.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class PostCinemaRequest {
    private String location;
    private String name;

}
