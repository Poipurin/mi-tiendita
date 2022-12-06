package cl.ds.app.models;

public class Ram {
    private String capacidad;
    private String tipo;
    private String frecuencia;
    private String formato;
    private String fabricante;
    private String voltaje;
    private String rgb;

    public Ram() {
    }

    public Ram(String capacidad, String tipo, String frecuencia, String formato, String fabricante, String voltaje, String rgb) {
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.frecuencia = frecuencia;
        this.formato = formato;
        this.fabricante = fabricante;
        this.voltaje = voltaje;
        this.rgb = rgb;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
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

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    public String getRgb() {
        return rgb;
    }

    public void setRgb(String rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "capacidad='" + capacidad + '\'' +
                ", tipo='" + tipo + '\'' +
                ", frecuencia='" + frecuencia + '\'' +
                ", formato='" + formato + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", voltaje='" + voltaje + '\'' +
                ", rgb='" + rgb + '\'' +
                '}';
    }
}
