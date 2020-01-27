package it.itis.cuneo;

/**
 * Created by inf.naccaratom0711 on 17/10/2019.
 */
public class Libro {

    //attributi
    private String titolo;
    private Autore autore;
    private CasaEditrice casaEditrice;
    private String dataPubblicazione;


    //metodi

    //costuttori
    public Libro() { super(); }

    public Libro(String titolo, Autore autore, CasaEditrice casaEditrice, String dataPubblicazione) {
        this.titolo = titolo;
        this.autore = new Autore(autore);
        this.casaEditrice = new CasaEditrice(casaEditrice);
        this.dataPubblicazione = dataPubblicazione;
    }

    public Libro (Libro libro) {
        this.titolo = libro.getTitolo();
        this.autore = new Autore(libro.getAutore());
        this.casaEditrice = new CasaEditrice(libro.getCasaEditrice());
        this.dataPubblicazione = libro.getDataPubblicazione();
    }


    //getter e setter
    public String getTitolo() { return this.titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo; }

    public Autore getAutore() { return this.autore; }
    public void setAutore(Autore autore) { this.autore = new Autore(autore); }

    public CasaEditrice getCasaEditrice() { return this.casaEditrice; }
    public void setCasaEditrice(CasaEditrice casaEditrice) { this.casaEditrice = new CasaEditrice(casaEditrice); }

    public String getDataPubblicazione() { return this.dataPubblicazione; }
    public void setDataPubblicazione(String dataPubblicazione) { this.dataPubblicazione = dataPubblicazione; }



    //main
    public static void main(String[] args) {

    }
}
