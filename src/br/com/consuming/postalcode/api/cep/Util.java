package br.com.consuming.postalcode.api.cep;

import java.io.BufferedReader;
import java.io.IOException;

public class Util {

    public static String convertsJsonIntoString(BufferedReader bufferedReader) throws IOException {

        String answer;
        StringBuilder jsonIntoString = new StringBuilder();
        while ((answer = bufferedReader.readLine()) != null){ // enquanto não há linha vazia
            jsonIntoString.append(answer);
        }
        return jsonIntoString.toString();
    }
}
