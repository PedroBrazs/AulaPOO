package Questão3;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Caminhao ca = new Caminhao("vgt425",2010,2);
        System.out.println("\n" + ca.toString());
        Onibus on = new Onibus("dfr253", 2015, 5);
        System.out.println("\n" + on.toString());
    }
}