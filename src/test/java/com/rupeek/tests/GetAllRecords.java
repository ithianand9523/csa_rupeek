package com.rupeek.tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.rupeek.common.CommonLib;
import com.rupeek.common.IConstants;
import com.rupeek.utils.JsonUtils;

import io.restassured.http.ContentType;

/**
 * 
 * @author Prakruthi
 *
 */

public class GetAllRecords extends CommonLib {

	@Test(priority = 0)
	public void getReourceWithValidData() throws Throwable {
		// Bearer Token
		token = JsonUtils.getJsonString(response, "token");

		given().auth().oauth2(token).when().get(IConstants.ALL_CUSTOMERS).then().assertThat().statusCode(200).and()
				.contentType(ContentType.JSON);

	}
}
