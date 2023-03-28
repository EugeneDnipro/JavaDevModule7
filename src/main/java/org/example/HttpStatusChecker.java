package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpStatusChecker {
    private static final String URL = "https://http.cat/";

    public static String getStatusImage(int code) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL + code + ".jpg"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String responseCode = String.valueOf(response.statusCode());
        if (responseCode.startsWith("4")){
            throw new IllegalArgumentException("No such code is available");
        }
        return String.valueOf(response.uri());
    }
}
