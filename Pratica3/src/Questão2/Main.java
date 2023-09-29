package Questão2;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Padrao fp = new Padrao(1,"Jennifer", 1500);
        System.out.println(fp.toString());

        Comissionado co = new Comissionado(2,"João",1500,2,10000);
        System.out.println("\n" + co.toString());

        Produtividade pr = new Produtividade(1,"Jennifer",1500,0.50,100);
        System.out.println("\n" + pr.toString());
    }
}




