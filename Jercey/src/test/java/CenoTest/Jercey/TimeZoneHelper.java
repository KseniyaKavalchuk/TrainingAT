package CenoTest.Jercey;

import java.util.Date;

import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class TimeZoneHelper {

	public static TimeZoneResponse getTimeZoneEntity(double locationX, double locationY, long timestamp){
		Client client = Client.create();

		String path = "https://maps.googleapis.com/maps/api/timezone/json";
		String key = "AIzaSyD_RHKcAVJqrux-lytH9d8ksoOqvkugB1s";

		WebResource webResource = client.resource(path);

		MultivaluedMap queryParams = new MultivaluedMapImpl();
		queryParams.add("key", key);
		queryParams.add("location", locationX + "," + locationY);
		queryParams.add("timestamp", timestamp + "");
		webResource = webResource.queryParams(queryParams);


		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

		if (response.getStatus() != 200) {
			System.out.println("INVALID REQUEST");
		}

		return response.getEntity(TimeZoneResponse.class);
	}


}
