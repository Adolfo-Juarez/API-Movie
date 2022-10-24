package upchi.api.movie.producer.controllers;

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
import upchi.api.movie.producer.controllers.dtos.requests.PostProducerRequest;
import upchi.api.movie.producer.controllers.dtos.requests.UpdateProducerRequest;
import upchi.api.movie.producer.controllers.dtos.responses.GetProducerResponse;
import upchi.api.movie.producer.services.interfaces.IProducerService;

@RestController
@RequestMapping("producer")
public class ProducerController {
    @Autowired
    IProducerService service;

    @GetMapping
    public List<GetProducerResponse> list(){
        return service.list();
    }

    @GetMapping("{id}")
    public GetProducerResponse get(@PathVariable Long id){
        return service.get(id);
    }

    @PostMapping
    public GetProducerResponse create(@RequestBody PostProducerRequest request){
        return service.create(request);
    }

    @PutMapping("{id}")
    public GetProducerResponse update(@PathVariable Long id, @RequestBody UpdateProducerRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}