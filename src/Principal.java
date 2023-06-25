import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.anoDeLancamento = 1972;
        meuFilme.incluidoNoPlano = true;
        meuFilme.duracaoEmMinutos = 175;
        meuFilme.nome.

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
    }
}
