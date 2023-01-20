public class PurchaseItem {
    private int id;
    private String filmName;
    private String genre;

    public PurchaseItem(int id, String filmName, String genre) {
        this.id = id;
        this.filmName = filmName;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
