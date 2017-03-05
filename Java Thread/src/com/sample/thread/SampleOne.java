package com.sample.thread;

public class SampleOne {

	public static void main(String[] args) {

		CommenResourse commenResourse = new CommenResourse();

		SampleTwo sampleTwo = new SampleTwo(commenResourse);
		SampleThree sampleThree = new SampleThree(commenResourse);
		sampleTwo.start();
		sampleThree.start();

	}

}
