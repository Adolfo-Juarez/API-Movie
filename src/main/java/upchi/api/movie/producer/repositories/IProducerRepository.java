package upchi.api.movie.producer.repositories;

import org.springframework.stereotype.Repository;
import upchi.api.movie.producer.entities.Producer;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IProducerRepository extends JpaRepository<Producer, Long>{}