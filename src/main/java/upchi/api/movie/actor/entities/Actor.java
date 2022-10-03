package upchi.api.movie.actor.entities;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "actors")
@Setter @Getter
public class Actor {

    // Por Hacer:
    // - Verifica que el nombre de la tabla esté generado correctamente
    // - Añade los atributos necesarios, recuerda que debe ser en inglés

    // No hace falta generar Getter y Setter

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String lastName;
    @Column(name = "pseudonimo")
    private String nickname;
    private Integer age;
    private String nacionality;



}
