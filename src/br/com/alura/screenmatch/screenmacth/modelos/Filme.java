package br.com.alura.screenmatch.screenmacth.modelos;

import br.com.alura.screenmatch.screenmacth.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    //construtor é ótimo para se passar parâmetros como obrigatórios
    //porque dessa forma terá os atributos setados
    //os que forem obrigados
    public Filme(String nome) {
        this.setNome(nome);
    }

    //construtor padrão para poder instancia objetos sem parâmetros
    public Filme() {

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
