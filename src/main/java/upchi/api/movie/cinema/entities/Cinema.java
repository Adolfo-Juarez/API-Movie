package upchi.api.movie.cinema.entities;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import upchi.api.movie.pivots.CinemaPremiere;

import java.util.List;

@Entity
@Table(name = "cinemas")
@Setter @Getter
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private String name;

    @OneToMany(mappedBy = "cinema")
    private List<CinemaPremiere> cinemaPremieres;
}
