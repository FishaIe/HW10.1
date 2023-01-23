public class FilmManagRepo {
    private int lastFilms = 10;
    private PurchaseItem[] items = new PurchaseItem[0];

    public void save(PurchaseItem item) {
        PurchaseItem[] tmp = new PurchaseItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public FilmManagRepo(int lastFilms) {
        this.lastFilms = lastFilms;
    }

    public PurchaseItem[] getItems() {
        return items;
    }

    public FilmManagRepo() {

    }

    public int getLastFilms() {
        return lastFilms;
    }

    public void add(PurchaseItem item) {
        save(item);
    }

    public PurchaseItem[] getAllFilms() {
        PurchaseItem[] all = getItems();
        return all;
    }

    public PurchaseItem[] findLast() {
        PurchaseItem[] all = getAllFilms();
        PurchaseItem[] reversed = new PurchaseItem[getLastFilms()];
        for (int i = 0; i < getLastFilms(); i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

}
