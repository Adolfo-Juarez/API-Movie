package upchi.api.movie.director.controllers;

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

import upchi.api.movie.director.controllers.dtos.requests.PostDirectorRequest;
import upchi.api.movie.director.controllers.dtos.requests.UpdateDirectorRequest;
import upchi.api.movie.director.controllers.dtos.responses.GetDirectorResponse;
import upchi.api.movie.director.services.interfaces.IDirectorService;

@RestController
@RequestMapping("director")
public class DirectorController {

    @Autowired
    IDirectorService service;

    @GetMapping
    public List<GetDirectorResponse> list(){
        return service.list();
    }

    @GetMapping("{id}")
    public GetDirectorResponse get(@PathVariable Long id){
        return service.get(id);
    }

    @PostMapping
    public GetDirectorResponse create(@RequestBody PostDirectorRequest request){
        return service.create(request);
    }

    @PutMapping("{id}")
    public GetDirectorResponse update(@PathVariable Long id, @RequestBody UpdateDirectorRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
