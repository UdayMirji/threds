package com.xworkz.threads;

import java.util.LinkedList;

public class ProducerConsumer {
	LinkedList< Integer> list=new LinkedList<Integer>();
	int capacity=2;
	void produce() throws InterruptedException{
		int value=0;
		while(true){
			synchronized (this) {
				if(list.size()==capacity)
					wait();
				System.out.println("Producer produces the item : "+value);
				list.add(value++);
				
				notify();
				Thread.sleep(2000);
				
			}
		}
		
		
	}
	
	
	void consumer() throws InterruptedException{
		int value=0;
		while(true){
			synchronized (this) {
				if(list.isEmpty())
					wait();
				System.out.println("Consumer consumer the item : "+value);
				 value=list.removeFirst();
				
				notify();
				Thread.sleep(1000);
				
			}
		}		
		
	}

}
