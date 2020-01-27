package it.itis.cuneo;

/**
 * Created by inf.perettim1004 on 21/09/2019.
 */
public class NUmero {
    //attributi

    private int valore;

    //metodi
    public NUmero(int valore)
    {
        this.valore = valore;
    }

    public void setValore(int valore)
    {
     this.valore = valore;
    }

    public int getValore()
    {
        return this.valore; //esplicito e' meglio che inplicito

    }

    public static void main(String args[])
    {
        //dichiarazione delle variabili
        int x;
        NUmero numero = new NUmero(5);



        x = numero.getValore();

        System.out.println(x);

    }

}
