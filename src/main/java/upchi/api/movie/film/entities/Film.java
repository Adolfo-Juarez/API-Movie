package upchi.api.movie.film.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import upchi.api.movie.cover.entities.Cover;
import upchi.api.movie.director.entities.Director;
import upchi.api.movie.pivots.entities.FilmActor;
import upchi.api.movie.producer.entities.Producer;
import upchi.api.movie.studio.entities.Studio;

@Entity
@Table(name = "films")
@Setter
@Getter
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Float duration;
    private String genre;
    private Integer year;

    @OneToMany(mappedBy = "film")
    private List<FilmActor> filmActors;

    @OneToOne
    @JoinColumn(name = "cover_id", referencedColumnName = "id")
    private Cover cover;

    @ManyToOne
    private Director director;

    @ManyToOne
    private Producer producer;

    @ManyToOne
    private Studio studio;

}