package upchi.api.movie.cover.services.interfaces;

public interface ICoverService {
    public void updateFilmCover(String coverPicturesUrl, Long id);
    public String getRouteById(Long id);
}