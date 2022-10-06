package upchi.api.movie.studio.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import upchi.api.movie.film.entities.Film;

@Entity
@Table(name = "studios")
@Setter
@Getter
public class Studio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String headquarters;

    @OneToMany(mappedBy = "studio")
    private List<Film> films;

}