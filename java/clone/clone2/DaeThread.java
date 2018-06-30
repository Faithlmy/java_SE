package clone2;

import java.io.IOException;

public  class DaeThread{
	public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			Thread threadIns = new Daemon();
			System.out.println("d.isDaemon() = " + threadIns.isDaemon());
			System.out.println("press any key");
			System.in.read();
	}
}

class Daemon extends Thread
{
	private static final int SIZE = 10;
	private Thread[] t = new Thread[SIZE];
	
	public Daemon()
	{
		setDaemon(true);
		start();
	}
	
	public void run()
	{
		for(int i = 0; i < SIZE;i++)
		{
			t[i] = new DaemonSpawn(i);
		}
		
		for(int i = 0; i < SIZE;i++)
		{
			System.out.println("t[" + i + "].isDaemon() = " + t[i].isDaemon());
		}
		while(true) { 
			yield(); //  功能和sleep一样，yield只能让同级别优先级的线程得到执行机会。
		}            //sleep不分优先级，只有当前线程sleep了，其它线程就有机会执行。否则没有sleep的话，只能等高优先级执行完毕，才能执行低优先级的线程。
		
	}
}

class DaemonSpawn extends Thread
{
	public DaemonSpawn(int i)
	{
		System.out.println("DaemonSpawn " + i + " started");
		start();
	}
	
	public void run()
	{
		while(true)
		{
			yield();
		}
	}
	
	int a = 9;
	public void m(int a) {
		
		this.a = a;
	}
}
