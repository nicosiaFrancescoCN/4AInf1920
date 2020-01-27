package it.itis.cuneo;

public class CD {
    private String titolo;
    private String autore;
    private int Brani;
    private float durata;

    public CD(String titolo, String autore, int numeroBrani, float durata) {
        this.titolo = titolo;
        this.autore = autore;
        this.Brani = Brani;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getBrani() {
        return Brani;
    }

    public float getDurata() {
        return durata;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setBrani(int numeroBrani) {
        this.Brani = numeroBrani;
    }

    public void setDurata(float durata) {
        this.durata = durata;
    }

    public String toString(){
        return "Cd{ titolo: " + this.titolo + "autore: " + this.autore + "Brani: " + this.Brani + "durata: " + this.durata + "}";
    }

    public String comparaDurata(CD cd){
        String risultato = "il secondo CD è più lungo ";

        if(this.getDurata() > cd.getDurata())
        {
            risultato = "il primo CD è più lungo";
        }

        return risultato;
    }


}
