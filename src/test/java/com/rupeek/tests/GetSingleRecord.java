package com.rupeek.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

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

public class GetSingleRecord extends CommonLib {

	@Test(priority = 0)
	public void getSingleRecordWithValidPhone() throws Throwable {
		// Bearer Token
		token = JsonUtils.getJsonString(response, "token");
		
		given().auth().oauth2(token).given().pathParam("phone", 8037602400l).when().get(IConstants.SINGLE_CUSTOMER).then().assertThat()
				.statusCode(200).and().contentType(ContentType.JSON).and().body("first_name", equalTo("Aliko")).and()
				.body("last_name", equalTo("Dangote")).and().body("career", equalTo("Billionaire Industrialist"));

	}

	@Test(priority = 1)
	public void getSingleRecordWithInvalidPhone() throws Throwable {
		// Bearer Token
		token = JsonUtils.getJsonString(response, "token");
		
		given().auth().oauth2(token).given().pathParam("phone", 803760210l).when().get(IConstants.SINGLE_CUSTOMER).then().assertThat()
				.statusCode(200);
	}
	
	@Test(priority = 2)
	public void getSingleRecordWithInvalid1() throws Throwable {
		// Bearer Token
		token = JsonUtils.getJsonString(response, "token");
		
		given().auth().oauth2(token).given().pathParam("phone", 12.08f).when().get(IConstants.SINGLE_CUSTOMER).then().assertThat()
				.statusCode(200);
	}
	
	@Test(priority = 3)
	public void getSingleRecordWithInvalid2() throws Throwable {
		// Bearer Token
		token = JsonUtils.getJsonString(response, "token");
		
		given().auth().oauth2(token).given().pathParam("phone", 12e34).when().get(IConstants.SINGLE_CUSTOMER).then().assertThat()
				.statusCode(200);
	}

}
