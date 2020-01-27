public class Abitazione {
    private int nStanze;
    private double superficie;
    private String indirizzo;
    private String citta;

    public Abitazione() {}
    public Abitazione(int nStanze, double superficie, String indirizzo, String citta) {
        this.nStanze = nStanze;
        this.superficie = superficie;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

    public int getnStanze() {
        return nStanze;
    }

    public void setnStanze(int nStanze) {
        this.nStanze = nStanze;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public String toString() {
        return "Numero stanze: " +nStanze+ ", superficie: " +superficie+ ", indirizzo: " +indirizzo+ ", citta: " +citta;
    }

    public boolean equals(Abitazione abitazione) {
        boolean equal = false;
        if (nStanze == abitazione.getnStanze() && superficie == abitazione.getSuperficie() && indirizzo.equalsIgnoreCase(abitazione.getIndirizzo()) && citta.equalsIgnoreCase(abitazione.getCitta())) {
            equal = true;
        }
        return equal;
    }
}
