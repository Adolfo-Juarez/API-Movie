package upchi.api.movie.studio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import upchi.api.movie.studio.controllers.dtos.requests.PostStudioRequest;
import upchi.api.movie.studio.controllers.dtos.requests.UpdateStudioRequest;
import upchi.api.movie.studio.controllers.dtos.responses.GetStudioResponse;
import upchi.api.movie.studio.services.interfaces.IStudioService;

import java.util.List;

@RestController
@RequestMapping("studio")
public class StudioController {

    @Autowired
    IStudioService service;

    @GetMapping
    public List<GetStudioResponse> list(){
        return service.list();
    }

    @GetMapping("{id}")
    public GetStudioResponse get(@PathVariable Long id){
        return service.get(id);
    }

    @PostMapping
    public GetStudioResponse create(@RequestBody PostStudioRequest request){
        return service.create(request);
    }

    @PutMapping("{id}")
    public GetStudioResponse update(@PathVariable Long id,@RequestBody UpdateStudioRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}