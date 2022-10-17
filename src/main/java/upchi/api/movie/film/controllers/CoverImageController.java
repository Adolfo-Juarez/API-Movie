package upchi.api.movie.film.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import upchi.api.movie.film.services.CoverImageServiceImpl;

@RestController
@RequestMapping("cover")
public class CoverImageController {
    @Autowired
    CoverImageServiceImpl service;

    @PostMapping("{id}")
    public String upload(@RequestParam MultipartFile file, @PathVariable Long id) {
        return service.upload(file, id);
    }

}