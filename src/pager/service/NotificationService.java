package pager.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

@Service
public class NotificationService {
	
	public String sendAlert(Long teamId, String message) {
		
		/*
		 * List<Developer> developers = select phone_number from DEVELOPER where team_id = teamId;
		 * int developerSize = developers.size();
		 * if(developerSize == 0){
		 * 	Logger.info("No Alert sent");
		 *  return;
		 * } else {
		 * 	int selectedIndex = Math.random(developerSize);
		 * 	sendNotificationToDeveloper(developers.get(selectedIndex).getPhone_number());
		 * }
		 */
	}
	
	private boolean sendNotificationToDeveloper(int phoneNumber) throws IOException {
		//Service to invoke notification to phone number
		URL url = new URL("https://run.mocky.io/v3/fd99c100-f88a-4d70-aaf7-393dbbd5d99f");
		URLConnection con = url.openConnection();
		HttpURLConnection http = (HttpURLConnection)con;
		http.setRequestMethod("POST");
		
		
		return true;
	}
}
