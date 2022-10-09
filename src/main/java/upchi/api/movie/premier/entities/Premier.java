package upchi.api.movie.premier.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import upchi.api.movie.film.entities.Film;
import upchi.api.movie.pivots.CinemaPremiere;

@Entity
@Table(name = "premiers")
@Setter @Getter
public class Premier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    private String cinema;

    @OneToOne(mappedBy = "premier")
    private Film film;

    @OneToMany(mappedBy = "premier")
    private List<CinemaPremiere> cinemaPremieres;
}