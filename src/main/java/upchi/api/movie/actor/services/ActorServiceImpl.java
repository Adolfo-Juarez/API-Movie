package upchi.api.movie.actor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.actor.repositories.IActorRepository;
import upchi.api.movie.actor.services.interfaces.IActorService;

@Service
public class ActorServiceImpl implements IActorService{

    @Autowired
    IActorRepository repository;

    // Por Hacer:
    // - Generar métodos en IActorService y sobre escribir acá

    // Los métodos del repositorio ya están siendo importados
    // repository.metodo()
    
}
