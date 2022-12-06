package cl.ds.app.models;

public class CoolerCpu {
    private String fabricante;
    private String tipo;
    private String peso;
    private String rpm;
    private String ruido;
    private String flujoDeAire;
    private String altura;
    private String rgb;

    public CoolerCpu() {
    }

    public CoolerCpu(String fabricante, String tipo, String peso, String rpm, String ruido, String flujoDeAire, String altura, String rgb) {
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.peso = peso;
        this.rpm = rpm;
        this.ruido = ruido;
        this.flujoDeAire = flujoDeAire;
        this.altura = altura;
        this.rgb = rgb;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
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

    public String getFlujoDeAire() {
        return flujoDeAire;
    }

    public void setFlujoDeAire(String flujoDeAire) {
        this.flujoDeAire = flujoDeAire;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getRgb() {
        return rgb;
    }

    public void setRgb(String rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return "CoolerCpu{" +
                "fabricante='" + fabricante + '\'' +
                ", tipo='" + tipo + '\'' +
                ", peso='" + peso + '\'' +
                ", rpm='" + rpm + '\'' +
                ", ruido='" + ruido + '\'' +
                ", flujoDeAire='" + flujoDeAire + '\'' +
                ", altura='" + altura + '\'' +
                ", rgb='" + rgb + '\'' +
                '}';
    }
}
