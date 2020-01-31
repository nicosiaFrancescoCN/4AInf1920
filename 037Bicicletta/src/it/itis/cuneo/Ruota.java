package it.itis.cuneo;

import javax.xml.bind.annotation.XmlElement;
import java.util.Objects;

public class Ruota {
    private String Ruota1;
    private String Ruota2;

    public Ruota(String ruota1, String ruota2) {
        super();
        this.Ruota1 = ruota1;
        this.Ruota2 = ruota2;
    }

    public String getRuota1() {
        return Ruota1;
    }

    @XmlElement(name="ruota")
    public void setRuota1(String ruota1) {
        this.Ruota1 = ruota1;
    }

    public String getRuota2() {
        return Ruota2;
    }

    @XmlElement(name="ruota")
    public void setRuota2(String ruota2) {
        this.Ruota2 = ruota2;
    }

    @Override
    public String toString() {
        return "Ruota{" +
                "ruota1='" + Ruota1 + '\'' +
                ", ruota2='" + Ruota2 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ruota ruota = (Ruota) o;
        return Objects.equals(Ruota1, ruota.Ruota1) &&
                Objects.equals(Ruota2, ruota.Ruota2);
    }

    public String toXml() {
        return "\t<ruote\">" +
                "\t\t<ruota>" + Ruota1 + "</ruota>\n" +
                "\t\t<ruota>" + Ruota2 + "</ruota>\n"+
                "\t</ruote>\n";
    }
}
