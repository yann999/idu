package com.yan.idu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IduApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(IduApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("********************* application is running, you can add some action *********************");
	}

}
