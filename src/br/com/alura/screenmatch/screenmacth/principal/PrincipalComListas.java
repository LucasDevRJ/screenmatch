package br.com.alura.screenmatch.screenmacth.principal;

import br.com.alura.screenmatch.screenmacth.modelos.Filme;
import br.com.alura.screenmatch.screenmacth.modelos.Serie;
import br.com.alura.screenmatch.screenmacth.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Bad Boys", 2020);
        filme1.avalia(6);
        Filme filme2 = new Filme("Sem Saída", 2011);
        filme2.avalia(7);
        Filme filme3 = new Filme("Legado Explosivo", 2020);
        filme3.avalia(4);
        Filme filme4 = new Filme("Dogville", 2003);
        filme4.avalia(8);

        Serie serie1 = new Serie("Lista Negra", 2021);
        Serie serie2 = new Serie("Peaky Blinders", 2022);

        ArrayList<Titulo> listaDeFilmes = new ArrayList<Titulo>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        listaDeFilmes.add(serie1);
        listaDeFilmes.add(serie2);

//        for (Titulo item : listaDeFilmes) {
//            System.out.println(item.getNome());
//            Filme filme = (Filme) item;
//            System.out.println("Classificação: " + filme.getClassificacao());
//        }

        //Outra forma de se exibir a lista: forEach
        //listaDeFilmes.forEach(filme -> System.out.println(filme));

        //Method Reference
        //listaDeFilmes.forEach(System.out::println);

        for (Titulo item: listaDeFilmes) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        //referencia ao filme do Paulo (filme4)
        var filmeDoPaulo = filme4;

        System.out.println();
        ArrayList<String> buscaPorAtor = new ArrayList<>();
        buscaPorAtor.add("Marlon Brando");
        buscaPorAtor.add("Will Smith");
        buscaPorAtor.add("Jean Rino");
        buscaPorAtor.add("Sylvester Stallone");
        System.out.println("Lista de atores:");
        System.out.println(buscaPorAtor);

        Collections.sort(buscaPorAtor);
        System.out.println("Lista ordenada:");
        System.out.println(buscaPorAtor);
    }
}
