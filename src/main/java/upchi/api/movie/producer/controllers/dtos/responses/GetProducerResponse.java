package upchi.api.movie.producer.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class GetProducerResponse {
    private Long id;

    private String name;
    private String lastname;
}