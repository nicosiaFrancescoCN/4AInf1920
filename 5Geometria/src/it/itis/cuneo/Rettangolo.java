 package it.itis.cuneo;

/**
 * Created by inf.perettim1004 on 07/10/2019.
 */
public class Rettangolo {
    Segmento segmentoAlto;
    Segmento segmentoDestro;
    Segmento segmentoSinistro;
    Segmento segmentoBasso;

    public Rettangolo(Segmento segmentoAlto, Segmento segmentoDestro, Segmento segmentoSinistro , Segmento segmentoBasso)
    {
        this.segmentoAlto = new Segmento(segmentoAlto);
        this.segmentoDestro = new Segmento(segmentoDestro);
        this.segmentoSinistro = new Segmento(segmentoSinistro);
        this.segmentoBasso = new Segmento(segmentoBasso);
    }

    public Rettangolo(Rettangolo rettangolo)
    {
        //i this si possono mettere e non mettere
        /*this.*/segmentoAlto = new Segmento(rettangolo.getSegmentoAlto());
        /*this.*/segmentoDestro = new Segmento(rettangolo.getSegmentoDestro());
        /*this.*/segmentoSinistro = new Segmento(rettangolo.getSegmentoSinistro());
        /*this.*/segmentoBasso = new Segmento(rettangolo.getSegmentoBasso());

    }
    public Segmento getSegmentoAlto()
    {
        return segmentoAlto;
    }

    public Segmento getSegmentoDestro()
    {
        return segmentoDestro;
    }

    public Segmento getSegmentoSinistro()
    {
        return segmentoSinistro;
    }

    public Segmento getSegmentoBasso()
    {
        return segmentoBasso;
    }

    public void setSegmentoAlto(Segmento segmentoAlto)
    {
        this.segmentoAlto = segmentoAlto;
    }

    public void setSegmentoDestro(Segmento segmentoDestro)
    {
        this.segmentoDestro = segmentoDestro;
    }

    public void setSegmentoSinistro(Segmento segmentoSinistro)
    {
        this.segmentoSinistro =segmentoSinistro;
    }

    public void setSegmentoBasso(Segmento segmentoBasso)
    {
        this.segmentoBasso = segmentoBasso;
    }

    public String toString()
    {
        return "Segmenti --> \" segmentoAlto\"" + segmentoAlto + "\"segmentoBasso\"" + segmentoBasso + "\" segmentoDestro\"" + segmentoDestro + "\"segmentoSinistro\"" + segmentoSinistro + "}";
    }

}
