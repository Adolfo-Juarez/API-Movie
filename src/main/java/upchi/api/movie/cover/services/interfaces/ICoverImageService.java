package upchi.api.movie.cover.services.interfaces;

import org.springframework.web.multipart.MultipartFile;

public interface ICoverImageService {
    String upload(MultipartFile multipartFile, Long idUser);
}
