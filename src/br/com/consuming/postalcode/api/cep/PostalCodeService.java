package br.com.consuming.postalcode.api.cep;

import br.com.consuming.postalcodeapi.domain.Address;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostalCodeService {
    public static final String HTTPS_VIACEP_COM_BR_WS = "https://viacep.com.br/ws/";
    public static final int OK_SUCESS = 200;


    public static Address searchFor(String postalCode) throws Exception {
        String urlToCall = HTTPS_VIACEP_COM_BR_WS + postalCode + "/json";

        try {  // Trying to get connected
            URL url = new URL(urlToCall); // new URL object
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();  // Generate de representation of a connection

            // Fail fast
            if (connection.getResponseCode() != OK_SUCESS){ // the connection returns a response
                throw new RuntimeException("HTTP ERROR CODE: " + connection.getResponseCode());
            }

            BufferedReader answer = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String jsonToStr = Util.convertsJsonIntoString(answer);

            Gson gson = new Gson();
            Address address = gson.fromJson(jsonToStr, Address.class);
            return address;

        } catch (Exception e) {
            throw new Exception("ERROR " + e);
        }

    }
}
