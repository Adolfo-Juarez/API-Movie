package upchi.api.movie.premier.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import upchi.api.movie.film.entities.Film;

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
    
}