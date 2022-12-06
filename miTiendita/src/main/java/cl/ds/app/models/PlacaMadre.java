package cl.ds.app.models;

public class PlacaMadre {
    private String socket;
    private String chipset;
    private String memorias;
    private String formato;
    private String fabricante;

    public PlacaMadre() {
    }

    public PlacaMadre(String socket, String chipset, String memorias, String formato, String fabricante) {
        this.socket = socket;
        this.chipset = chipset;
        this.memorias = memorias;
        this.formato = formato;
        this.fabricante = fabricante;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getMemorias() {
        return memorias;
    }

    public void setMemorias(String memorias) {
        this.memorias = memorias;
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

    @Override
    public String toString() {
        return "PlacaMadre{" +
                "socket='" + socket + '\'' +
                ", chipset='" + chipset + '\'' +
                ", memorias='" + memorias + '\'' +
                ", formato='" + formato + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
