package cl.ds.app.models;

public class FuentePoder {
    private String fabricante;
    private String potencia;
    private String certificacion;
    private String corriente;
    private String modular;
    private String rgb;

    public FuentePoder() {
    }

    public FuentePoder(String fabricante, String potencia, String certificacion, String corriente, String modular, String rgb) {
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.certificacion = certificacion;
        this.corriente = corriente;
        this.modular = modular;
        this.rgb = rgb;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getCertificacion() {
        return certificacion;
    }

    public void setCertificacion(String certificacion) {
        this.certificacion = certificacion;
    }

    public String getCorriente() {
        return corriente;
    }

    public void setCorriente(String corriente) {
        this.corriente = corriente;
    }

    public String getModular() {
        return modular;
    }

    public void setModular(String modular) {
        this.modular = modular;
    }

    public String getRgb() {
        return rgb;
    }

    public void setRgb(String rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return "FuentePoder{" +
                "fabricante='" + fabricante + '\'' +
                ", potencia='" + potencia + '\'' +
                ", certificacion='" + certificacion + '\'' +
                ", corriente='" + corriente + '\'' +
                ", modular='" + modular + '\'' +
                ", rgb='" + rgb + '\'' +
                '}';
    }
}
