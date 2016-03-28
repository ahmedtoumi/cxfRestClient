package com.atoumi.rest.client;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.WebClient;

/**
 * ahmed.ettoumi@gmail.com <br />
 * 28 mars 2016
 *
 */
public class CxfRestClient {

	static final String REST_URI = "http://localhost:8080/jaxrsCxfXmlConfig/rservice";
	static final String REST_URI_ACCOUNTS = "/accountservice/accounts/getall";

	public static void main(String[] args) {
		WebClient restClient = WebClient.create(REST_URI);
		restClient.accept(MediaType.APPLICATION_JSON).path(REST_URI_ACCOUNTS);
		System.out.println(restClient.get(String.class));
	}

}
