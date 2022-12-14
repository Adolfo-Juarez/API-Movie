package upchi.api.movie.producer.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class PostProducerRequest {
    private String name;
    private String lastname;
    private Integer age;
    private String nationality;
}