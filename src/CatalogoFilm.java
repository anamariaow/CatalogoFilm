import java.util.ArrayList;

public class CatalogoFilm {
    ArrayList<Film> filmArrayList;

    public CatalogoFilm(ArrayList<Film> filmArrayList) {
        this.filmArrayList = filmArrayList;
    }

    public ArrayList<Film> getFilmArrayList() {
        return filmArrayList;
    }

    public void setFilmArrayList(ArrayList<Film> filmArrayList) {
        this.filmArrayList = filmArrayList;
    }

    public void aggiungiFilm(Film film) {
        filmArrayList.add(film);
    }

    public void rimuovoFilm(Film film) {
        filmArrayList.remove(film);
    }

    public void elencoFilm() {
        for (Film filmVar : filmArrayList) {
            System.out.println(filmVar);
        }
    }

    public void cercaPerRegista(String regista) {
        for (Film filmVar : filmArrayList) {
            if (filmVar.getRegista().equals(regista)) {
                System.out.println(filmVar);
            }
        }
    }
}
