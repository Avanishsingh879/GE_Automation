package com.genpact.util;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class EnvironmentConfig {
	private static String JSON_FILE_NAME="Environment.json";

	public static String getURL() throws IOException
	{
		String environment = System.getProperty("environment");
		System.out.println("environment:"+environment);
		File jsonFile = new File(JSON_FILE_NAME);
		String jsonString = FileUtils.readFileToString(jsonFile);
		JsonElement jelement = new JsonParser().parse(jsonString);
		JsonObject jobject = jelement.getAsJsonObject();
		JsonObject jobject2 = jobject.getAsJsonObject(environment);
		return jobject2.get("URL").getAsString();
	}
	
	

}
