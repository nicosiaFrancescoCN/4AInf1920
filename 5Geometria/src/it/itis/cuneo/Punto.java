package it.itis.cuneo;

import javax.sound.midi.SysexMessage;

/**
 * Created by inf.perettim1004 on 07/10/2019.
 */
public class Punto {
    //attributi

    private int x;
    private int y;

    //metodi

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto p) {
        x = p.getX();
        y = p.getY();
    }

    public int getX ()
    {
        return x;
    }

    public int getY ()
    {
        return y;
    }

    public void setX (int x)
    {
        this.x = x;
    }

    public void setY (int y)
    {
        this.y = y;
    }

    public String toString()
    {
        return "Punto --> {\" x\": " + x + "," + "\"y\" : " + y + "}";
    }

    public Punto()
    {
        super();
    }

    public static void main(String[] args)
    {
        //PuntoA e PuntoB referenziano
        // due aree di momoria diverse
        Punto puntoA = new Punto(4, 6);
        //puntoB è una copia di puntoA per lo stato, ma fisicamentoe sono in due aree di memoria diversere
        Punto puntoB = new Punto(puntoA);

        //puntoC e PuntoA referenziano
        //la stessa area di memoria
        Punto puntoC = puntoA;

        Punto puntoD = new Punto();
        System.out.println(puntoD.toString());

        Punto puntoE = null;
        //se non si inizializza un oggetto ho un null pointer
        puntoE = new Punto();

        System.out.println(puntoE.toString());
    }

}
