package com.trailblazer.services;
import java.util.Map;

import com.trailblazer.data.GraphQLQuery;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class APIHelper {

	public static ResponseSpecification getResponseSpecification(Map<String, String> headers) {
		RestAssured.baseURI = "https://api.graph.cool/simple";
		RequestSpecBuilder reqSpecBuilder = new RequestSpecBuilder();
		reqSpecBuilder.addHeaders(headers); 
		reqSpecBuilder.setContentType("application/json; charset=UTF-8");
		RequestSpecification requestSpecification = RestAssured.given(reqSpecBuilder.build());
		return requestSpecification.expect();
	}


	private Cookies addCookie(Map<String,String> cookiesMap) {
		Cookie userNameCookie = new Cookie.Builder("username", "some_value")
				.setSecured(true)
				.setComment("some comment")
				.build();
		Cookies cookies = new Cookies(userNameCookie);
		return cookies;
	}

	public static String post(String url, String query, Map<String,String> headers) {
		GraphQLQuery graphQLQuery = new GraphQLQuery();
		graphQLQuery.setQuery(query);
		Response response = getResponseSpecification(headers).given().
				contentType(ContentType.JSON).
				body(graphQLQuery).
				when().
				post(url);
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		return response.asString();

	}


	public static void getRequest(String url, Map<String,String> headers) {
		Response response = getResponseSpecification(headers).given()
				.contentType(ContentType.JSON)
				.when()
				.get(url);
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
	}

	public static void putRequest(String url, String query, Map<String,String> headers) {
		GraphQLQuery graphQLQuery = new GraphQLQuery();
		graphQLQuery.setQuery(query);
		Response response = getResponseSpecification(headers).given()
				.contentType(ContentType.JSON)
				.body(graphQLQuery)
				.when()
				.put(url);
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
	}

	public static void deleteRequest(String url, Map<String,String> headers) {
		Response response = getResponseSpecification(headers).given()
				.contentType(ContentType.JSON)
				.when()
				.delete(url);
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
	}

}
