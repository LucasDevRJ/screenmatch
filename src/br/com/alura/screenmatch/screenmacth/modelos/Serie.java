package br.com.alura.screenmatch.screenmacth.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public void exibeFichaTecnica() {
        String ficha = """
                Nome: %s
                Ano de Lançamento: %d
                Incluido no Plano: %s
                Nota: %.1f
                Avaliações: %d
                Duração: %d minutos
                Temporadas: %d
                Ativa: %s
                Episodios por Temporada: %d
                Duração por Episodio: %d minutos
                """.formatted(getNome(), getAnoDeLancamento(), isIncluidoNoPlano(),
                pegaMedia(), getTotalDeAvaliacoes(), getDuracaoEmMinutos(),
                this.temporadas, this.ativa, this.episodiosPorTemporada,
                this.minutosPorEpisodio);

        System.out.println(ficha);
    }
}
