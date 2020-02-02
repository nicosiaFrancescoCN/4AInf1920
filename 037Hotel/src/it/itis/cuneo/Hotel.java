package it.itis.cuneo;

import jdk.vm.ci.hotspot.HotSpotVMEventListener;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Hotel {

    public static final String FILE_NAME_XML = "C:\\Users\\Ciccio\\IdeaProjects\\37_HotelXMLCSV\\src\\it\\itis\\cuneo\\hotel.xml";
    public static final String FILE_NAME_CSV = "C:\\Users\\Ciccio\\IdeaProjects\\37_HotelXMLCSV\\src\\it\\itis\\cuneo\\hotel.txt";
    public static final String SEPARATOR = ",";

    private String nomeHotel;
    private List<Camera> hotel;


    public Hotel() {
    }

    public Hotel(String nomeHotel, List<Camera> hotel) {
        this.nomeHotel = nomeHotel;
        this.hotel = new ArrayList<Camera>();
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    @XmlAttribute
    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public List<Camera> getHotel() {
        return hotel;
    }

    @XmlElement(name = "camera")
    public void setHotel(List<Camera> hotel) {
        this.hotel = hotel;
    }

    public void marshallingXml(){
        try {
            File file = new File(FILE_NAME_XML);
            JAXBContext jaxbContext = JAXBContext.newInstance(Hotel.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    public void unmarshallingXml() {
        try {
            File file = new File(FILE_NAME_XML);
            JAXBContext jaxbContext = JAXBContext.newInstance(Hotel.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Hotel hotel = (Hotel) jaxbUnmarshaller.unmarshal(file);
            System.out.println(hotel);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    public void aggiungiCamera(Camera camera){
        hotel.add(camera);
    }

    public String toRowCSV() {
        return "Hotel" + Hotel.SEPARATOR + nomeHotel + Hotel.SEPARATOR + hotel + "\n";
    }

    public void salvaCSV() {
        String str ="";
        BufferedWriter bw;
        try {
            bw= new BufferedWriter(new FileWriter(FILE_NAME_CSV));

            for(int cntHotel=0; cntHotel<this.hotel.size(); cntHotel++)
            {
               Camera hotel1 = this.hotel.get(cntHotel);
                bw.write(hotel1.toRowCSV());

                for(int cntCamera=0; cntCamera<hotel.size(); cntCamera++) {
                    Camera camera = Hotel.getHotel().get(cntCamera);
                    bw.write(camera.toRowCsv());
                }
            }

            //obbligatorio oppure il file rimane vuoto
            //forza lo svuotamento del buffer nel file, dopo di che lo chiude
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void apriCSV() {
        BufferedReader br;
        String rowLine;
        Camera camera= null;

        try {
            br = new BufferedReader(new FileReader(FILE_NAME_CSV));

            while((rowLine = br.readLine()) != null) {
                String[] campi = rowLine.split(Hotel.SEPARATOR);
                if(campi[0].equalsIgnoreCase("Cliente")) {
                    camera = new Camera(campi[1], campi[2], campi[3]);
                    this.aggiungiCamera(camera);
                }
                if(campi[0].equalsIgnoreCase("Articolo")) {
                    //public Articolo(String codice, String descrizione, double importoSenzaIVA, int scontoPercentuale, int quantita)
                    CAmera articolo = new Camera(campi[1], campi[2], Double.parseDouble(campi[3]),
                            Integer.parseInt(campi[4]), Integer.parseInt(campi[5]));
                    hotel.aggiungiCamera(camera);
                }

            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }


}
