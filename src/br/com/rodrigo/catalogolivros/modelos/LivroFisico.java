package br.com.rodrigo.catalogolivros.modelos;

public class LivroFisico extends Livro {

    private int numeroPaginas;

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}