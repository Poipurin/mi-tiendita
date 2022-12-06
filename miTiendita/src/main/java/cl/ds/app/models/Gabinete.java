package cl.ds.app.models;

public class Gabinete {
    private String formato;
    private String fabricante;
    private String ubicacionFuente;
    private String panelLateral;
    private String ventiladores;
    private String rgb;

    public Gabinete() {
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getUbicacionFuente() {
        return ubicacionFuente;
    }

    public void setUbicacionFuente(String ubicacionFuente) {
        this.ubicacionFuente = ubicacionFuente;
    }

    public String getPanelLateral() {
        return panelLateral;
    }

    public void setPanelLateral(String panelLateral) {
        this.panelLateral = panelLateral;
    }

    public String getVentiladores() {
        return ventiladores;
    }

    public void setVentiladores(String ventiladores) {
        this.ventiladores = ventiladores;
    }

    public String getRgb() {
        return rgb;
    }

    public void setRgb(String rgb) {
        this.rgb = rgb;
    }

    public Gabinete(String formato, String fabricante, String ubicacionFuente, String panelLateral, String ventiladores, String rgb) {
        this.formato = formato;
        this.fabricante = fabricante;
        this.ubicacionFuente = ubicacionFuente;
        this.panelLateral = panelLateral;
        this.ventiladores = ventiladores;
        this.rgb = rgb;


    }

    @Override
    public String toString() {
        return "Gabinete{" +
                "formato='" + formato + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", ubicacionFuente='" + ubicacionFuente + '\'' +
                ", panelLateral='" + panelLateral + '\'' +
                ", ventiladores='" + ventiladores + '\'' +
                ", rgb='" + rgb + '\'' +
                '}';
    }
}
