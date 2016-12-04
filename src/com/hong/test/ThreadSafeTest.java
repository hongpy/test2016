package com.hong.test;

public class ThreadSafeTest implements Runnable{

	int num = 10;
	@Override
	public void run() {
		while(true){
			synchronized(""){ //同步机制的关键字
				if(num>0){
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("tickets"+ --num);
				}
			}
		}
		
	}

}
