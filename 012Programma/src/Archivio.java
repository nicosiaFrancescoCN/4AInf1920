import java.util.Arrays;

/**
 * Created by inf.nicosiaf1509  on 13/11/2019.
 */
public class Archivio {

    public static final int MAX_PROGRAMMI = 10;
    private int contaProgrammi = 0;
    private Programma[] vProgrammi;
    private int nProgrammi;


    public Archivio() {
        contaProgrammi = 0;
        nProgrammi = MAX_PROGRAMMI;
        vProgrammi = new Programma[MAX_PROGRAMMI];
    }

    public Archivio(int nProgrammi) throws ArchivioPieno{
        if(nProgrammi>MAX_PROGRAMMI){
            throw new ArchivioPieno(1,"limite massimo superato");
        }
        contaProgrammi = 0;
        this.nProgrammi = nProgrammi;
        vProgrammi = new Programma[MAX_PROGRAMMI];
    }

    public Programma getProgramma(int posizione){
        Programma programma = null;
        if(posizione>0 && posizione< nProgrammi)
            programma = this.vProgrammi[posizione];
        return programma;

    }

    public int setProgramma(Programma programma,int posizione){
        int esito = 0;
        if(posizione>0 && posizione<nProgrammi) {
            if(this.vProgrammi[posizione]==null){
                this.contaProgrammi++;
                this.vProgrammi[posizione] = programma;
                esito = posizione;
            }
            else{
                esito = -1;
            }

        }
        return esito;
    }

    public void killProgramma(int posizione){
        if(posizione>0 && posizione <nProgrammi) {
            this.vProgrammi[posizione] = null;
            this.contaProgrammi--;
        }
    }

    public int getN(){
        return this.nProgrammi;
    }

    public Programma cercaProgrammaPerDenominazione(String denominazione){
        Programma programma = null;
        boolean btrovato = false;
        for(int contaProgramma=0; contaProgramma<this.nProgrammi && !btrovato; contaProgramma++){
            programma = this. vProgrammi[contaProgramma];
            if(programma!=null && denominazione.equalsIgnoreCase(programma.getDenominazione())){
             btrovato = true;
            }
        }
        return programma;
    }

    @Override
    public String toString() {
        return "Archivio{" +
                "contaProgrammi=" + contaProgrammi +
                ", vProgrammi=" + Arrays.toString(vProgrammi) +
                ", nProgrammi=" + nProgrammi +
                '}';
    }

    public boolean equals(Archivio archivio){
        boolean uguali = true;

        if(this.nProgrammi == archivio.getN()){
            for(int contaProgrammi = 0; contaProgrammi< this.nProgrammi && !uguali; contaProgrammi++){

                Programma programmaInterno = this.getProgramma(contaProgrammi);
                Programma programmaEsterno = archivio.getProgramma(contaProgrammi);

                if(!programmaInterno.equals(programmaEsterno)){
                    uguali = false;
                }
            }
        }

        else{
            uguali = false;
        }


        return uguali;
    }


    public int confrontaContenitore(Archivio archivio){
        int contaProgrammiUguali = 0;

        for(int cntProgrammi1 = 0; cntProgrammi1 < this.nProgrammi; cntProgrammi1 ++){
            for(int cntProgrammi2 = 0; cntProgrammi2 < this.nProgrammi; cntProgrammi2 ++) {
                Programma programmaInterno = this.getProgramma(cntProgrammi1);
                Programma programmaEsterno = archivio.getProgramma(cntProgrammi2);
                if(programmaInterno.equals(programmaEsterno)){
                    contaProgrammiUguali ++;
                }
            }

        }

        return contaProgrammiUguali;
    }

    public void caricaArchivio(){
        this.nProgrammi = InputOutputUtility.leggiNumero("Quanti programmi per l'archivio: ");

        for(int cntProgrammi = 0;cntProgrammi < nProgrammi; cntProgrammi++){
            Programma programma = new Programma();
            programma.caricaProgramma();
            this.setProgramma(programma, cntProgrammi);
        }
    }

    public void stampaMenu(){
        String menu = "0: esci \n" + "1: carica archivio\n" + "2: elimina programma\n" + "3: ricerca programma" + "4: stampa archivio";
        System.out.println();
    }

    public void simulaArchivio(){
        Programma programma1 = new Programma("Office", 2010, "Microsoft", 10, 1, "Windows");
    }
    public static void main(String[] args) {


        Archivio archivio = new Archivio();
        boolean esci = false;
        int sceltaMenu = -1;

        while(!esci){
            archivio.stampaMenu();
            sceltaMenu = InputOutputUtility.leggiNumero("Inserisci la scelta: ");
            switch (sceltaMenu){
                case 0: esci = true;
                    break;
                case 1: archivio.caricaArchivio();
                    break;
                case 2: int posDeleteProg = InputOutputUtility.leggiNumero("Inserisci la posizione da eliminare: ");
                        archivio.killProgramma(posDeleteProg);
                    break;
                case 3: String denominazione = InputOutputUtility.leggiNome("Inserisci denominazione");
                        Programma programma = archivio.cercaProgrammaPerDenominazione(denominazione);
                    System.out.println(programma);
                    break;
            }
        }
    }
}
