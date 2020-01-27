package it.itis.cuneo;

/**
 * Created by inf.perettim1004 on 07/10/2019.
 */
public class Segmento {
    //attributi

   private  Punto punto1;
   private  String nome;
   private Punto punto2;

    /*public Segmento (Punto punto1, Punto punto2)
    {
        this.punto1 = punto1;
        this.punto2 = punto2;

    }*/

    /*public Segmento (Punto punto1, Punto punto2)
    {
        this.punto1 = new Punto(punto1.getX(), punto1.getY());
        this.punto2 = new Punto(punto2.getX(), punto2.getY());

    }*/


    public Segmento (Punto punto1, Punto punto2, String nome) // questo metodo è uguale a quelo sopra
    {
        this.punto1 = new Punto(punto1);
        this.punto2 = new Punto(punto2);
        this.nome = nome;

    }

    public Segmento(Segmento segmento)
    {
        this.punto1 = new Punto(segmento.getPunto1());
        this.punto2 = new Punto(segmento.getPunto2());
    }

    public String getn(){
        return this.nome;
    }

    public void setN(String nome1){
        this.nome = nome1;
    }

    public Punto getPunto1()
    {
        return punto1;
    }

    public Punto getPunto2()
    {
        return punto2;
    }

    public void setPunto1(Punto punto1)
    {
        this.punto1 = punto1;
    }

    public void setPunto2(Punto punto2)
    {
        this.punto2 = new Punto (punto2);
        //this.punto2 = punto2; in questo caso se deferenzio il parametro perdo l'attributo
    }
}
