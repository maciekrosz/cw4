import java.util.ArrayList;

public class Klient {
    private String imię;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji;
    public Klient(String imię, String nazwisko, String email) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.email = email;
        this.listaRezerwacji = new ArrayList<>();
    }
    public Klient(String imię, String nazwisko, String email, ArrayList<Wydarzenie> listaRezerwacji) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.email = email;
        this.listaRezerwacji = listaRezerwacji;
    }
    public String getImię() {
        return imię;
    }
    public void setImię(String imię) {
        this.imię = imię;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Wydarzenie> getListaRezerwacji() {
        return listaRezerwacji;
    }
    public void setListaRezerwacji(ArrayList<Wydarzenie> listaRezerwacji) {
        this.listaRezerwacji = listaRezerwacji;
    }
    public void dodajRezerwację(Wydarzenie wydarzenie) {
        listaRezerwacji.add(wydarzenie);
        System.out.println("Rezerwacja na wydarzenie '" + wydarzenie.getNazwa() + "' została dodana.");
    }
    public void wyświetlRezerwacje() {
        if (listaRezerwacji.isEmpty()) {
            System.out.println("Brak zarezerwowanych wydarzeń.");
        } else {
            System.out.println("Zarezerwowane wydarzenia:");
            for (Wydarzenie wydarzenie : listaRezerwacji) {
                System.out.println(wydarzenie);
            }
        }
    }
    public void anulujRezerwację(Wydarzenie wydarzenie) {
        if (listaRezerwacji.contains(wydarzenie)) {
            listaRezerwacji.remove(wydarzenie);
            System.out.println("Rezerwacja na wydarzenie '" + wydarzenie.getNazwa() + "' została anulowana.");
        } else {
            System.out.println("Brak rezerwacji na wydarzenie '" + wydarzenie.getNazwa() + "'.");
        }
    }
    public static void main(String[] args) {
        Wydarzenie koncert = new Wydarzenie("Koncert", 120.50, "2025-05-15", "Arena");
        Wydarzenie wystawa = new Wydarzenie("Wystawa", 50.00, "2025-04-10", "Muzeum");
        Klient klient = new Klient("Jan", "Kowalski", "jan.kowalski@example.com");
        klient.dodajRezerwację(koncert);
        klient.dodajRezerwację(wystawa);
        klient.wyświetlRezerwacje();
        klient.anulujRezerwację(koncert);
        klient.wyświetlRezerwacje();
    }
}
