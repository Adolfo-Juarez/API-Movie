package upchi.api.movie.producer.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateProducerRequest {
    private String nationality;
    private Integer age;
}