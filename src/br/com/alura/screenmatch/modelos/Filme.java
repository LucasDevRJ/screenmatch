package br.com.alura.screenmatch.modelos;

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica() {
        String ficha = """
                Nome: %s
                Ano: %d
                Incluido: %s
                Nota: %.1f
                Avaliações: %d
                Duração: %d
                """.formatted(nome, anoDeLancamento, incluidoNoPlano,
                pegaMedia(), totalDeAvaliacoes, duracaoEmMinutos);

        System.out.println(ficha);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
