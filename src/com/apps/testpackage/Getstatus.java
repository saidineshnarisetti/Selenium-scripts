package com.apps.testpackage;

import java.io.IOException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Getstatus {
	public static void main(String[] args) throws InterruptedException, IOException {
		/*String CurrentURl = "https://apps-stage.juniper.net/hct/";
		getstatus s = new getstatus();
		int res = s.getStatus(CurrentURl, "GET");
		System.out.println(res);*/
	}

	public static int getStatus(String currentURl, String type) throws IOException {
		URL url = new URL(currentURl);
		
		HttpsURLConnection h = (HttpsURLConnection) url.openConnection();
		h.setRequestMethod(type);
		h.connect();
		return h.getResponseCode();
	}

}
