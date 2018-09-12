package com.example.demo;

public class SomeBusinessImpl {
	private DataService dataService;

	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	public  int findTheGreatestFromAllData() {
		int [] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
 		for (int value : data) {
 			System.out.println(value);
			if(value>greatest) {
				greatest=value;
			}
		}
		return greatest;
		
	}
}
