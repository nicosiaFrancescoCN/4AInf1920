package it.itis.cuneo;

class portaCd {

    private CD[] vett_CD;
    private static final int MAX_CD = 3;
    private int contaCd;

    public portaCd(CD[] vett_CD, int cntCd) {
        this.vett_CD = vett_CD;
        this.contaCd = cntCd;
    }

    public CD[] getVett_CD() {
        return vett_CD;
    }

    public static int getMaxCd() {
        return MAX_CD;
    }

    public int getCntCd() {
        return contaCd;
    }

    public void setVett_CD(CD[] vett_CD) {
        this.vett_CD = vett_CD;
    }

    public void setCntCd(int cntCd) {
        this.contaCd = cntCd;
    }

    public void killCd(){
        this.contaCd --;

        this.setVett_CD(null);
    }

    public int cercaCollezione(CD cd){

        boolean controllo = false;
        int i;

        for(i=0; i<MAX_CD; i++){
            if(vett_CD[i].equals(cd))
            {

            }
        }
        if(controllo == true)
        {
            i = -1;
        }

        return i;
    }
}


