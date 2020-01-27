package it.itis.cuneo;

/**
 * Created by inf.nicosiaf1509 on 20/11/2019.
 */
public class Appartamento extends Abitazione{

    private int piano;
    private boolean haLift;
    private int nBalconi;

    public Appartamento() {
    }

    public Appartamento(String città, int nStanze, double superficie, String indirizzo, int piano, boolean haLift, int nBalconi) {
        super(città, nStanze, superficie, indirizzo);
        this.piano = piano;
        this.haLift = haLift;
        this.nBalconi = nBalconi;
    }

    public Appartamento(int piano, boolean haLift, int nBalconi) {
        this.piano = piano;
        this.haLift = haLift;
        this.nBalconi = nBalconi;
    }

    public Appartamento(Abitazione abitazione, int piano, boolean haLift, int nBalconi) {
        super(abitazione);
        this.piano = piano;
        this.haLift = haLift;
        this.nBalconi = nBalconi;
    }

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public boolean isHaLift() {
        return haLift;
    }

    public void setHaLift(boolean haLift) {
        this.haLift = haLift;
    }

    public int getnBalconi() {
        return nBalconi;
    }

    public void setnBalconi(int nBalconi) {
        this.nBalconi = nBalconi;
    }

    @Override
    public String toString() {
        return "Appartamento{" + super.toString() +
                "piano=" + piano +
                ", haLift=" + haLift +
                ", nBalconi=" + nBalconi +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        boolean ret = true;

        if (this != o)
            ret = false;
        if (o == null || getClass() != o.getClass())
            ret = false;
        if (!super.equals(o))
            ret = false;

        Appartamento that = (Appartamento) o;

        if (ret) {
            if (piano != that.piano)
                ret = false;
            if (haLift != that.haLift)
                ret = false;
            if (nBalconi != that.nBalconi)
                ret = false;
        }

        return ret;

        }

    }


