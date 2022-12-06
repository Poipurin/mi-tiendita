package cl.ds.app.models;

public class Procesador {
    private String frecuencia;
    private String nucleos;
    private String socket;
    private String cache;
    private String arquitectura;

    public Procesador() {
    }

    public Procesador(String frecuencia, String nucleos, String socket, String cache, String arquitectura) {
        this.frecuencia = frecuencia;
        this.nucleos = nucleos;
        this.socket = socket;
        this.cache = cache;
        this.arquitectura = arquitectura;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getNucleos() {
        return nucleos;
    }

    public void setNucleos(String nucleos) {
        this.nucleos = nucleos;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getArquitectura() {
        return arquitectura;
    }

    public void setArquitectura(String arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "frecuencia='" + frecuencia + '\'' +
                ", nucleos='" + nucleos + '\'' +
                ", socket='" + socket + '\'' +
                ", cache='" + cache + '\'' +
                ", arquitectura='" + arquitectura + '\'' +
                '}';
    }
}
