package cl.ds.app.models;

public class Gpu {
    private String modelo;
    private String memoria;
    private String frecuenciaCore;
    private String frecuenciaMemorias;
    private String bus;
    private String fabricante;

    public Gpu() {
    }

    public Gpu(String modelo, String memoria, String frecuenciaCore, String frecuenciaMemorias, String bus, String fabricante) {
        this.modelo = modelo;
        this.memoria = memoria;
        this.frecuenciaCore = frecuenciaCore;
        this.frecuenciaMemorias = frecuenciaMemorias;
        this.bus = bus;
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getFrecuenciaCore() {
        return frecuenciaCore;
    }

    public void setFrecuenciaCore(String frecuenciaCore) {
        this.frecuenciaCore = frecuenciaCore;
    }

    public String getFrecuenciaMemorias() {
        return frecuenciaMemorias;
    }

    public void setFrecuenciaMemorias(String frecuenciaMemorias) {
        this.frecuenciaMemorias = frecuenciaMemorias;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Gpu{" +
                "modelo='" + modelo + '\'' +
                ", memoria='" + memoria + '\'' +
                ", frecuenciaCore='" + frecuenciaCore + '\'' +
                ", frecuenciaMemorias='" + frecuenciaMemorias + '\'' +
                ", bus='" + bus + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
