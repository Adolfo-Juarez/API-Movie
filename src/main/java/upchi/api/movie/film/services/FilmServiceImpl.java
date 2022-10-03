package upchi.api.movie.film.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.film.repositories.IFilmRepository;
import upchi.api.movie.film.services.interfaces.IFilmService;

@Service
public class FilmServiceImpl implements IFilmService{

    @Autowired
    IFilmRepository repository;

    // Por Hacer:
    // - Generar métodos en IFilmService y sobre escribir acá

    // Los métodos del repositorio ya están siendo importados
    // repository.metodo()
    
}
