import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FormPrenota extends JFrame implements ActionListener{
    JLabel Nome;
    JLabel Cognome;
    JLabel Telefono;
    JLabel Data;
    JLabel Destinazione;
    JLabel Partenza;

    JTextField tNome;
    JTextField tCognome;
    JTextField tTelefono;
    JTextField tData;
    JTextField tDestinazione;
    JTextField tPartenza;

    JButton Conferma;
    JButton Annulla;
    JButton Stampa;
    JButton Salva;

    private ArrayList<Prenotazioni> prenotazioni;
    public int conta = 0;
    public static final String FILE_PATH = "C:\\Users\\Ciccio\\IdeaProjects\\prenotazioni\\src\\Prenotazioni.java";

    public FormPrenota(){
        prenotazioni = new ArrayList<Prenotazioni>();
        setTitle("Prenota il biglietto");
        setSize(400, 300);
        setLocation(500, 200);
        setResizable(false);
        initComponents();
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponents() {
        JPanel finestra = new JPanel();
        finestra.setLayout(null);


        Nome = new JLabel("Nome: ");
        finestra.add(Nome);
        tNome = new JTextField();
        finestra.add(tNome);

        Cognome = new JLabel("Cognome: ");
        finestra.add(Cognome);
        tCognome = new JTextField();
        finestra.add(tCognome);

        Telefono = new JLabel("Telefono: ");
        finestra.add(Telefono);
        tTelefono = new JTextField();
        finestra.add(tTelefono);

        Data = new JLabel("Data: ");
        finestra.add(Data);
        tData = new JTextField();
        finestra.add(tData);

        Destinazione = new JLabel("Destinazione: ");
        finestra.add(Destinazione);
        tDestinazione = new JTextField();
        finestra.add(tDestinazione);

        Partenza = new JLabel("Partenza: ");
        finestra.add(Partenza);
        tPartenza = new JTextField();
        finestra.add(tPartenza);

        Nome.setBounds(60,50,60,15);
        Cognome.setBounds(60,30,60,15);
        Telefono.setBounds(60,70,60,15);
        Data.setBounds(60,130,60,15);
        Destinazione.setBounds(60,110,60,15);
        Partenza.setBounds(60,90,60,15);

        tNome.setBounds(135,50,200,20);
        tCognome.setBounds(135,30,200,20);
        tTelefono.setBounds(135,70,200,20);
        tData.setBounds(135,130,200,20);
        tDestinazione.setBounds(135,110,200,20);
        tPartenza.setBounds(135,90,200,20);

        JPanel bottoni = new JPanel();
        Conferma = new JButton("Conferma");
        bottoni.add(Conferma);
        Conferma.addActionListener(this);

        Annulla = new JButton("Annulla");
        bottoni.add(Annulla);
        Annulla.addActionListener(this);

        Salva = new JButton("Salva");
        bottoni.add(Salva);
        Salva.addActionListener(this);

        Stampa = new JButton("Stampa");
        bottoni.add(Stampa);
        Stampa.addActionListener(this);

        this.add(bottoni, BorderLayout.SOUTH);
        this.add(finestra, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == Conferma){
            Prenotazioni prenotazione = new Prenotazioni();
            salvaPrenotazione(prenotazione);
            prenotazioni.add(prenotazione);
            messaggio("Confermata la prenotazione");
        }
        if(actionEvent.getSource() == Annulla){
            messaggio("Annullata la prenotazione");
        }
        if(actionEvent.getSource() == Stampa){
            stampaSalvato();
        }
        if(actionEvent.getSource() == Salva){
            salvaCSV();
            reset();
        }
    }

    private void reset() {
        tNome.setText("");
        tCognome.setText("");
        tTelefono.setText("");
        tData.setText("");
        tDestinazione.setText("");
        tPartenza.setText("");
    }

    private void stampaSalvato(){
        JPanel mostra = new JPanel();
        String[] options = {"< back", "forward >"};
        String string = "";
        while(conta<prenotazioni.size()){
            string = "Prenotazione "+ (conta+1)+" " +prenotazioni.get(conta).toString();
            int x = JOptionPane.showOptionDialog(null, string, null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(x==0 && conta>0) {
                conta--;
            }
            if(x==1){
                conta++;
            }
            if(x== JOptionPane.CLOSED_OPTION){
                return;
            }
        }
    }

    public void salvaPrenotazione(Prenotazioni prenotazioni){
        prenotazioni.setNome(tNome.getText());
        prenotazioni.setCognome(tCognome.getText());
        prenotazioni.setTelefono(tTelefono.getText());
        prenotazioni.setData(tData.getText());
        prenotazioni.setDestinazione(tDestinazione.getText());
        prenotazioni.setPartenza(tPartenza.getText());
    }

    private void messaggio(String string){
        JOptionPane.showMessageDialog(this, string);
        reset();
    }

    public void salvaCSV(){
        BufferedWriter bw;
        try {
            bw= new BufferedWriter(new FileWriter(FILE_PATH, true));
            for(int contaPrenotazioni=0; contaPrenotazioni<prenotazioni.size(); contaPrenotazioni++)
            {
                Prenotazioni pren = prenotazioni.get(contaPrenotazioni);
                System.out.println(pren.toString());
                bw.write(pren.toRowCSV());
                System.out.println("Saved\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FormPrenota formPrenota = new FormPrenota();
    }

    @Override
    public String toString() {
        return "FormPrenota{" +
                "prenotazioni =" + prenotazioni +
                '}';
    }
}
