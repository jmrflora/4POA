package estatico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;

public class TesteCon {

	public DogApiResponse getDogApiResponse(String raca) throws IOException {
		// TODO Auto-generated method stub
		
		String J = null;
		URL url = new URL("https://dog.ceo/api/breed/"+raca+"/images/random");
		HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.connect();
		int status = con.getResponseCode();
		switch (status) {
        case 200:
        case 201:
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line+"\n");
            }
            br.close();
            J = sb.toString();
		}
		if (con != null) {
			con.disconnect();
		}
		Gson gson = new Gson();
		DogApiResponse response = gson.fromJson(J, DogApiResponse.class);
		System.out.println(response.getMessage());
		System.out.println(J);
		return response;
	}

}
