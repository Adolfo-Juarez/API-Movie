package upchi.api.movie.actor.entities;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "actors")
@Setter @Getter
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    @Column(name = "pseudonimo")
    private String nickname;
    private Integer age;
    private String nacionality;



}
