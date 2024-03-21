package AlgoritmoKNN;

import java.util.Arrays;
import java.util.Comparator;

public class Knn {
    private Dataset dataset;
    private int k;

    public Knn(Dataset dataset, int k) {
        this.dataset = dataset;
        this.k = k;
    }

    public String classify(DataPoint attributes) {
        AuxiliarDistancia[] auxiliarDistancias = new AuxiliarDistancia[this.dataset.getLenght()];
        int contador = 0;
        for (DataPoint dados : this.dataset.getDataPoints()) {
            double distancia = Math.sqrt(Math.pow((Math.abs(dados.getCalorias() / 3000.0) - (attributes.getCalorias() / 3000.0)), 2)
                    + Math.pow((Math.abs(dados.getHoras() / 10.0) - (attributes.getHoras() / 10.0)), 2));
            auxiliarDistancias[contador].setPosicao(contador);
            auxiliarDistancias[contador].setDistancia(distancia);
            auxiliarDistancias[contador].setEstado(dados.getEstado());
            System.out.println(auxiliarDistancias[contador]);
            Arrays.stream(auxiliarDistancias).sorted(Comparator.comparingDouble(AuxiliarDistancia::getDistancia));
            contador++;
        }
        int contadorFeliz = 0;
        int contadorInfeliz = 0;
        for (int i = 0; i <= this.k; i++) {
            if (auxiliarDistancias[i].getEstado() == "Feliz") {
                contadorFeliz++;
            } else {
                contadorInfeliz++;
            }
        }
        String classificacao;
        if (contadorFeliz > contadorInfeliz) {
            classificacao = "Feliz";
        } else {
            classificacao = "Infeliz";
        }
        return classificacao;
        // Implementação do algoritmo K-NN para classificação
        // Retorna a classe prevista para o ponto de dados fornecido
    }
    public String determineHappiness(double hoursOfSleep, double calories) {
        return classify(new DataPoint(hoursOfSleep, calories));
    }
}