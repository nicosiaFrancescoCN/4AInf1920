package it.itis.cuneo;

/**
 * Created by inf.naccaratom0711 on 17/10/2019.
 */
public class Autore {

    //attributi
    private String cognome, nome;
    private int annoNascita;


    //metodi

    //costruttori
    public Autore() { super(); }

    public Autore(String cognome, String nome, int annoNascita) {
        this.cognome = cognome;
        this.nome = nome;
        this.annoNascita = annoNascita;
    }

    public Autore(Autore autore) {
        this.cognome = autore.getCognome();
        this.nome = autore.getNome();
        this.annoNascita = autore.getAnnoNascita();
    }


    //getter e setter
    public String getCognome() { return this.cognome; }
    public void setCognome(String cognome) { this.cognome = cognome; }

    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCognomeNome() { return this.cognome + " " + this.nome; }

    public int getAnnoNascita() { return this.annoNascita; }
    public void setAnnoNascita(int annoNascita) { this.annoNascita = annoNascita; }

    //stato oggetto
}
