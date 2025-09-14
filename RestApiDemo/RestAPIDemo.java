package RestApiDemo;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper; // You need a JSON library like Jackson to convert objects to JSON

public class RestAPIDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        // creating a transcript resource
        Transcript demoTranscript = new Transcript();
        demoTranscript.audio_url = "https://github.com/AssemblyAI-Examples/audio-examples/raw/main/20230607_me_canadian_wildfires.mp3";

        // Convert demoTranscript to JSON
        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(demoTranscript);

        // creating the POST request
        HttpRequest postRequest = HttpRequest.newBuilder()
           .uri(URI.create("https://api.assemblyai.com/v2/transcript"))
           .header("Authorization", "b155f085dd96476b9194adaa97a12c47") // Be cautious with exposing API keys
           .header("Content-Type", "application/json") // Set the Content-Type header
           .POST(HttpRequest.BodyPublishers.ofString(requestBody)) // Correctly use POST with a request body
           .build();

        // sending the request and getting the response
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response = httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());

        // printing the response body
        System.out.println(response.body());
    }
}