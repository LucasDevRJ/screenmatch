package br.com.alura.screenmatch.screenmacth.modelos;

import br.com.alura.screenmatch.screenmacth.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome) {
        super();
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
