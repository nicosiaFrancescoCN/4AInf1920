package it.itis.cuneo;

/**
 * Created by Marco Lorenzo Peretti 03/11/19
 */
public class LibreriaPienaException extends Exception {
    private int codice;
    private String descrizione;

    public LibreriaPienaException(int codice, String descrizione) {
        this.codice = codice;
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "LibreriaPienaException{" +
                "codice=" + codice +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}