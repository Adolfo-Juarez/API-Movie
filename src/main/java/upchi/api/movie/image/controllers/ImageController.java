package upchi.api.movie.image.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import upchi.api.movie.image.controllers.dtos.requests.PostImageRequest;
import upchi.api.movie.image.controllers.dtos.requests.UpdateImageRequest;
import upchi.api.movie.image.controllers.dtos.responses.GetImageResponse;
import upchi.api.movie.image.services.interfaces.IImageService;

@RestController
@RequestMapping("image")
public class ImageController {
    @Autowired
    IImageService service;

    @GetMapping
    public List<GetImageResponse> list() {
        return service.list();
    }

    @GetMapping("{id}")
    public GetImageResponse get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public GetImageResponse create(@RequestBody PostImageRequest request) {
        return service.create(request);
    }

    @PutMapping("{id}")
    public GetImageResponse update(@PathVariable Long id, @RequestBody UpdateImageRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}