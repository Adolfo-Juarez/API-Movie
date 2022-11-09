package upchi.api.movie.film.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.cover.services.interfaces.ICoverService;
import upchi.api.movie.director.services.interfaces.IDirectorService;
import upchi.api.movie.film.controllers.dtos.requests.PostFilmRequest;
import upchi.api.movie.film.controllers.dtos.requests.UpdateFilmRequest;
import upchi.api.movie.film.controllers.dtos.responses.GetFilmResponse;
import upchi.api.movie.film.controllers.dtos.responses.PostFilmResponse;
import upchi.api.movie.film.entities.Film;
import upchi.api.movie.film.repositories.IFilmRepository;
import upchi.api.movie.film.services.interfaces.IFilmService;
import upchi.api.movie.producer.services.interfaces.IProducerService;
import upchi.api.movie.studio.services.interfaces.IStudioService;

@Service
public class FilmServiceImpl implements IFilmService {

    @Autowired
    IFilmRepository repository;

    @Autowired
    ICoverService coverService;

    @Autowired
    IProducerService producerService;

    @Autowired
    IDirectorService directorService;

    @Autowired
    IStudioService studioService;

    @Override
    public List<GetFilmResponse> list() {
        return repository
                .findAll()
                .stream()
                .map(this::filmToGetResponse)
                .collect(Collectors.toList());
    }

    @Override
    public GetFilmResponse get(Long id) {
        return repository
                .findById(id)
                .map(this::filmToGetResponse)
                .orElseThrow(() -> new RuntimeException("Film not found"));
    }

    @Override
    public PostFilmResponse create(PostFilmRequest request) {

        Film film = postRequestToFilm(request);
        return filmToPostResponse(repository.save(film));

    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public GetFilmResponse update(Long id, UpdateFilmRequest request) {
        Film film = repository.findById(id).orElseThrow(()-> new RuntimeException("No Film found for update"));
        return filmToGetResponse(repository.save(updateRequestToFilm(request, film)));
    }

    @Override
    public Film findOneAndEnsureExist(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Film is not available"));
    }

    @Override
    public Film save(Film film) {
        return repository.save(film);
    }

    /*** Métodos de conversión de datos ***/

    private Film postRequestToFilm(PostFilmRequest request) {

        Film film = new Film();

        film.setTitle(request.getTitle());
        film.setDuration(request.getDuration());
        film.setYear(request.getYear());
        film.setGenre(request.getGenre());

        film.setCover(coverService.findOneAndEnsureExist((long) 1));
        film.setDirector(directorService.findOneAndEnsureExist(request.getId_director()));
        film.setProducer(producerService.findOneAndEnsureExist(request.getId_producer()));
        film.setStudio(studioService.findOneAndEnsureExist(request.getId_studio()));

        return film;
    }

    private PostFilmResponse filmToPostResponse(Film film) {

        PostFilmResponse response = new PostFilmResponse();

        response.setId(film.getId());
        response.setTitle(film.getTitle());
        response.setDuration(film.getDuration());

        return response;
    }

    private GetFilmResponse filmToGetResponse(Film film) {

        GetFilmResponse response = new GetFilmResponse();

        response.setId(film.getId());
        response.setTitle(film.getTitle());
        response.setDuration(film.getDuration());
        response.setImg(coverService.getRouteById(response.getId()));

        return response;

    }

    private Film updateRequestToFilm(UpdateFilmRequest request, Film film) {

        film.setDuration(request.getDuration());
        film.setTitle(request.getTitle());

        return film;

    }

}