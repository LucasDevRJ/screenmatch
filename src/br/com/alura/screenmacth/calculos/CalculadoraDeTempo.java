package br.com.alura.screenmacth.calculos;

import br.com.alura.screenmatch.modelos.Filme;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Filme filme) {
        tempoTotal += filme.getDuracaoEmMinutos();
    }
}
