package com.spiderscrawl;

public class Test {

	public static void main(String[] args) {
		
		Display d = new Display();
		
		MyThread t1 = new MyThread(d, "Pune");
		MyThread t2 = new MyThread(d,"Kerela");
		MyThread t3 = new MyThread(d, "Manali");
		
		t1.setName("pune");
		t2.setName("Kerela");
		t3.setName("manali");
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
