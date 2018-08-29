import APITestWeather.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.runner.RunWith;

public class APITestChallenge {


    public static final Logger log = LoggerFactory.getLogger(APITestChallenge.class);


    public static void main (String[] param) throws Exception {
        RequestMethod request = new RequestMethod();

        String result = request.request("Zaragoza");

        if (result.contains(",\"main\":")){
            System.out.println( result.substring(result.indexOf(",\"main\":\"")));
            String partOfJ = result.substring(result.indexOf(",\"main\":\"")+9);
            System.out.println("Response contains the wheather type " + partOfJ.substring(0, partOfJ.indexOf("\""))) ;
         }
         // TEST PASS CODE
    }

}