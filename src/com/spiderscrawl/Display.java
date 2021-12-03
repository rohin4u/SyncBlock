package com.spiderscrawl;

public class Display{
	
	public void m1(String name) {
		
		for(int i=0; i<5;i++) {
			try {
				
			System.out.println("Outside of synchronized area:  "+Thread.currentThread());
				Thread.sleep(2000);
			}catch(Exception e) {}
			
		}
		
		synchronized(this) {
			
			for(int i=0; i<5; i++) {
				try {
					System.out.println("Good Morning");
					Thread.sleep(2000);
				}catch(Exception e) {
					
				}
				System.out.println(name);
			
			}
			
		}
		
	}

}
