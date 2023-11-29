package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private SomeDataService someDataService;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public int calculateSum(int[] data) {
		int sum = 0;
		for (int value : data) {
			sum += value;
		}
		return sum;
		//Functional Style
		//return Arrays.stream(data).reduce(Integer::sum).orElse(0);
	}

	public int calculateRest(int[] data) {
		int rest=data[0];

		for (int i=1;i<data.length;i++) {
			int num = data[i];
			rest -= num;

		}
		return rest;
		//Functional Style
		//return Arrays.stream(data).reduce(Integer::sum).orElse(0);
	}

	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int calculateSumWithADataService() {
		int sum = 0;
		int[] data = someDataService.retrieveAllData();
		for(int value:data) {
			sum += value;
		}

		return sum;
	}



}
