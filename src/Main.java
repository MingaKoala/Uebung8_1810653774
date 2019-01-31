import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        ObjectMapperWeather omw = new ObjectMapperWeather();
        System.out.println(omw.readJsonWithObjectMapper());
    }
}
