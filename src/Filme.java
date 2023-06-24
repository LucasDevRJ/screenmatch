public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        String ficha = """
                Nome: %s
                Ano: %d
                Incluido: %s
                Nota: %f
                Avaliações: %d
                Duração: %d
                """.formatted(nome, anoDeLancamento, incluidoNoPlano, somaDasAvaliacoes, totalDeAvaliacoes, duracaoEmMinutos);

        System.out.println(ficha);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
}
