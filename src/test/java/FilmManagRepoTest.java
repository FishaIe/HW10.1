import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmManagRepoTest {
    FilmManagRepo manager = new FilmManagRepo();
    FilmManagRepo film = new FilmManagRepo(5);

    PurchaseItem item1 = new PurchaseItem(1, "Бладшот", "Боевик");
    PurchaseItem item2 = new PurchaseItem(2, "Фиксики", "Комедия");
    PurchaseItem item3 = new PurchaseItem(3, "Чебурашка", "Комедия");
    PurchaseItem item4 = new PurchaseItem(4, "Кровь", "Триллер");
    PurchaseItem item5 = new PurchaseItem(5, "Астрал: Потоство", "Детектив");
    PurchaseItem item6 = new PurchaseItem(6, "Мира", "Драма");
    PurchaseItem item7 = new PurchaseItem(7, "Клипмейкеры", "Комедия");
    PurchaseItem item8 = new PurchaseItem(8, "Верблюжья дуга", "Трагикомедия");
    PurchaseItem item9 = new PurchaseItem(9, "13 изгнаний дьявола", "Ужасы");
    PurchaseItem item10 = new PurchaseItem(10, "Турбозавры", "Мультипликация");

    PurchaseItem item11 = new PurchaseItem(11, "Бонус", "Пасхалка");


    @BeforeEach
    public void setup() {
        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);
        manager.save(item8);
        manager.save(item9);
        manager.save(item10);
        film.save(item1);
        film.save(item2);
        film.save(item3);
        film.save(item4);
        film.save(item5);
        film.save(item6);
        film.save(item7);
        film.save(item8);
        film.save(item9);
        film.save(item10);
    }

    @Test
    public void lastAddedFiveFilmsTest() {

        PurchaseItem[] expected = {item10, item9, item8, item7, item6};
        PurchaseItem[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {

        PurchaseItem[] expected = {item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        PurchaseItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmToManager() {

        manager.add(item11);

        PurchaseItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11};
        PurchaseItem[] actual = manager.getAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
}
