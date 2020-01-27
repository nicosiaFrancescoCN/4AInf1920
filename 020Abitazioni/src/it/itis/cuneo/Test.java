package it.itis.cuneo;

/**
 * Created by inf.nicosiaf1509 on 20/11/2019.
 */
public class Test {


    public static void main(String[] args) {
        Abitazione abitazione = new Abitazione();
        abitazione.setCittà("Torino");
        abitazione.setIndirizzo("C.so Pioppi, 2");
        abitazione.setnStanze(4);
        abitazione.setSuperficie(2000);
        abitazione.toString();

        //public Abitazione(String città, int nStanze, double superficie, String indirizzo)
        Abitazione abitazione2 =
                new Abitazione("Torino", 4, 2000, "C.so Pioppi, 2");

        Appartamento appartamento = new Appartamento();
        Villa villa = new Villa();
    }

}
