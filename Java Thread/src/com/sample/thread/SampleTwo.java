package com.sample.thread;

public class SampleTwo extends Thread {

	CommenResourse commen;

	public SampleTwo(CommenResourse commenResourse) {
		this.commen = commenResourse;
	}

	@Override
	public void run() {
		commen.printMe(22);
	}

}
