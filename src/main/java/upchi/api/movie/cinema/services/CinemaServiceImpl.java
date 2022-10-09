package upchi.api.movie.cinema.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.cinema.repositories.ICinemaRepository;
import upchi.api.movie.cinema.services.interfaces.ICinemaService;

@Service
public class CinemaServiceImpl implements ICinemaService{

    @Autowired
    ICinemaRepository repository;

    // Por Hacer:
    // - Generar métodos en ICinemaService y sobre escribir acá

    // Los métodos del repositorio ya están siendo importados
    // repository.metodo()
    
}
