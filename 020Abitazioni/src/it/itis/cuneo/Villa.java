package it.itis.cuneo;

/**
 * Created by inf.nicosiaf1509 on 20/11/2019.
 */
public class Villa  extends  Abitazione{
    private int nPiani;
    private double superficieGiardino;
    private boolean haPiscina;


    public Villa() {
    }

    public Villa(int nPiani, double superficieGiardino, boolean haPiscina) {
        this.nPiani = nPiani;
        this.superficieGiardino = superficieGiardino;
        this.haPiscina = haPiscina;
    }

    public Villa(String città, int nStanze, double superficie, String indirizzo, int nPiani, double superficieGiardino, boolean haPiscina) {
        super(città, nStanze, superficie, indirizzo);
        this.nPiani = nPiani;
        this.superficieGiardino = superficieGiardino;
        this.haPiscina = haPiscina;
    }

    public Villa(Abitazione abitazione, int nPiani, double superficieGiardino, boolean haPiscina) {
        super(abitazione);
        this.nPiani = nPiani;
        this.superficieGiardino = superficieGiardino;
        this.haPiscina = haPiscina;
    }

    public int getnPiani() {
        return nPiani;
    }

    public void setnPiani(int nPiani) {
        this.nPiani = nPiani;
    }

    public double getSuperficieGiardino() {
        return superficieGiardino;
    }

    public void setSuperficieGiardino(double superficieGiardino) {
        this.superficieGiardino = superficieGiardino;
    }

    public boolean isHaPiscina() {
        return haPiscina;
    }

    public void setHaPiscina(boolean haPiscina) {
        this.haPiscina = haPiscina;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                ", nPiani=" + nPiani +
                ", superficieGiardino=" + superficieGiardino +
                ", haPiscina=" + haPiscina +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        boolean ret = true;

        if(this != o)
            ret = false;
        if (o == null || getClass() != o.getClass())
            ret = false;
        if (!super.equals(o))
            ret = false;

        Villa villa = (Villa) o;

        if(ret) {
            if (nPiani != villa.nPiani)
                ret = false;
            if (Double.compare(villa.superficieGiardino, superficieGiardino) != 0)
                ret = false;
            if (haPiscina != villa.haPiscina)
                ret = false;
        }
        return ret;
    }


}
