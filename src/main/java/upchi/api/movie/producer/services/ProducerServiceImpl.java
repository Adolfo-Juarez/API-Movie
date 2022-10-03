package upchi.api.movie.producer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.producer.repositories.IProducerRepository;
import upchi.api.movie.producer.services.interfaces.IProducerService;

@Service
public class ProducerServiceImpl implements IProducerService{

    @Autowired
    IProducerRepository repository;

    // Por Hacer:
    // - Generar métodos en IProducerService y sobre escribir acá

    // Los métodos del repositorio ya están siendo importados
    // repository.metodo()
    
}
