package tomcat;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Tomcat {
	public void start() {
		Process p = null;
		try {
			p = Runtime.getRuntime().exec("C:/apache-tomcat-8.5.34/bin/Startup.bat");
		} catch (Exception e) {
			System.out.println("Error al ejecutar el comando ");
			e.printStackTrace();
		}
		int exitVal;
		try {
			exitVal = p.waitFor();
			if (exitVal == 0) {
				System.out.println("Se ha conectado exitosamente");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void stop() {
		Process p = null;
		try {
			p = Runtime.getRuntime().exec("C:/apache-tomcat-8.5.34/bin/shutdown.bat");
		} catch (Exception e) {
			System.out.println("Error al ejecutar el comando ");
			e.printStackTrace();
		}
		int exitVal;
		try {
			exitVal = p.waitFor();
			if (exitVal == 0) {
				System.out.println("Se ha desconectado exitosamente");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void estado() throws IOException {
		URL url = new URL("http://localhost:8080");
		HttpURLConnection http = (HttpURLConnection) url.openConnection();
		int statusCode = http.getResponseCode();
		System.out.println("Conectada: " + statusCode);
	}
}
