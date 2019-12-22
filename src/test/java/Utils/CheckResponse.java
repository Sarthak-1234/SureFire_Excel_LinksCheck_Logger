package Utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class CheckResponse {
	
	public static int getStatus(String url) throws IOException {
		HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
		return con.getResponseCode(); 
	}

}
