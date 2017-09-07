package com.softserve.edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 1;
		try {
			System.out.print("x=");
			// x = Integer.parseInt(br.readLine()); // =Float.parseFloat();
			x = Integer.parseInt(br.readLine()); // =Float.parseFloat();
		} catch (Exception e) { // NumberFormatException
			System.out.println("I/O Error.");
		}
		int s = 0;
		while (x > 0) {
			s = s + x % 10;
			x = x / 10;
		}
		System.out.println("s=" + s);
	}
}
