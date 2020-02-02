package it.itis.cuneo;

import javax.xml.bind.annotation.XmlElement;


public class Camera {

    private String nomeCamera;
    private int Letti;
    private Boolean Bagno;
    private String Vista;

    public Camera() {

    }

    public Camera(String nomeCamera, int Letti, Boolean bagno, String vista) {
        this.nomeCamera = nomeCamera;
        this.Letti = Letti;
        this.Bagno = bagno;
        this.Vista = vista;
    }

    public String getNomeCamera() {
        return nomeCamera;
    }

    @XmlElement
    public void setNomeCamera(String nomeCamera) {
        this.nomeCamera = nomeCamera;
    }

    public int getLetti() {
        return Letti;
    }

    @XmlElement
    public void setLetti(int letti) {
        this.Letti = letti;
    }

    public Boolean getBagno() {
        return Bagno;
    }

    @XmlElement
    public void setBagno(Boolean bagno) {
        this.Bagno = bagno;
    }

    public String getVista() {
        return Vista;
    }

    @XmlElement
    public void setVista(String vista) {
        this.Vista = vista;
    }

    public String toRowCSV() {
        return "Camera" + Hotel.SEPARATOR + nomeCamera + Hotel.SEPARATOR + Letti + Hotel.SEPARATOR + Bagno + Hotel.SEPARATOR
        + Vista + "\n";
    }


}
