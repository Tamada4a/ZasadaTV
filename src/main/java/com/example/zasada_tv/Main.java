package com.example.zasada_tv;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		LogParser.parse();
	}
}
