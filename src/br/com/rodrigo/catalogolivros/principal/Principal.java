package br.com.rodrigo.catalogolivros.principal;

import br.com.rodrigo.catalogolivros.modelos.LivroFisico;
import br.com.rodrigo.catalogolivros.modelos.Ebook;


public class Principal {

    public static void main(String[] args) {

        LivroFisico livro1 = new LivroFisico();
        livro1.setTitulo("O Hobbit");
        livro1.setAutor("J.R.R. Tolkien");
        livro1.setNumeroPaginas(310);

        for (int i = 0; i < 200; i++) {
            livro1.ler();
        }

        for (int i = 0; i < 50; i++) {
            livro1.curtir();
        }

        Ebook ebook1 = new Ebook();
        ebook1.setTitulo("Clean Code");
        ebook1.setAutor("Robert C. Martin");
        ebook1.setTamanhoMB(5.2);

        for (int i = 0; i < 400; i++) {
            ebook1.ler();
        }

        for (int i = 0; i < 120; i++) {
            ebook1.curtir();
        }



    }

}
