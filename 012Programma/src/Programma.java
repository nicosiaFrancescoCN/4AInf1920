/**
 * Created by inf.nicosiaf1509 on 13/11/2019.
 */
public class Programma {

    private String denominazione;
    private int anno;
    private String produttore;
    private int versione;
    private int codice;
    private String sistemaOperativo;

    public Programma(){
    }

    public Programma(String denominazione, int anno, String produttore, int versione, int codice, String sistemaOperativo) {
        this.denominazione = denominazione;
        this.anno = anno;
        this.produttore = produttore;
        this.versione = versione;
        this.codice = codice;
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getVersione() {
        return versione;
    }

    public void setVersione(int versione) {
        this.versione = versione;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public boolean equals(Programma programma){
        boolean uguali = false;
        if(programma!=null
                && this.codice==programma.getCodice()
                && this.denominazione.equalsIgnoreCase(programma.getDenominazione())
                && this.produttore.equalsIgnoreCase(programma.getProduttore())
                && this.anno==programma.getAnno()
                ){

        }
        return uguali;
    }

    @Override
    public String toString() {
        return "Programma{" +
                "denominazione='" + denominazione + '\'' +
                ", anno=" + anno +
                ", produttore='" + produttore + '\'' +
                ", versione=" + versione +
                ", codice=" + codice +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }

    public void caricaProgramma(){
        this.codice = InputOutputUtility.leggiNumero("Inserisci codice: ");
        this.denominazione = InputOutputUtility.leggiNome("Inserisci denominazione: ");
        this.produttore = InputOutputUtility.leggiNome("Inserisci produttore: ");
        this.sistemaOperativo = InputOutputUtility.leggiNome("Inserisci sistema operativo: ");
        this.versione = InputOutputUtility.leggiNumero("Inserisci versione: ");
        this.anno = InputOutputUtility.leggiNumero("Inserisci anno di uscita: ");
    }
}
