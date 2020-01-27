public class Villa extends Abitazione{
    private int nPiani;
    private double superficieGiardino;
    private boolean piscina;

    public Villa() {}
    public Villa(int nStanze, double superficie, String indirizzo, String citta, int nPiani, double superficieGiardino, boolean piscina) {
        super(nStanze, superficie, indirizzo, citta);
        this.nPiani = nPiani;
        this.superficieGiardino = superficieGiardino;
        this.piscina = piscina;
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

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    @Override
    public String toString() {
        return super.toString() + ", numero piani: " +nPiani+ ", superficie giardino: " +superficieGiardino+ ", piscina: " +piscina;
    }

    public boolean equals(Villa villa) {
        boolean equal = super.equals(villa);
        if (equal) {
            if (nPiani != villa.getnPiani() || superficieGiardino != villa.getSuperficieGiardino() || piscina != villa.isPiscina()) {
                equal = false;
            }
        }
        return equal;
    }
}
