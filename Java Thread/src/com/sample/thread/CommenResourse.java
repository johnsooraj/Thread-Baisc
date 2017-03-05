package com.sample.thread;

public class CommenResourse {

	 public void printMe(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
