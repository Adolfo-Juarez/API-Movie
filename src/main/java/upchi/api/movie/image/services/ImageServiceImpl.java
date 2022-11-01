package upchi.api.movie.image.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.image.controllers.dtos.requests.PostImageRequest;
import upchi.api.movie.image.controllers.dtos.requests.UpdateImageRequest;
import upchi.api.movie.image.controllers.dtos.responses.GetImageResponse;
import upchi.api.movie.image.entities.Image;
import upchi.api.movie.image.repositories.IImageRepository;
import upchi.api.movie.image.services.interfaces.IImageService;

@Service
public class ImageServiceImpl implements IImageService {
    @Autowired
    IImageRepository repository;

    @Override
    public GetImageResponse create(PostImageRequest request) {
        return imageToGetResponse(repository.save(postRequestToImage(request)));
    }

    @Override
    public List<GetImageResponse> list() {
        return repository
                .findAll()
                .stream()
                .map(this::imageToGetResponse)
                .collect(Collectors.toList());
    }

    @Override
    public GetImageResponse get(Long id) {
        return imageToGetResponse(repository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Image no found")));
    }

    @Override
    public GetImageResponse update(Long id, UpdateImageRequest request) {
        Image image = repository.findById(id).orElseThrow(() -> new RuntimeException("Cannot update this image"));

        return imageToGetResponse(repository.save(updateRequestToImage(image, request)));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    public GetImageResponse imageToGetResponse(Image image) {
        GetImageResponse response = new GetImageResponse();

        response.setId(image.getId());
        response.setName(image.getName());

        return response;
    }

    public Image postRequestToImage(PostImageRequest request) {
        Image image = new Image();

        image.setName(request.getName());

        return image;
    }

    public Image updateRequestToImage(Image image, UpdateImageRequest updated) {
        image.setName(updated.getName());

        return image;
    }
}