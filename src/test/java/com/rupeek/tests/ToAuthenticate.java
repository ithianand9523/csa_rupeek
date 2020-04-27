package com.rupeek.tests;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import com.rupeek.common.CommonLib;
import com.rupeek.common.IConstants;

import io.restassured.http.ContentType;
import io.restassured.internal.util.IOUtils;
import io.restassured.response.Response;

/**
 * 
 * @author Prakruthi
 *
 */

public class ToAuthenticate extends CommonLib {

	@Test(priority = 0)
	public void validJSONBody() throws IOException {
		FileInputStream fis = new FileInputStream(
				new File(".\\src\\test\\resources\\JSON\\Authenticate.json"));
		Response response = given().contentType(ContentType.JSON).and().body(IOUtils.toByteArray(fis)).when()
				.post(IConstants.TO_AUTHENTICATE);
		response.then().assertThat().contentType(ContentType.JSON).and().statusCode(200);
	}

	@Test(priority = 1)
	public void invalidJSONBody1() throws IOException {
		FileInputStream fis = new FileInputStream(
				new File(".\\src\\test\\resources\\JSON\\invalidData1.json"));
		Response response = given().contentType(ContentType.JSON).and().body(IOUtils.toByteArray(fis)).when()
				.post(IConstants.TO_AUTHENTICATE);
		response.then().assertThat().contentType(ContentType.JSON).and().statusCode(401);
	}

	@Test(priority = 2)
	public void invalidJSONBody2() throws IOException {
		FileInputStream fis = new FileInputStream(
				new File(".\\src\\test\\resources\\JSON\\invalidData2.json"));
		Response response = given().contentType(ContentType.JSON).and().body(IOUtils.toByteArray(fis)).when()
				.post(IConstants.TO_AUTHENTICATE);
		response.then().assertThat().contentType(ContentType.JSON).and().statusCode(401);
	}

	@Test(priority = 3)
	public void invalidJSONBody3() throws IOException {
		FileInputStream fis = new FileInputStream(
				new File(".\\src\\test\\resources\\JSON\\invalidData3.json"));
		Response response = given().contentType(ContentType.JSON).and().body(IOUtils.toByteArray(fis)).when()
				.post(IConstants.TO_AUTHENTICATE);
		response.then().assertThat().contentType(ContentType.JSON).and().statusCode(401);
	}

	@Test(priority = 4)
	public void invalidJSONBody4() throws IOException {
		FileInputStream fis = new FileInputStream(
				new File(".\\src\\test\\resources\\JSON\\invalidData4.json"));
		Response response = given().contentType(ContentType.JSON).and().body(IOUtils.toByteArray(fis)).when()
				.post(IConstants.TO_AUTHENTICATE);
		response.then().assertThat().contentType(ContentType.JSON).and().statusCode(401);
	}
	
	@Test(priority = 5)
	public void invalidJSONBody5() throws IOException {
		FileInputStream fis = new FileInputStream(
				new File(".\\src\\test\\resources\\JSON\\invalidData5.json"));
		Response response = given().contentType(ContentType.JSON).and().body(IOUtils.toByteArray(fis)).when()
				.post(IConstants.TO_AUTHENTICATE);
		response.then().assertThat().contentType(ContentType.JSON).and().statusCode(401);
	}
	
	@Test(priority = 6)
	public void invalidJSONBody6() throws IOException {
		FileInputStream fis = new FileInputStream(
				new File(".\\src\\test\\resources\\JSON\\invalidData6.json"));
		Response response = given().contentType(ContentType.JSON).and().body(IOUtils.toByteArray(fis)).when()
				.post(IConstants.TO_AUTHENTICATE);
		response.then().assertThat().contentType(ContentType.JSON).and().statusCode(401);
	}

}
