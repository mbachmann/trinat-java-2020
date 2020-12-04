package ch.trinat.edu.web.rest;

/**
 * https://newsapi.org/
 * <p>
 * You first need to head to their website and register for an API key.
 * https://newsapi.org/register
 * <p>
 *     6b1fffe09e02470eae49cb3c83b079af
 * <p>
 * https://newsapi.org/docs/get-started
 * <p>
 * For this example add a gson (json mapper) dependency to maven
 * <dependency>
 * <groupId>com.google.code.gson</groupId>
 * <artifactId>gson</artifactId>
 * <version>2.8.5</version>
 * </dependency>
 */

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;


public class NewsScript {

    public static void main(String[] args) {
        System.out.println("### NewsScript! v1.0: Get Daily News ###");
        // String API_KEY = "<your api key here>";
        String API_KEY = "6b1fffe09e02470eae49cb3c83b079af";

        var client = HttpClient.newHttpClient();

        // only the source techcrunch
        var httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(String.format("https://newsapi.org/v2/top-headlines?sources=techcrunch&apiKey=%s", API_KEY)))
                .GET()
                .build();

        try {
            var response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println("## response body: " + response.body());

            // create a gson with a LocalDateTime deserializer for ISO8601 Data e.g. 2020-11-19T19:20:39
            Gson gson = new GsonBuilder().registerTypeAdapter(LocalDateTime.class, (JsonDeserializer<LocalDateTime>) (json, type, jsonDeserializationContext) ->
                            ZonedDateTime.parse(json.getAsJsonPrimitive().getAsString()).toLocalDateTime()).create();
            NewsDTO obj = gson.fromJson(response.body(), NewsDTO.class);

            //System.out.println(obj.articles);

            for (ArticleDTO art : obj.articles) {
                System.out.println("\n### " + art.title + " ### ");
                System.out.println("    (Published at: " + art.publishedAt + ", Author: " + art.author + ", Source: " + art.source.name + ")\n");
                System.out.println("Description: " + art.description);

                System.out.println("Read more:   " + art.url + "\n");
                System.out.println("Check image: " + art.urlToImage + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class NewsDTO {
    String status;
    int totalResults;
    ArrayList<ArticleDTO> articles;
}

class ArticleDTO {
    SourceDTO source;
    String author;
    String title;
    String description;
    String url;
    String urlToImage;
    LocalDateTime publishedAt;
    String content;
}

class SourceDTO {
    String id;
    String name;
}
