package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
	}
	
	void test() {
		System.out.println("git test");
	}
	
	void mergingBranch() {
		System.out.println("merging branches");
	}
	
}
