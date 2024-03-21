package AlgoritmoKNN;

public class DataPoint {
    private double calorias;
    private double horas;
    private String estado;

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public DataPoint(double horas, double calorias) {
        this.horas = horas;
        this.calorias = calorias;
    }

    public DataPoint(double horas, double calorias, String estado) {
        this.horas = horas;
        this.calorias = calorias;
        this.estado = estado;
    }

    public double getCalorias() {
        return calorias;
    }

    public double getHoras() {
        return horas;
    }

    public String getEstado() {
        return estado;
    }
}
