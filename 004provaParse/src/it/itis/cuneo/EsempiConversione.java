package it.itis.cuneo;

/**
 * Created by inf.naccaratom0711 on 30/09/2019.
 */
public class EsempiConversione {

    //esempio conversioni tra wrapper, partendo da un primitivo
    public static void main(String[] args) {
        //float : è un tipo primitivo, cioè una variabile semplice ;; NON HA METODI
        //Float : è una classe wrapper (contiene un primitivo dello stesso tipo e i metodi che permettono di lavorarci sopra)

        Float f; //classe
        f = new Float(0.52d/*primitivo*/);
        /* System.out.println(String s);
            la firma del metodo sopra richiede una stringa come parametro,
              quindi il float viene convertito in una stringa al momento della chiamata

         */
        /* System.out.println(float fPrimitivo);    ;;; conversione "automatica" / cast implicito
            nel caso della firma sopra passiamo un Float wrapper,
              ma il metodo si aspetta un float primitivo --> avviene un cast implicito

         */

        //firma del metodo : nome del metodo e i tipi degli attributi nell'ordine considerato

        System.out.println(f);

        int n;
        n = Integer.parseInt("6");
        System.out.println(n);

        String quanteMele = "8";
        n = Integer.parseInt(quanteMele);
        System.out.println(n);

        int n2 = 7;
        Integer ogI;
        ogI = new Integer(n2);

        int n3 = 9;
        Float ogF;
        ogF = new Float(n3);

        String s = "5.25f";
        Float ogF2;
        ogF2 = Float.parseFloat(s);

        String s2;
        s2 = "" + ogF;
        System.out.println("s2 = \"\" + ogF: " + s2);

        s2 = ogF.toString();
        System.out.println("s2 = ogF.toString(): " + s2);


        //castare un double primitivo in un intero wrapper (Integer)
        double dN = 6.5d;   //la d serve per definire il tipo della costante
        int intN = (int) dN; //intN = 6
        Integer iN = new Integer(intN);
        iN = intN;  //trasforma un wrapper in un primitivo (dello stesso tipo)


    }
}

