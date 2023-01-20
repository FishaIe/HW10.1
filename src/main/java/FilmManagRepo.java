public class FilmManagRepo {
    private int lastFilms = 10;
    private repository repo;

    public FilmManagRepo(int lastFilms, repository repo){
        this.lastFilms = lastFilms;
        this.repo = repo;
    }

    public FilmManagRepo(repository repo) {
        this.repo = repo;
    }

    public int getLastFilms() {
        return lastFilms;
    }

    public void add(PurchaseItem item) {
        repo.save(item);
    }

    public PurchaseItem[] getAllFilms() {
        PurchaseItem[] all = repo.getItems();
        return all;
    }

    public PurchaseItem[] findAll(){
        PurchaseItem[] all = repo.getItems();
        return all;
    }

    public PurchaseItem[] findLast() {
        PurchaseItem[] all = repo.getItems();
        PurchaseItem[] reversed = new PurchaseItem[getLastFilms()];
        for (int i = 0; i < getLastFilms(); i++) {
                reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

}
