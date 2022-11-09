package upchi.api.movie.actor.entities;

import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import upchi.api.movie.pivots.entities.FilmActor;

@Entity
@Table(name = "actors")
@Setter @Getter
public class Actor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastname;
    private String nickname;
    private Integer age;
    private String nationality;

    @OneToMany(mappedBy = "actor")
    private List<FilmActor> filmActors;

}