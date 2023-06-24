public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        String ficha = """
                Nome: %s
                Ano: %d
                Incluido: %s
                Nota: %f
                Avaliação: %d
                Duração: %d
                """.formatted(nome, anoDeLancamento, incluidoNoPlano, avaliacao, totalDeAvaliacoes, duracaoEmMinutos);

        System.out.println(ficha);
    }
}
