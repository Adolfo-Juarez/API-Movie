package upchi.api.movie.pivots.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import upchi.api.movie.actor.entities.Actor;
import upchi.api.movie.film.entities.Film;

@Entity
@Table(name="films_actors")
@Setter @Getter
public class FilmActor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    private Film film;

    @ManyToOne
    private Actor actor;

}