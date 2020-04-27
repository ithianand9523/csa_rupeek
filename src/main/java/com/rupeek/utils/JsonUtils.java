package com.rupeek.utils;

import io.restassured.response.Response;

/**
 * 
 * @author Prakruthi
 *
 */
public class JsonUtils {

	/**
	 * getJsonString returns the json value from the specified jsonpath
	 * 
	 * @param respnse
	 * @param jsonpath
	 * @return
	 */
	public static String getJsonString(Response response, String jsonPath) {
		return response.getBody().jsonPath().get(jsonPath).toString();
	}

}
