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
import upchi.api.movie.director.entities.Director;
import upchi.api.movie.producer.entities.Producer;
import upchi.api.movie.image.entities.Image;
import upchi.api.movie.pivots.FilmActor;
import upchi.api.movie.premier.entities.Premier;
import upchi.api.movie.studio.entities.Studio;

@Entity
@Table(name = "films")
@Setter
@Getter
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "image_id", referencedColumnName = "id")
    private Image image;

    private String title;
    private Float duration;
    private String genre;
    private Integer year;

    @OneToMany(mappedBy = "film")
    private List<FilmActor> filmActors;

    @OneToOne
    @JoinColumn(name = "premier_id", referencedColumnName = "id")
    private Premier premier;

    @ManyToOne
    private Director director;

    @ManyToOne
    private Producer producer;

    @ManyToOne
    private Studio studio;
}