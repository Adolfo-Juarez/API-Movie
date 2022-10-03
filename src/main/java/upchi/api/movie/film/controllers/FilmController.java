package upchi.api.movie.film.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upchi.api.movie.film.services.interfaces.IFilmService;

@RestController
@RequestMapping("film")
public class FilmController {

    @Autowired
    IFilmService service;

    // Por Hacer:
    // - Agregar las rutas correspondientes para las peticiones HTTP
    //     - GET, POST, UPDATE y DELETE

    // La interfaz del servicio ya están importados

    // Eliminar el método que viene por defecto  HelloWorld
    @GetMapping
    public String HelloWorld() {
        return "Hello World, we're in Film";
    }

}
