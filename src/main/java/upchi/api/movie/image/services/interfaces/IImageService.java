package upchi.api.movie.image.services.interfaces;

import java.util.List;

import upchi.api.movie.image.controllers.dtos.requests.PostImageRequest;
import upchi.api.movie.image.controllers.dtos.requests.UpdateImageRequest;
import upchi.api.movie.image.controllers.dtos.responses.GetImageResponse;

public interface IImageService {
    public GetImageResponse create(PostImageRequest request);

    public List<GetImageResponse> list();

    public GetImageResponse get(Long id);

    public GetImageResponse update(Long id, UpdateImageRequest request);

    public void delete(Long id);
}