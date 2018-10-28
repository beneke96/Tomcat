package tomcat;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class EstadoTomcat {
	public void estado() throws IOException {
        URL url = new URL("http://localhost:8080");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        int statusCode = http.getResponseCode();
        System.out.println("Corriendo " + statusCode);
    }

}
