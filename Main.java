public class Main {
    public static void main(String[] args) {
        SystemRezerwacji system = new SystemRezerwacji();
// Dodaj wydarzenia i klientów
        Wydarzenie koncert = new Wydarzenie("Koncert Symphony", 120.0);
        Wydarzenie teatr = new Wydarzenie("Hamlet", 85.0);
        system.dodajWydarzenie(koncert);
        system.dodajWydarzenie(teatr);
        Klient klient1 = new Klient("Jan", "Kowalski", "jan@example.com");
        Klient klient2 = new Klient("Anna", "Nowak", "anna@example.com");
        system.dodajKlienta(klient1);
        system.dodajKlienta(klient2);
        system.dokonajRezerwacji(klient1, koncert);
        system.dokonajRezerwacji(klient1, teatr);
        system.dokonajRezerwacji(klient2, koncert);
// Wyświetl rezerwacje klienta
        System.out.println("Rezerwacje klienta " + klient1.getImię() + " " + klient1.getNazwisko() + ":");
        klient1.wyświetlRezerwacje();
// Pobierz referencję do wydarzenia z systemu
        Wydarzenie koncertRef = system.znajdźWydarzenie("Koncert Symphony");
// Modyfikacja wydarzenia przez referencję - wpłynie na wszystkich klientów, którzy mają to wydarzenie
        System.out.println("\nZmiana ceny koncertu z " + koncertRef.getCena() + " na 150.0 zł");
        koncertRef.setCena(150.0);
// Sprawdź czy zmiany są widoczne w rezerwacjach klientów
        System.out.println("\nRezerwacje klienta " + klient1.getImię() + " " + klient1.getNazwisko() + " po zmianie ceny:");
        klient1.wyświetlRezerwacje();
        System.out.println("\nRezerwacje klienta " + klient2.getImię() + " " + klient2.getNazwisko() + " po zmianie ceny:");
        klient2.wyświetlRezerwacje();
// Klient anuluje rezerwację - operacja na referencjach
        System.out.println("\nKlient " + klient1.getImię() + " anuluje rezerwację na teatr:");
        klient1.anulujRezerwację(teatr);
        klient1.wyświetlRezerwacje();
// Sprawdź liczbę dostępnych miejsc na koncercie (powinna być o 2 mniejsza od max)
        System.out.println("\nDostępne miejsca na koncercie: " + koncert.getDostępneMiejsca() +
                " z " + koncert.getMaxLiczbaMiejsc());

    }
}