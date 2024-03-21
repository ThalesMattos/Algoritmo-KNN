package AlgoritmoKNN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo que será a base de dados: \n" +
                "Exemplo: C:\\Users\\Seidor\\Desktop\\JAVA\\feliz.csv");
        Dataset dataset = new Dataset(entrada.nextLine());
        System.out.println("Digite qual será o tamanho da busca para classificar o estado da pessoa (feliz ou infeliz): ");
        Knn algoritimoKNN = new Knn(dataset, entrada.nextInt());
        System.out.println("Digite a quantidade de horas e a quantidade de calorias: ");
        System.out.println(algoritimoKNN.determineHappiness(entrada.nextDouble(), entrada.nextDouble()));
    }
}
