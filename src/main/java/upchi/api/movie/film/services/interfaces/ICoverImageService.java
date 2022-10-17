package upchi.api.movie.film.services.interfaces;

import org.springframework.web.multipart.MultipartFile;

public interface ICoverImageService {
    String upload(MultipartFile multipartFile, Long idUser);
}
