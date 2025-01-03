import java.net.HttpURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WeatherApp {
    
    public static JSONObject getWeatherData(String locationName) {
        
        JSONArray locationData = getLocationData(locationName);
    }

    private static JSONArray getLocationData(String locationName) {
        
        locationName = locationName.replaceAll(" ", "+");

        String urlString = "https://geocoding-api.open-meteo.com/v1/search?name=" + 
            locationName + "&count=10&Language=en&format=json";

            try{
                
                HttpURLConnection conn = fetchApiResponse(urlString);
                
            }catch(Exception e){
                e.printStackTrace();
            }
    }

}
