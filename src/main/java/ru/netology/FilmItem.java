package ru.netology;
public class FilmItem {
    private int filmId;
    private String filmName;
    private String filmType;

    public FilmItem(int filmId, String filmName, String filmType) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmType = filmType;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmType() {
        return filmType;
    }

    public void setFilmType(String filmType) {
        this.filmType = filmType;
    }

}
