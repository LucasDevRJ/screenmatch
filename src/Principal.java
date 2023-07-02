import br.com.alura.screenmatch.screenmacth.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.screenmacth.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.screenmacth.modelos.Episodio;
import br.com.alura.screenmatch.screenmacth.modelos.Filme;
import br.com.alura.screenmatch.screenmacth.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(175);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        meuFilme.exibeFichaTecnica();
        //não podemos setar atributos encapsulados
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;

        meuFilme.exibeFichaTecnica();

        Serie serie = new Serie();
        serie.setNome("Breaking Bad");
        serie.setAnoDeLancamento(2008);
        serie.setIncluidoNoPlano(true);
        serie.setTemporadas(5);
        serie.setAtiva(false);
        serie.setEpisodiosPorTemporada(12);
        serie.setMinutosPorEpisodio(45);
        serie.avalia(10);
        serie.avalia(8);
        serie.avalia(9);
        serie.exibeFichaTecnica();

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Scarface");
        meuFilme2.setAnoDeLancamento(1984);
        meuFilme2.setIncluidoNoPlano(true);
        meuFilme2.setDuracaoEmMinutos(170);
        meuFilme2.avalia(6);
        meuFilme2.avalia(7);
        meuFilme2.avalia(9);

        meuFilme2.exibeFichaTecnica();

        Filme meuFilme3 = new Filme();
        meuFilme3.setNome("the professional");
        meuFilme3.setAnoDeLancamento(1994);
        meuFilme3.setIncluidoNoPlano(true);
        meuFilme3.setDuracaoEmMinutos(149);
        meuFilme3.avalia(10);

        meuFilme3.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(serie);

        System.out.printf("A duração total de títulos assistidos é %d minutos.\n", calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(meuFilme2);
        filtro.filtra(meuFilme3);

        Episodio episodio = new Episodio();
        episodio.setNome("Prólogo");
        episodio.setNumero(0);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        //mesma coisa que: Filme filmeDoPaulo = new Filme();
        var filmeDoPaulo = new Filme();
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);

        System.out.println();
        var tamanhoDaLista = listaDeFilmes.size();
        var primeiroFilme = listaDeFilmes.get(0).getNome();
        System.out.println("Tamanho da lista: " + tamanhoDaLista);
        System.out.println("Nome do primeiro filme: " + primeiroFilme);

        System.out.println();
        System.out.println("Lista de filmes:");
        for (int i = 0; i < tamanhoDaLista; i++) {
            System.out.println(listaDeFilmes.get(i).getNome());
        }

        System.out.println();
        System.out.println("toString do filme");
        System.out.println(listaDeFilmes.get(1).toString());
        System.out.println();

        //Como todas as classes herdam de Objeto
        //armazenar o filmeDoPaulo dentro da referência objeto é possível
        Object objeto = filmeDoPaulo;
        System.out.println(objeto);
    }
}
