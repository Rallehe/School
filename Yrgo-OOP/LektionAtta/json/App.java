package json;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Person per = new Person("Adam", 27, "Falun");

        Gson gson = new Gson();

        String json = gson.toJson(per);

        System.out.println(json);
    }
}

