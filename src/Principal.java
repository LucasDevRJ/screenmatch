import br.com.alura.screenmacth.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

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

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(serie);

        System.out.printf("A duração total de títulos assistidos é %d minutos.", calculadora.getTempoTotal());
    }
}
