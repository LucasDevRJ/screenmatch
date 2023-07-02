package br.com.alura.screenmatch.screenmacth.principal;

import br.com.alura.screenmatch.screenmacth.modelos.Filme;
import br.com.alura.screenmatch.screenmacth.modelos.Serie;
import br.com.alura.screenmatch.screenmacth.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Bad Boys", 2020);
        Filme filme2 = new Filme("Sem Saída", 2011);
        Filme filme3 = new Filme("Legado Explosivo", 2020);

        Serie serie1 = new Serie("Lista Negra", 2021);
        Serie serie2 = new Serie("Peaky Blinders", 2022);

        ArrayList<Titulo> listaDeFilmes = new ArrayList<Titulo>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        listaDeFilmes.add(serie1);
        listaDeFilmes.add(serie2);
    }
}
