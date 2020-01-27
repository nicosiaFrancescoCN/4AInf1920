package it.itis.cuneo;

public class Programma {

    //attributi
    private String denominazione, produttore, versione, sistemaOperativo;
    private int anno;

    //metodi

    //costruttori
    public Programma() { super(); }

    public Programma(String denominazione, String produttore, String versione, String sistemaOperativo, int anno) {
        this.denominazione = denominazione;
        this.produttore = produttore;
        this.versione = versione;
        this.sistemaOperativo = sistemaOperativo;
        this.anno = anno;
    }

    public Programma(Programma programma) {
        this.denominazione = programma.getDenominazione();
        this.produttore = programma.getProduttore();
        this.versione = programma.getVersione();
        this.sistemaOperativo = programma.getSistemaOperativo();
        this.anno = programma.getAnno();
    }


    //getter e setter
    public String getDenominazione() { return this.denominazione; }
    public void setDenominazione(String denominazione) { this.denominazione = denominazione; }
    public String getProduttore() { return this.produttore; }
    public void setProduttore(String produttore) { this.produttore = produttore; }
    public String getVersione() { return this.versione; }
    public void setVersione(String versione) { this.versione = versione; }
    public String getSistemaOperativo() { return this.sistemaOperativo; }
    public void setSistemaOperativo(String sistemaOperativo) { this.sistemaOperativo = sistemaOperativo; }
    public int getAnno() { return this.anno; }
    public void setAnno(int anno) { this.anno = anno; }

    //stato oggetto
    public String toString() {
        return "Programma{ \"denominazione\": " + this.denominazione + ", " +
                "\"produttore\": " + this.produttore + ", " +
                "\"versione\": " + this.versione + ", " +
                "\"sistemaOperativo\": " + this.sistemaOperativo + ", " +
                "\"anno\": " + this.anno + " }";
    }


    //confronto anno produzione
    public String compareAnno(Programma programma) {
        //inizio stringa
        String compare = "Il programma " + this.denominazione + "(" + this.anno + ") ";
        //confronto anni
        if(this.anno>programma.getAnno()) {
            compare += "è più recente";
        } else {
            if(this.anno==programma.getAnno()) {
                compare += "è stato pubblicato nello stesso anno";
            } else {
                compare += "è più obsoleto del programma";
            }
        }
        //fine stringa
        compare += " del programma " + programma.getDenominazione() + "(" + programma.getAnno() + ").";
        //restituzione stringa
        return compare;
    }

    public static void main(String[] args) {
        Programma programma1 = new Programma("MotoGP", "Milestone", "25.0.9", "Windows", 2019);
        System.out.println("Programma 1: " + programma1.toString());

        Programma programma2 = new Programma(programma1);
        programma2.setDenominazione("F1");
        programma2.setProduttore("Codemaster");
        programma2.setAnno(2008);
        System.out.println("Programma 2: " + programma2.toString());

        Programma programma3 = new Programma(programma1);
        programma3.setVersione("35.4.0");
        programma3.setAnno(2019);
        System.out.println("Programma 3: " + programma3.toString());

        System.out.println(programma1.compareAnno(programma2));
        System.out.println(programma2.compareAnno(programma3));
        System.out.println(programma1.compareAnno(programma3));
    }
}
