package it.itis.cuneo;

public class Bottiglie {
    String marca;
    float quantita;

    public Bottiglie()
    {
        super();
    }

    public float getQuantita() {
        return quantita;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setQuantita(float quantita) {
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return "Bottiglie:{ marca:" + marca + "," + "quantita:" + quantita + "}";
    }
}
