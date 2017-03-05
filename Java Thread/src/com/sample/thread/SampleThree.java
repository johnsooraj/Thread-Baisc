package com.sample.thread;

public class SampleThree extends Thread {

	CommenResourse commen;

	public SampleThree(CommenResourse commenResourse) {
		this.commen = commenResourse;
	}

	@Override
	public void run() {
		commen.printMe(33);
	}

}
