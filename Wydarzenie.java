public class Wydarzenie {
    private int maxLiczbaMiejsc = 100;
    private String nazwa;
    private String data;
    private String miejsce;
    private double cena;
    private int dostępneMiejsca = 0;


    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = "Brak daty";
        this.miejsce = "Brak miejsca";
    }

    public Wydarzenie(String nazwa, double cena, String data) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = "Brak miejsca";
    }
    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }

    public int getDostępneMiejsca() {
        int dostępneMiejsca = 0;
        return dostępneMiejsca;
    }

    public void setDostępneMiejsca(int dostępneMiejsca) {
        this.dostępneMiejsca = dostępneMiejsca;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }


    @Override
    public String toString() {
        return "Wydarzenie: " + nazwa + "\n" +
                "Data: " + data + "\n" +
                "Miejsce: " + miejsce + "\n" +
                "Cena: " + cena + " PLN\n" +
                "Dostępne miejsca: " + dostępneMiejsca + "/" + maxLiczbaMiejsc;
    }

    public void zarezerwujMiejsce() {
        if (dostępneMiejsca > 0) {
            dostępneMiejsca--;
            System.out.println("Miejsce zostało zarezerwowane.");
        } else {
            System.out.println("Brak dostępnych miejsc.");
        }
    }

    public static void main(String[] args) {

        Wydarzenie wydarzenie1 = new Wydarzenie("Koncert", 120.50);
        wydarzenie1.setDostępneMiejsca(50);
        System.out.println(wydarzenie1);
        wydarzenie1.zarezerwujMiejsce();
        System.out.println(wydarzenie1);

        Wydarzenie wydarzenie2 = new Wydarzenie("Wystawa", 50.00, "2025-03-28");
        wydarzenie2.setDostępneMiejsca(30);
        System.out.println(wydarzenie2);
        wydarzenie2.zarezerwujMiejsce();
        System.out.println(wydarzenie2);
    }
}