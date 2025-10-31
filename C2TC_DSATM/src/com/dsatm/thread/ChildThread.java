package com.dsatm.thread;

public class ChildThread extends Thread {
	private int n;
	private String msg;
	public ChildThread(int n, String msg) {
		super();
		this.n = n;
		this.msg = msg;
	}
	public void run() {
		for(int i=1;i<=n;i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Thread Interrupted: "+e.getMessage());
			}
			System.out.println(msg + i + " "+Thread.currentThread().getName());
		}
	}
}
