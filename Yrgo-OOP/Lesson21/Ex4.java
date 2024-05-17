import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            var bestJoke = "";
            var score = 0;

            while (true) {
                System.out.println("Write joke to get a joke or exit to exit");
                var answer = input.nextLine();
                if (answer.equals("exit")) {
                    break;
                }
                HttpClient client = HttpClient.newHttpClient();
                URI dadUri = URI.create("https://icanhazdadjoke.com");
                HttpRequest request = HttpRequest.newBuilder().uri(dadUri).header("Accept", "text/plain")
                        .header("User-Agent", "Yrgo OOP Class (https://yrgo.se)").build();
    
                HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
                System.out.println(response.body());
                System.out.println("How much would you rate that joke? 1-10");
                var highscore = input.nextInt();
                input.nextLine();
                if (highscore > score) {
                    score = highscore;
                    bestJoke = response.body();
                }
            }
            System.out.printf("Your favorite joke was: %s, and you gave it rating of: %d", bestJoke, score);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}