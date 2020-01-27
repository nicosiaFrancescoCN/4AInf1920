package it.itis.cuneo;

public class Trapezio implements Poligono {

    private float lato1;
    private float lato2;
    private float lato3;
    private float lato4;

    public Trapezio() {
    }

    public Trapezio(float lato1, float lato2, float lato3, float lato4) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        this.lato4 = lato4;
    }

    public float getLato1() {
        return lato1;
    }

    public void setLato1(float lato1) {
        this.lato1 = lato1;
    }

    public float getLato2() {
        return lato2;
    }

    public void setLato2(float lato2) {
        this.lato2 = lato2;
    }

    public float getLato3() {
        return lato3;
    }

    public void setLato3(float lato3) {
        this.lato3 = lato3;
    }

    public float getLato4() {
        return lato4;
    }

    public void setLato4(float lato4) {
        this.lato4 = lato4;
    }

    @Override
    public double perimetro() {
        return(this.getLato1() + this.getLato2() + this.getLato3() + this.getLato4());
    }
}
