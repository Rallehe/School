public class OnlyPopFilter implements GenreFilter{
    @Override
    public boolean permit(Album album) {
        return album.genre().equals(Album.Genre.POP.toString());
    }
}
