package upchi.api.movie.film.entities;

import java.util.List;

import javax.persistence.Column;
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
@Table(name = "films")
@Setter @Getter
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "img_route")
    private String image;

    private String title;
    private Float duration;
    private String genre;
    private Integer year;

    @OneToMany(mappedBy = "film")
    private List<FilmDirector> filmDirectors;

    @OneToMany(mappedBy = "film")
    private List<FilmActor> filmActors;
}