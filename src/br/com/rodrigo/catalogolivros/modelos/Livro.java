package br.com.rodrigo.catalogolivros.modelos;

public class Livro {

    private String titulo;
    private String autor;
    private int totalLeituras;
    private int totalCurtidas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void ler() {
        totalLeituras++;
    }

    public void curtir() {
        totalCurtidas++;
    }

    public double getClassificacao() {
        if (totalLeituras >= 500) {
            return 10;
        } else if (totalLeituras >= 200) {
            return 8;
        } else {
            return 6;
        }
    }
}