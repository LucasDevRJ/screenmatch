package br.com.alura.screenmatch.screenmacth.principal;

import br.com.alura.screenmatch.screenmacth.modelos.Filme;
import br.com.alura.screenmatch.screenmacth.modelos.Serie;
import br.com.alura.screenmatch.screenmacth.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Bad Boys", 2020);
        filme1.avalia(6);
        Filme filme2 = new Filme("Sem Saída", 2011);
        filme2.avalia(7);
        Filme filme3 = new Filme("Legado Explosivo", 2020);
        filme3.avalia(4);

        Serie serie1 = new Serie("Lista Negra", 2021);
        Serie serie2 = new Serie("Peaky Blinders", 2022);

        ArrayList<Titulo> listaDeFilmes = new ArrayList<Titulo>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        listaDeFilmes.add(serie1);
        listaDeFilmes.add(serie2);

        for (Titulo item : listaDeFilmes) {
            System.out.println(item.getNome());
            Filme filme = (Filme) item;
            System.out.println("Classificação: " + filme.getClassificacao());
        }

        //Outra forma de se exibir a lista: forEach
        //listaDeFilmes.forEach(filme -> System.out.println(filme));

        //Method Reference
        //listaDeFilmes.forEach(System.out::println);
    }
}
