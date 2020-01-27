public class Vettore {
    Punto origine;
    Punto vertice;

    public Vettore(Punto origine, Punto vertice)
    {
        this.origine = origine;
        this.vertice = vertice;
    }

    public Vettore()
    {
        super();
    }

    public Punto getOrigine() {
        return origine;
    }

    public void setOrigine(Punto origine) {
        this.origine = origine;
    }

    public Punto getVertice() {
        return vertice;
    }

    public void setVertice(Punto vertice) {
        this.vertice = vertice;
    }


    public boolean equals(Vettore vettore) {
        boolean uguale = false;

        if((this.origine == vettore.getOrigine()) && (this.vertice == vettore.getVertice()))
        {
            uguale = true;
        }

        return uguale;
    }

    @Override
    public String toString() {
        return "{ il vertice contiene: \"origine\":" + origine + "," + "\"vertice\":" + vertice + "}";
    }

}
