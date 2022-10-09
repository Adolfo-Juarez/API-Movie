package upchi.api.movie.pivots;

import lombok.Getter;
import lombok.Setter;
import upchi.api.movie.cinema.entities.Cinema;
import upchi.api.movie.premier.entities.Premier;

import javax.persistence.*;

@Entity
@Table(name="cinema_premiere")
@Setter
@Getter
public class CinemaPremiere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cinema cinema;

    @ManyToOne
    private Premier premier;
}
