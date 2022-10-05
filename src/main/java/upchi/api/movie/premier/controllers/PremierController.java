package upchi.api.movie.premier.controllers;

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

import upchi.api.movie.premier.controllers.dtos.requests.PostPremierRequest;
import upchi.api.movie.premier.controllers.dtos.responses.GetPremierResponse;
import upchi.api.movie.premier.services.interfaces.IPremierService;

@RestController
@RequestMapping("premier")
public class PremierController {

    @Autowired
    IPremierService service;

    @PostMapping
    public GetPremierResponse create(@RequestBody PostPremierRequest request){
        return service.create(request);
    }

    @GetMapping("{id}")
    public GetPremierResponse get(@PathVariable Long id){
        return service.get(id);
    }

    @GetMapping
    public List<GetPremierResponse> list(){
        return service.list();
    }

    @PutMapping("{id}")
    public GetPremierResponse update(@PathVariable Long id, @RequestBody PostPremierRequest request){
        return service.update(id,request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
