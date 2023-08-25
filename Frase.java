import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int contadorVogais = contarVogais(frase);

        System.out.println("Número de vogais: " + contadorVogais);
    }

    public static int contarVogais(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caractere = Character.toLowerCase(frase.charAt(i));
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contador++;
            }
        }
        return contador;
    }
}