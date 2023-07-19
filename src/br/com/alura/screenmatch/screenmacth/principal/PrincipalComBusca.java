package br.com.alura.screenmatch.screenmacth.principal;

import br.com.alura.screenmatch.screenmacth.modelos.Titulo;
import br.com.alura.screenmatch.screenmacth.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o nome do filme: ");
        var busca = leitura.nextLine();

        busca = busca.replace(" ", "+");

        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=fa6df38e";

        try {
            //enviar requisições HTTP para o servidor
            HttpClient client = HttpClient.newHttpClient();

            //constroi requisição HTTP que será enviada para o servidor
            //passando uma URI
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            //evia requisições ao HTTP para o servidor
            //send() define como o corpo será tratado
            //o corpo da resposta será tratada como String
            //resultado String será armazenado no HttpResponse
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.print("Título convertido:");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifique o endereço: ");
            System.out.println(e.getMessage());
        }

        System.out.println("O programa finalizou corretamente");
    }
}
