package cl.ds.app.models;

public class Ventiladores {
    private String fabricante;
    private String rgb;
    private String flujoAire;
    private String rpm;
    private String ruido;
    private String tamano;

    public Ventiladores() {
    }

    public Ventiladores(String fabricante, String rgb, String flujoAire, String rpm, String ruido, String tamano) {
        this.fabricante = fabricante;
        this.rgb = rgb;
        this.flujoAire = flujoAire;
        this.rpm = rpm;
        this.ruido = ruido;
        this.tamano = tamano;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getRgb() {
        return rgb;
    }

    public void setRgb(String rgb) {
        this.rgb = rgb;
    }

    public String getFlujoAire() {
        return flujoAire;
    }

    public void setFlujoAire(String flujoAire) {
        this.flujoAire = flujoAire;
    }

    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }

    public String getRuido() {
        return ruido;
    }

    public void setRuido(String ruido) {
        this.ruido = ruido;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Ventiladores{" +
                "fabricante='" + fabricante + '\'' +
                ", rgb='" + rgb + '\'' +
                ", flujoAire='" + flujoAire + '\'' +
                ", rpm='" + rpm + '\'' +
                ", ruido='" + ruido + '\'' +
                ", tamano='" + tamano + '\'' +
                '}';
    }
}
