package com.dsatm.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		ChildThread obj=new ChildThread(5,"Hello");
		ChildThread obj1=new ChildThread(4,"Hello World");
		obj.start();
		obj1.start();
		//obj.run();
		System.out.println("------------------End of Main------------------");
	}

}
