package upchi.api.movie.premier.controllers.dtos.responses;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class GetPremierResponse {

    private Long id;
    private Date date;
    private String cine;

}
