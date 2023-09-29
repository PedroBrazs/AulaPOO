// Classe Main para testar os objetos das classes
public class Main {
    public static void main(String[] args) {
        Celular celularA = new CelularFabricanteA();
        Celular celularB = new CelularFabricanteB();

        celularA.ligar();
        celularA.tirarFoto();

        celularB.ligar();
        celularB.acessarFoneDeOuvido();
    }
}