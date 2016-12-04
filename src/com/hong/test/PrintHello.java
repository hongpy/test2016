package com.hong.test;

public class PrintHello extends Thread{

	@Override
	public void run() {
		int num = 10;
		while(true){
			System.out.println("hello"+num);
			try {
				if(--num==0){
					return ;
				}
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
}
