package upchi.api.movie.studio.controllers.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class GetStudioResponse {

    // Por Hacer: 
    // - Agregar atributos necesarios
    
    // Este DTO servirá para devolver la información necesaria
    // de alguna petición GET para la entidad Studio

    // Id debe ser obligtorio dentro de los response para fines demostrativos
    
    // No hace falta agregar Setters y Getters

    private Long id;
    private String name;
    private String headquarters;

}
