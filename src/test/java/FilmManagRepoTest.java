import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmManagRepoTest {

    repository repo = new repository();
    FilmManagRepo manager = new FilmManagRepo(repo);

    PurchaseItem item1 =new PurchaseItem(1,"Бладшот", "Боевик");
    PurchaseItem item2 =new PurchaseItem(2,"Фиксики", "Комедия");
    PurchaseItem item3 =new PurchaseItem(3,"Чебурашка", "Комедия");
    PurchaseItem item4 =new PurchaseItem(4,"Кровь", "Триллер");
    PurchaseItem item5 =new PurchaseItem(5,"Астрал: Потоство", "Детектив");
    PurchaseItem item6 =new PurchaseItem(6,"Мира", "Драма");
    PurchaseItem item7 =new PurchaseItem(7,"Клипмейкеры", "Комедия");
    PurchaseItem item8 =new PurchaseItem(8,"Верблюжья дуга", "Трагикомедия");
    PurchaseItem item9 =new PurchaseItem(9,"13 изгнаний дьявола", "Ужасы");
    PurchaseItem item10 =new PurchaseItem(10,"Турбозавры", "Мультипликация");

    PurchaseItem item11 =new PurchaseItem(11,"Бонус", "Пасхалка");


    @BeforeEach
    public void setup() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
    }

    @Test
    public void lastAddedFiveFilmsTest(){
        FilmManagRepo film = new FilmManagRepo(5, repo);


        PurchaseItem[] expected = {item10, item9, item8, item7, item6};
        PurchaseItem[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest(){
        FilmManagRepo film = new FilmManagRepo(repo);

        PurchaseItem[] expected = {item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        PurchaseItem[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmToManager(){

        manager.add(item11);

        PurchaseItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11};
        PurchaseItem[] actual = manager.getAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
}
