package it.itis.cuneo;

/**
 * Created by inf.perettim1004 on 07/10/2019.
 */
public class PianoCartesiano {

    Rettangolo rettangolo1;
    Rettangolo rettangolo2;

    public PianoCartesiano(Rettangolo rettangolo1, Rettangolo rettangolo2)
    {
        //this.rettangolo1 = new Rettangolo(rettangolo1);
        this.rettangolo2 = new Rettangolo(rettangolo2);
        this.rettangolo1=rettangolo1;
    }
}
