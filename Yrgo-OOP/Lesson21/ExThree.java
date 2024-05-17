import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Path;

public class ExThree {
    public static void main(String[] args) throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        URI wiki = URI.create("https://en.wikipedia.org/wiki/Wikipedia:Enhanced_Random_Article");

        HttpRequest request = HttpRequest.newBuilder().uri(wiki).build();
        Path outFile = Path.of("wiki.txt");

        client.send(request, BodyHandlers.ofFile(outFile));
        
        
    }
}
