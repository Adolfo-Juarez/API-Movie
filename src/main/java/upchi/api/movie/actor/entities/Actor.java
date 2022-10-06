package upchi.api.movie.actor.entities;

import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import upchi.api.movie.pivots.FilmActor;

@Entity
@Table(name = "actors")
@Setter @Getter
public class Actor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    @Column(name = "pseudonimo")
    private String nickname;
    private Integer age;
    private String nacionality;

    @OneToMany(mappedBy = "actor")
    private List<FilmActor> filmActors;

}