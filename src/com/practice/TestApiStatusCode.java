package com.practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestApiStatusCode {

	public static void main(String[] args) throws IOException {
		String urlName = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=Washington,DC&destinations=New+York+City,NY&";
		try {
			URL newURL = new URL(urlName);
			HttpURLConnection connect = (HttpURLConnection) newURL.openConnection();
			int responseCode = connect.getResponseCode();
			System.out.println("Hello World " + responseCode);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
