package upchi.api.movie.premier.controllers.dtos.requests;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class PostPremierRequest {
   
    private Date date;
    private String cine;
    
}
