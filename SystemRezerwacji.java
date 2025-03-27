import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> listaWydarzeń;
    private ArrayList<Klient> listaKlientów;

    public SystemRezerwacji() {
        this.listaWydarzeń = new ArrayList<>();
        this.listaKlientów = new ArrayList<>();
    }
    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        listaWydarzeń.add(wydarzenie);
        System.out.println("Wydarzenie '" + wydarzenie.getNazwa() + "' zostało dodane.");
    }
    public void dodajWydarzenie(String nazwa, double cena, String data, String miejsce) {
        Wydarzenie wydarzenie = new Wydarzenie(nazwa, cena, data, miejsce);
        listaWydarzeń.add(wydarzenie);
        System.out.println("Wydarzenie '" + nazwa + "' zostało dodane.");
    }
    public void dodajKlienta(Klient klient) {
        listaKlientów.add(klient);
        System.out.println("Klient '" + klient.getImię() + " " + klient.getNazwisko() + "' został dodany.");
    }
    public void dodajKlienta(String imię, String nazwisko, String email) {
        Klient klient = new Klient(imię, nazwisko, email);
        listaKlientów.add(klient);
        System.out.println("Klient '" + imię + " " + nazwisko + "' został dodany.");
    }
    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        if (wydarzenie.getDostępneMiejsca() > 0) {
            klient.dodajRezerwację(wydarzenie);
            wydarzenie.zarezerwujMiejsce();
        } else {
            System.out.println("Brak dostępnych miejsc na wydarzenie '" + wydarzenie.getNazwa() + "'.");
        }
    }
    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie wydarzenie : listaWydarzeń) {
            if (wydarzenie.getNazwa().equals(nazwa)) {
                return wydarzenie;
            }
        }
        System.out.println("Wydarzenie o nazwie '" + nazwa + "' nie zostało znalezione.");
        return null;
    }
    public Klient znajdzKlienta(String nazwisko) {
        for (Klient klient : listaKlientów) {
            if (klient.getNazwisko().equals(nazwisko)) {
                return klient;
            }
        }
        System.out.println("Klient o nazwisku '" + nazwisko + "' nie został znaleziony.");
        return null;
    }
    public void zmieńCenęWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie wydarzenie = znajdzWydarzenie(nazwa);
        if (wydarzenie != null) {
            wydarzenie.setCena(nowaCena);
            System.out.println("Cena wydarzenia '" + nazwa + "' została zmieniona na " + nowaCena + " PLN.");
        }
    }
    public static void main(String[] args) {
        SystemRezerwacji system = new SystemRezerwacji();
        Wydarzenie koncert = new Wydarzenie("Koncert", 120.50, "2025-05-15", "Arena");
        Wydarzenie wystawa = new Wydarzenie("Wystawa", 50.00, "2025-04-10", "Muzeum");
        system.dodajWydarzenie(koncert);
        system.dodajWydarzenie(wystawa);
        Klient klient1 = new Klient("Jan", "Kowalski", "jan.kowalski@example.com");
        system.dodajKlienta(klient1);
        system.dokonajRezerwacji(klient1, koncert);
        klient1.wyświetlRezerwacje();
        system.zmieńCenęWydarzenia("Koncert", 150.00);
        System.out.println(koncert);
    }

    public Wydarzenie znajdźWydarzenie(String koncertSymphony) {
        return null;
    }
}
