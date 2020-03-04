import java.util.List;

public class Prenotazioni {

    private String Nome;
    private String Cognome;
    private String Telefono;
    private String Data;
    private String Destinazione;
    private String Partenza;
    public static final String SEPARATOR = ",";

    public Prenotazioni(){
        super();
    }

    public Prenotazioni(String nome, String cognome, String telefono, String data, String destinazione, String partenza) {
        Nome = nome;
        Cognome = cognome;
        Telefono = telefono;
        Data = data;
        Destinazione = destinazione;
        Partenza = partenza;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getDestinazione() {
        return Destinazione;
    }

    public void setDestinazione(String destinazione) {
        Destinazione = destinazione;
    }

    public String getPartenza() {
        return Partenza;
    }

    public void setPartenza(String partenza) {
        Partenza = partenza;
    }

    @Override
    public String toString() {
        return "Prenotazioni{" +
                "Nome='" + Nome + '\'' +
                ", Cognome='" + Cognome + '\'' +
                ", Telefono='" + Telefono + '\'' +
                ", Data='" + Data + '\'' +
                ", Destinazione='" + Destinazione + '\'' +
                ", Partenza='" + Partenza + '\'' +
                '}';
    }

    public String toRowCSV(){
        return Nome + SEPARATOR +
                Cognome + SEPARATOR +
                Telefono + SEPARATOR +
                Data + SEPARATOR +
                Destinazione + SEPARATOR +
                Partenza + '\n';
    }
}

