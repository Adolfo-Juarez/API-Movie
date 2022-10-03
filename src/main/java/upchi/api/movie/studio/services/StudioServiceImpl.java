package upchi.api.movie.studio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.studio.repositories.IStudioRepository;
import upchi.api.movie.studio.services.interfaces.IStudioService;

@Service
public class StudioServiceImpl implements IStudioService{

    @Autowired
    IStudioRepository repository;

    // Por Hacer:
    // - Generar métodos en IStudioService y sobre escribir acá

    // Los métodos del repositorio ya están siendo importados
    // repository.metodo()
    
}
