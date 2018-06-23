package com.Synchronized1;

public class SyncDeadLock1 {

	public static void main(String[] args) 
	{
		new SyncDeadLock1().deadlock();
	}
	private void deadlock()
	{
		Object locka = new Object();
		Object lockb = new Object();
		
		Thread thread1 = new Thread(new LockRun(locka, lockb));
		Thread thread2 = new Thread(new LockRun(lockb, locka));
		thread1.start();
		thread2.start();
	}
}

class LockRun implements Runnable{
	

	private Object locka = new Object();
	private Object lockb = new Object();
	
	public LockRun(Object locka, Object lockb) {
		this.locka = locka;
		this.lockb = lockb;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this.locka) 
		{
			try 
			{
				System.out.println(Thread.currentThread().getName()+" get locka ing!");  
                Thread.sleep(5000);  
                System.out.println(Thread.currentThread().getName()+" after sleep 500ms!"); 
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName()+" need lockb!Just waiting!");  
            synchronized (this.lockb){  
                System.out.println(Thread.currentThread().getName()+" get lockb ing!");  
            }  
		}
	}
}