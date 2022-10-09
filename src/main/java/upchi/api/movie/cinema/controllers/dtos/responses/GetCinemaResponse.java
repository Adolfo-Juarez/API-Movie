package upchi.api.movie.cinema.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class GetCinemaResponse {
    private Long id;
    private String location;
    private String name;
}
