package upchi.api.movie.film.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.film.controllers.dtos.requests.PostFilmRequest;
import upchi.api.movie.film.controllers.dtos.responses.GetFilmResponse;
import upchi.api.movie.film.controllers.dtos.responses.PostFilmResponse;
import upchi.api.movie.film.repositories.IFilmRepository;
import upchi.api.movie.film.services.interfaces.IFilmService;

@Service
public class FilmServiceImpl implements IFilmService{

    @Autowired
    IFilmRepository repository;

    @Override
    public List<GetFilmResponse> list() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetFilmResponse get(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PostFilmResponse create(PostFilmRequest request) {
        // TODO Auto-generated method stub
        return null;
    }


    
}
