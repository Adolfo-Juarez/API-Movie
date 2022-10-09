package upchi.api.movie.cinema.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateCinemaRequest {
    private String location;
    private String name;
}
