package AlgoritmoKNN;

public class AuxiliarDistancia {
    private double distancia;
    private int posicao;
    private String estado;

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getPosicao() {
        return posicao;
    }

    public String getEstado() {
        return estado;
    }
}
