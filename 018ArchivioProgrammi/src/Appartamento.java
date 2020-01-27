public class Appartamento extends Abitazione {
    private int piano;
    private boolean raggiungibile;
    private int nTerrazzi;

    public Appartamento() {}
    public Appartamento(int nStanze, double superficie, String indirizzo, String citta, int piano, boolean raggiungibile, int nTerrazzi) {
        super(nStanze, superficie, indirizzo, citta);
        this.piano = piano;
        this.raggiungibile = raggiungibile;
        this.nTerrazzi = nTerrazzi;
    }

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public boolean isRaggiungibile() {
        return raggiungibile;
    }

    public void setRaggiungibile(boolean raggiungibile) {
        this.raggiungibile = raggiungibile;
    }

    public int getnTerrazzi() {
        return nTerrazzi;
    }

    public void setnTerrazzi(int nTerrazzi) {
        this.nTerrazzi = nTerrazzi;
    }

    @Override
    public String toString() {
        return super.toString() + ", piano: " +piano+ ", raggiungibile in ascensore: " +raggiungibile+ ", numero terrazzi: " +nTerrazzi;
    }

    public boolean equals(Appartamento appartamento) {
        boolean  equal = super.equals(appartamento);
        if (equal == true) {
            if (piano != appartamento.getPiano() || raggiungibile != appartamento.isRaggiungibile() || nTerrazzi != appartamento.getnTerrazzi()) {
                equal = false;
            }
        }
        return equal;
    }
}
