package upchi.api.movie.image.repositories;

import org.springframework.stereotype.Repository;
import upchi.api.movie.image.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IImageRepository extends JpaRepository<Image, Long> {
}