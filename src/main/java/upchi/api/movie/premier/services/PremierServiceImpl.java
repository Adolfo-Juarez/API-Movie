package upchi.api.movie.premier.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.premier.repositories.IPremierRepository;
import upchi.api.movie.premier.services.interfaces.IPremierService;

@Service
public class PremierServiceImpl implements IPremierService{

    @Autowired
    IPremierRepository repository;

    // Por Hacer:
    // - Generar métodos en IPremierService y sobre escribir acá

    // Los métodos del repositorio ya están siendo importados
    // repository.metodo()
    
}
