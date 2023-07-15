package br.com.alura.screenmatch.screenmacth.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        //enviar requisições HTTP para o servidor
        HttpClient client = HttpClient.newHttpClient();

        //constroi requisição HTTP que será enviada para o servidor
        //passando uma URI
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t=The+Professional&apikey=fa6df38e"))
                .build();

        //evia requisições ao HTTP para o servidor
        //send() define como o corpo será tratado
        //o corpo da resposta será tratada como String
        //resultado String será armazenado no HttpResponse
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
