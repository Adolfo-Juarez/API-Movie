package upchi.api.movie.director.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import upchi.api.movie.pivots.FilmActor;
import upchi.api.movie.pivots.FilmDirector;

@Entity
@Table(name = "directors")
@Setter @Getter
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastname;
    private String nickname;
    private Integer age;
    private String nacionality;

    @OneToMany(mappedBy = "director")
    private List<FilmDirector> filmDirectors;
    
}