import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;

public class Ex4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("You need to enter a URL");
            System.exit(-1);
        }
        try {
            getWebpage(args[0]);
        } catch (Exception e) {
            System.err.println("Could'nt find that website" + e.getMessage());
        }

    }

    // public static CompletableFuture<String> getWebpage(String url) throws
    // IOException, InterruptedException {
    //
    // HttpClient client = HttpClient.newHttpClient();
    // URI randomUri = URI.create(url);
    // HttpRequest request =
    // HttpRequest.newBuilder().uri(randomUri).header("Accept", "text/html")
    // .header("User-Agent", "Rasmus").build();
    // HttpResponse<String> response = client.send(request,
    // BodyHandlers.ofString());
    // return response;
    // }

    public static CompletableFuture<String> getWebpage(String url) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        URI randomUri = URI.create(url);
        HttpRequest request = HttpRequest.newBuilder().uri(randomUri).header("Accept", "text/html")
                .header("User-Agent", "Rasmus").build();
        return null; //CompletableFuture.supplyAsync(() -> client.send(request, BodyHandlers.ofString()));
    }
}
