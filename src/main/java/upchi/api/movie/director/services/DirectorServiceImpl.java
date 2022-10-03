package upchi.api.movie.director.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.director.repositories.IDirectorRepository;
import upchi.api.movie.director.services.interfaces.IDirectorService;

@Service
public class DirectorServiceImpl implements IDirectorService{

    @Autowired
    IDirectorRepository repository;

    // Por Hacer:
    // - Generar métodos en IDirectorService y sobre escribir acá

    // Los métodos del repositorio ya están siendo importados
    // repository.metodo()
    
}
