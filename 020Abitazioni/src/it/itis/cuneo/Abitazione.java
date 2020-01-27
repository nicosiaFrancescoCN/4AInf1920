package it.itis.cuneo;

/**
 * Created by inf.nicosiaf1509 on 20/11/2019.
 */
public class Abitazione {
    private int nStanze;
    private double superficie;
    private String indirizzo;
    private String città;

    public Abitazione() {
    }

    public Abitazione(String città, int nStanze, double superficie, String indirizzo) {
        this.città = città;
        this.nStanze = nStanze;
        this.superficie = superficie;
        this.indirizzo = indirizzo;
    }

    public int getnStanze() {
        return nStanze;
    }

    public void setnStanze(int nStanze) {
        this.nStanze = nStanze;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public Abitazione(Abitazione abitazione) {
        this.città = abitazione.getCittà();
        this.nStanze = abitazione.getnStanze();
        this.superficie = abitazione.getSuperficie();
        this.indirizzo = abitazione.getIndirizzo();
    }

    @Override
    public String toString() {
        return  "nStanze=" + nStanze +
                ", superficie=" + superficie +
                ", indirizzo='" + indirizzo + '\'' +
                ", città='" + città + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Abitazione that = (Abitazione) o;

        if (nStanze != that.nStanze) return false;
        if (Double.compare(that.superficie, superficie) != 0) return false;
        if (indirizzo != null ? !indirizzo.equals(that.indirizzo) : that.indirizzo != null) return false;
        return città != null ? città.equals(that.città) : that.città == null;

    }
}
