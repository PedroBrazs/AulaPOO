package Questao1;

import javax.swing.*;

class AchadoPerdido implements Publicacao {
    private String titulo;
    private String descricao;
    private String foto;
    private String local_achado;
    private String data_hora;
    private String status;
    private String tipo;

    public AchadoPerdido(String titulo, String tipo, String status) {
        this.titulo = titulo;
        this.status = status;
    }

    public void completaDados(String foto, String local_achado, String data_hora) {
        this.foto = foto;
        this.local_achado = local_achado;
        this.data_hora = data_hora;
    }

    public String buscarTitulo(String titulo) {
        if (this.titulo.equals(titulo)) {
            return "Título: " + this.titulo + "\nDescrição: " + this.descricao + "\nLocal Achado: " + this.local_achado;
        } else {
            return "Achado não encontrado.";
        }
    }

    public void visualizarDetalhes() {
        JOptionPane.showMessageDialog(null, "Título: " + this.titulo +
                "\nFoto: " + this.foto +
                "\nLocal Achado: " + this.local_achado +
                "\nTipo: " + this.tipo +
                "\nStatus: " + this.status);
    }

    // Métodos getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getLocalAchado() {
        return local_achado;
    }

    public void setLocalAchado(String local_achado) {
        this.local_achado = local_achado;
    }

    public String getDataHora() {
        return data_hora;
    }

    public void setDataHora(String data_hora) {
        this.data_hora = data_hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
