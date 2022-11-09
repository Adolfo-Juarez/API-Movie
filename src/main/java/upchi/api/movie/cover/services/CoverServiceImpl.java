package upchi.api.movie.cover.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upchi.api.movie.cover.entities.Cover;
import upchi.api.movie.cover.repositories.ICoverRepository;
import upchi.api.movie.cover.services.interfaces.ICoverService;
import upchi.api.movie.film.entities.Film;
import upchi.api.movie.film.repositories.IFilmRepository;
import upchi.api.movie.film.services.interfaces.IFilmService;

@Service
public class CoverServiceImpl implements ICoverService{

    @Autowired
    ICoverRepository repository;

    @Autowired
    IFilmRepository filmRepository;

    @Autowired
    IFilmService filmService;

    @Override
    public void updateFilmCover(String coverPicturesUrl, Long id) {
        Film film = filmService.findOneAndEnsureExist(id);
        Cover cover = new Cover();

        film.setCover(cover);
        cover.setRoute(coverPicturesUrl);

        repository.save(cover);
        filmRepository.save(film);

    }

    @Override
    public String getRouteById(Long id) {
        Cover cover = filmService.findOneAndEnsureExist(id).getCover();
        return cover.getRoute();
    }
    
    

}
