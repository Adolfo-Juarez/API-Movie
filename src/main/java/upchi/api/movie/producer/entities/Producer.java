package upchi.api.movie.producer.entities;

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
@Table(name = "producers")
@Setter @Getter
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastname;
    private Integer age;
    private String nationality;

    @OneToMany(mappedBy = "producer")
    private List<Film> film;
}