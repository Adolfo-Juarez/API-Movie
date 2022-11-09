package upchi.api.movie.cover.services.interfaces;

import upchi.api.movie.cover.entities.Cover;

public interface ICoverService {
    public void updateFilmCover(String coverPicturesUrl, Long id);
    public String getRouteById(Long id);
    public Cover findOneAndEnsureExist(Long id);
}