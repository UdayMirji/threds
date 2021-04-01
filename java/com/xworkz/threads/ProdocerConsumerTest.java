package com.xworkz.threads;

public class ProdocerConsumerTest {

	public static void main(String[] args) {
		ProducerConsumer producerConsumer=new ProducerConsumer();
		Thread producerThread=new Thread(new Runnable() {
			public void run() {
				try{
					producerConsumer.produce();
				}catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
				
			}
		});
		
		Thread consumerThread=new Thread(new Runnable() {
			
			public void run() {
				try{
					producerConsumer.consumer();
				}catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
				
			}
		});

		producerThread.start();
		consumerThread.start();
	}
	
}
