import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConversorApp{
// Metodo para realizar la conversión
public static double convertir(String monedaBase, String monedaDestino, double cantidad) throws Exception {
    // Construir la URL de la solicitud
    String key = "1d717867d9f7271838bcac6a";
    String urlStr = "https://v6.exchangerate-api.com/v6/" + key + "/latest/" + monedaBase;
    URL url = new URL(urlStr); // Crear el objeto URL
    HttpURLConnection solicitud = (HttpURLConnection) url.openConnection(); // Abrir la conexión
    solicitud.connect(); // Conectar con la API

    // Convertir la respuesta a un objeto JSON
    JsonParser parser = new JsonParser();
    JsonElement elementoRaiz = parser.parse(new InputStreamReader((InputStream) solicitud.getContent()));
    JsonObject jsonObjeto = elementoRaiz.getAsJsonObject();

    // Verificar si la respuesta fue exitosa
    String resultado = jsonObjeto.get("result").getAsString();
    if (!resultado.equals("success")) {
        throw new Exception("Error al obtener las tasas de cambio: " + resultado);
    }

    // Obtener la tasa de cambio para la moneda de destino
    JsonObject tasasConversion = jsonObjeto.getAsJsonObject("conversion_rates");
    double tasa = tasasConversion.get(monedaDestino).getAsDouble();

    // Calcular el monto convertido
    return cantidad * tasa;
}
}