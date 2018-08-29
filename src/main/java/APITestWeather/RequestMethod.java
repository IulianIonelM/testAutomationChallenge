package APITestWeather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequestMethod {

    public static final Logger log = LoggerFactory.getLogger(RequestMethod.class);

    public String request (String city) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL("https://samples.openweathermap.org/data/2.5/weather?q=" + city + ",uk&appid=b6907d289e10d714a6e88b30761fae22");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();
        return result.toString();
    }

}
