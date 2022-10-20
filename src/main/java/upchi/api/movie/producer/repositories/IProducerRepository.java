package upchi.api.movie.producer.repositories;

import org.springframework.stereotype.Repository;
import upchi.api.movie.producer.entities.Producer;
import org.springframework.data.jpa.repository.JpaRepository;

// No es necesario ninguna acción acá

@Repository
public interface IProducerRepository extends JpaRepository<Producer, Long>{}
