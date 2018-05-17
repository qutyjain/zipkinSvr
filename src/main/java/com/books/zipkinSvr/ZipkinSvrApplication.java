package com.books.zipkinSvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinSvrApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ZipkinSvrApplication.class, args);
	}
}
