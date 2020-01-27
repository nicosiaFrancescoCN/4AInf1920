package it.itis.cuneo;

public class Angolo {
    //attributi
    private int g;
    private int p;
    private int s;

    //metodi
    public Angolo() {
        super();
    }

    public Angolo(int g, int p, int s) {
        this.g = g;
        this.p = p;
        this.s = s;
    }

    public int getGradi() {
        return this.g;
    }

    public void setGradi(int g) {
        this.g = g;
    }

    public int getPrimi() {
        return this.p;
    }

    public void setPrimi(int p) {
        this.p = p;
    }

    public int getSecondi() {
        return this.s;
    }
    public void setSecondi(int s) {
        this.s = s;
    }

    public String visualizzaAngolo() {
        return "{ " + this.g + "° " + this.p + "' " + this.s + "\" }";
    }

    public void modificaGradi(int delta) {
        if((this.g+delta >= 0) && (this.g+delta < 360)) {
            this.g += delta;
        } else {
            System.out.println("       Non è possibile aggiungere " + delta + " gradi all'angolo");
        }
    }

    public void modificaPrimi(int delta) {
        if((this.p+delta >= 0) && (this.p+delta < 360)) {
            this.p += delta;
        } else {
            System.out.println("       Non è possibile aggiungere " + delta + " primi all'angolo");
        }
    }

    public void modificaSecondi(int delta) {
        if((this.s+delta >= 0) && (this.s+delta < 360)) {
            this.s += delta;
        } else {
            System.out.println("       Non è possibile aggiungere " + delta + " secondi all'angolo");
        }
    }

    public int angoloSecondi() {
        return this.g*3600 + this.p*60 + this.s;
    }


    public void secondiAngolo(int secondi) {
        this.s = secondi % 60;
        this.p = secondi/60;
        this.g = this.p/60;
        this.p = this.p % 60;
    }

    public int differenzaSecondi(Angolo a) {
        return this.angoloSecondi() - a.angoloSecondi();
    }

    public void sommaAngolo(Angolo a) {
        this.g += a.getGradi();
        this.p += a.getPrimi();
        this.s += a.getSecondi();
        this.p += this.s / 60;
        this.s = this.s % 60;
        this.g += this.p / 60;
        this.p = this.p % 60;
    }

    public static void main(String[] args) {
        Angolo angolo1 = new Angolo(340, 40, 30);
        Angolo angolo2 = new Angolo(35, 50, 58);

        System.out.println("Il primo angolo vale: " + angolo1.visualizzaAngolo());
        System.out.println("Il Secondo angolo vale: " + angolo2.visualizzaAngolo());

        angolo1.modificaGradi(1);
        angolo1.modificaPrimi(-15);
        angolo1.modificaSecondi(-5);
        System.out.println("    Nuovi valori del primo angolo: " + angolo1.visualizzaAngolo());

        System.out.println("    Il primo angolo vale: " + angolo1.angoloSecondi() + " secondi");
        angolo1.secondiAngolo(150000);
        System.out.println("    Ora il primo angolo vale: " + angolo1.visualizzaAngolo());

        System.out.println("    La differenza tra i due angoli è: " + angolo1.differenzaSecondi(angolo2) + " secondi");

        angolo1.sommaAngolo(angolo2);
        System.out.println("    La somma dei due angoli è: " + angolo1.visualizzaAngolo());
    }
}
