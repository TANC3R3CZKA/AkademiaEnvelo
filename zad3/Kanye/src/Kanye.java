import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Scanner;


public class Kanye {


    public static void get() throws Exception {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.kanye.rest/"))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());


            System.out.println(response.body());

            try (FileWriter f = new FileWriter("output.txt", true);
                 BufferedWriter b = new BufferedWriter(f);
                 PrintWriter p = new PrintWriter(b)) {
                p.println("appending text into file");
                p.println(response.body());
            } catch (IOException i) {
                i.printStackTrace();
            }
        }



    public static void main(String[] args) throws Exception {
        System.out.println("If u want to start program input the word 'next' below:\n");
        Scanner input = new Scanner(System.in);
        String x = input.next();

        if(Objects.equals(x, "next")){
            get();
        }

    }
}
