import java.util.Scanner;
public class Viagem {
    public static void main(String[] args) {
        double tempo;
        double velocidade;
        double distancia;
        double kmLitro;
        double consumo;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a velocidade:");
        velocidade = ler.nextDouble();
        System.out.println("Digite o tempo gasto:");
        tempo = ler.nextDouble();
        System.out.println("Quantos km/Litro");
        kmLitro = ler.nextDouble();
        distancia = velocidade * tempo;
        consumo = distancia /kmLitro;
        System.out.println("O consumo médio: "+ consumo);

    }
