package it.itis.cuneo;

public class Scatola {
    public static final int MAX_BOTTIGLIE = 5;

    private Bottiglie[] nBottiglie;
    private int cntBotti;


    public Scatola()
    {
        nBottiglie = new Bottiglie[MAX_BOTTIGLIE];
        cntBotti = 0;
    }

    public void addBottiglie(Bottiglie bottiglie)
            throws LibreriaPienaException{
        //possibile perché LibreriaPienaException extends Exception {
        if((cntBotti+1)>MAX_BOTTIGLIE)
            throw new LibreriaPienaException(1, "Troppi libri!!");
        nBottiglie[cntBotti] = bottiglie;
        cntBotti++;
    }

    public void delBottiglie(int del) throws LibreriaPienaException{

        if(del> MAX_BOTTIGLIE)
        {
            throw new LibreriaPienaException(-1, "non esiste quella bottiglia!");
        }
        nBottiglie[del].setMarca("NULL");
        nBottiglie[del].setQuantita(0);
    }


}
