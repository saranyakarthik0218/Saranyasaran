package com.TESTNG;

import org.testng.annotations.Test;

public class priorityTesting {

	@Test(priority=-1)
	private void chrome() {
		browserLaunch("chrome");
			urlLaunch("https://www.google.co.in/");
			System.out.println("chrome");
	
		}
		
		
		@Test(priority=0)
		private void edge() {
			browserLaunch("edge");
			urlLaunch("https://www.google.co.in/");
			System.out.println("edge");
		}
	


		@Test(priority=-5)
		private void firefox() {
			browserLaunch("firefox");
			urlLaunch("https://www.google.co.in/");
			System.out.println("firefox");
		}
	}

