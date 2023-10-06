package Questao1;

import Questao1.AchadoPerdido;

import javax.swing.*;

public class Encontrar {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("João", "joao@gmail.com", "123456");
        AchadoPerdido achadoPerdido = new AchadoPerdido("Celular", "Eletrônico", "Encontrado");

        achadoPerdido.setDescricao("Celular perdido no parque.");
        achadoPerdido.completaDados("foto.jpg", "Parque XYZ", "2023-10-05 10:00:00");

        String tituloBuscado = "Celular";
        String resultadoBusca = achadoPerdido.buscarTitulo(tituloBuscado);
        JOptionPane.showMessageDialog(null, resultadoBusca);

        achadoPerdido.visualizarDetalhes();
    }
}