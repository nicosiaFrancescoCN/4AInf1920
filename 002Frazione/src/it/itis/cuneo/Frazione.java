package it.itis.cuneo;

public class Frazione {
    //attributi
    int numeratore;
    int denominatore;
}

public int getNumeratore()
{
    return numeratore;
}

public void setNumeratore(int numeratore)
{
    this.numeratore = numeratore;
}

    public int getDenominatore()
    {
        return denominatore;
    }

    public void setDenominatore(int denominatore)
    {
        this.denominatore = denominatore;
    }

public Frazione sommaFraz(Frazione frazione1)
{
    //variabili
    Frazione frazioneRes;
    frazioneRes = new Frazione();
    int numeratore;
    int denominatore;

    numeratore = frazione1.getNumeratore();
    denominatore = frazione1.getDenominatore();

    frazioneRes.setNumeratore(this.numeratore * denominatore + numeratore* this.denominatore);
    frazioneRes.setDenominatore(this.denominatore * denominatore);

    return frazioneRes;
}

public Frazione sottraFraz(Frazione frazione1)
{
    //variabili
    Frazione frazioneRes;
    frazioneRes = new Frazione();
    int numeratore;
    int denominatore;

    numeratore = frazione1.getNumeratore();
    denominatore = frazione1.getDenominatore();

    frazioneRes.setNumeratore(this.numeratore * denominatore - numeratore* this.denominatore);
    frazioneRes.setDenominatore(this.denominatore * denominatore);

    return frazioneRes;
}

public Frazione multiFraz(Frazione frazione1)
{
    //variabili
    Frazione frazioneRes;
    frazioneRes = new Frazione();
    int numeratore;
    int denominatore;

    numeratore = frazione1.getNumeratore();
    denominatore = frazione1.getDenominatore();

    frazioneRes.setNumeratore(this.numeratore * numeratore);
    frazioneRes.setDenominatore(this.denominatore * denominatore);

    return frazioneRes;
}

public Frazione multiFraz(Frazione frazione1)
{
    //variabili
    Frazione frazioneRes;
    frazioneRes = new Frazione();
    int numeratore;
    int denominatore;

    numeratore = frazione1.getNumeratore();
    denominatore = frazione1.getDenominatore();

    frazioneRes.setNumeratore(this.numeratore * denominatore);
    frazioneRes.setDenominatore(this.denominatore * numeratore);

    return frazioneRes;
}
