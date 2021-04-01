package com.xworkz.threads.deadlock;

public class DeadLockDemo {

	public static void main(String[] args) {
		Pencil pencil=new Pencil();
		Ruler ruler=new Ruler();
		
		 Thread sushma=new Thread(new Runnable() {
			public void run() {
				synchronized (pencil) {
					System.out.println("Sushma is lock on Pencil");
					
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					System.out.println("sushma is waiting");
					synchronized (ruler) {
						System.out.println("sushma got lock on ruler");
						System.out.println("sushma completed dr");
					}
				}
				
			}
		});
		 
		 Thread madhu=new Thread(new Runnable() {
				public void run() {
					synchronized (ruler) {
						System.out.println("Madhu is lock on Ruler");
						
						try{
							Thread.sleep(1000);
						}catch(InterruptedException e){
							e.printStackTrace();
						}
						System.out.println("Madhu is waiting");
						synchronized (pencil) {
							System.out.println("madhu got lock on pencil");
							System.out.println("madhu completed drwaing");
							
						}
					}
					
				}
			});
	}

}
