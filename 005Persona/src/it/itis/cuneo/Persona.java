package it.itis.cuneo;

public class Persona {
    String nome;
    String sesso;
    String professione;
    String eta;

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setSesso(String sesso)
    {
        this.sesso = sesso;
    }

    public void setProfessione(String professione)
    {
        this.professione = professione;
    }

    public void setEta(String eta)
    {
        this.eta = eta;
    }

    public String getNome()
    {
        return nome;
    }

    public String getSesso()
    {
        return sesso;
    }

    public String getProfessione()
    {
        return professione;
    }

    public String getEta()
    {
        return eta;
    }

    public Persona(String nome, String sesso, String professione, String eta)
    {
        super();
    }

    public String chiSei()
    {
        String elementi = new String("sono una persona di nome:" +this.nome +"," + "sesso:" +this.sesso +"," + "eta`" +this.eta + "," + "professione:" +this.professione);

        return elementi;
    }

    public static void main(String[] args)
    {
        String stato;
        Persona essere = new Persona("Marco", "maschio", "alunno", "18");

        stato = essere.chiSei();

        System.out.println(stato);
    }
}
