package it.itis.cuneo;

/**
 * Created by inf.naccaratom0711 on 17/10/2019.
 */
public class CasaEditrice {

    //attributi
    private String ragioneSociale, luogo;
    private int annoFondazione;


    //metodi

    public CasaEditrice() { super(); }

    public CasaEditrice(String ragioneSociale, String luogo, int annoFondazione) {
        this.ragioneSociale = ragioneSociale;
        this.luogo = luogo;
        this.annoFondazione = annoFondazione;
    }

    public CasaEditrice(CasaEditrice casaEditrice) {
        this.ragioneSociale = casaEditrice.getRagioneSociale();
        this.luogo = casaEditrice.getLuogo();
        this.annoFondazione = casaEditrice.getAnnoFondazione();
    }


    //getter e setter
    public String getRagioneSociale() { return this.ragioneSociale; }
    public void setRagioneSociale(String ragioneSociale) { this.ragioneSociale = ragioneSociale; }

    public String getLuogo() { return this.luogo; }
    public void setLuogo(String luogo) { this.luogo = luogo; }

    public int getAnnoFondazione() { return this.annoFondazione; }
    public void setAnnoFondazione(int annoFondazione) { this.annoFondazione = annoFondazione; }
}
