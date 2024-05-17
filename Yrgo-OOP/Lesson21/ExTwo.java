import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ExTwo {
    public static void main(String[] args) throws IOException, InterruptedException {

        for (int i = 0; i < 5; i++) {
            HttpClient client = HttpClient.newHttpClient();
            URI dadUri = URI.create("HTTPS://icanhazdadjoke.com");

            HttpRequest request = HttpRequest.newBuilder().uri(dadUri).header("Accept", "text/plain")
                    .header("User-Agent", "Rasmus").build();
    
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    
            if (response.statusCode() == 200) {
                System.out.println(response.body());
            }
        }
    }
}