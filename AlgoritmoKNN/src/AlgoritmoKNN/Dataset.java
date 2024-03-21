package AlgoritmoKNN;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

import static java.lang.Double.*;

public class Dataset {
    private String conteudoArquivo;
    public static final int MAXIMO_DATAPOINTS = 100;
    private DataPoint[] baseDeDados = new DataPoint[MAXIMO_DATAPOINTS];

    public DataPoint[] getDataPoints() {
        String[] linhas = conteudoArquivo.split("\n");
        for (int i = 1; i < linhas.length; i++) {
            String[] colunas = linhas[i].split(";");
            double calorias = parseDouble(colunas[0].replace(",", "."));
            double horasSono = parseDouble(colunas[1].replace(",", "."));
            String estado = colunas[2];
            baseDeDados[i] = new DataPoint(calorias, horasSono, estado);
        }
        return baseDeDados;
        // retorna o vetor com os dados carregados
    }

    public int getLenght() {
        int quantidadeDePontosCarregados = conteudoArquivo.split("\n").length - 1;
        return quantidadeDePontosCarregados;
        // retorna a quantidade de pontos carregados
    }

    public Dataset(String filename) {
        this.loadDataFromCSV(filename);
        // Implementar construtor
    }

    public void loadDataFromCSV(String filename) {
        String caminhoArquivo = filename;
        try {
            conteudoArquivo = new String(Files.readAllBytes(Paths.get(caminhoArquivo)), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(conteudoArquivo);
        /* Implementação para ler dados do arquivo CSV e
         carregar na lista de pontos de dados */
    }
}