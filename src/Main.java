import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film("Film1", "Regista1", 1999, 9.0);
        Film film2 = new Film("Film2", "Regista2", 2000, 10.0);

        CatalogoFilm catalogo = new CatalogoFilm(new ArrayList<>());

        catalogo.aggiungiFilm(film1);
        catalogo.aggiungiFilm(film2);

        catalogo.elencoFilm();

        catalogo.rimuovoFilm(film1);
        catalogo.elencoFilm();

        catalogo.cercaPerRegista("Regista2");
    }
}