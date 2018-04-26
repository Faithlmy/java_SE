package ThreadLearn;

/*
 * 实现Runnable接口比继承Thread类所具有的优势：
 * 如果一个类继承Thread，则不适合资源共享。但是如果实现了Runable接口的话，则很容易的实现资源共享
 * 1）：适合多个相同的程序代码的线程去处理同一个资源
 * 2）：可以避免java中的单继承的限制
 * 3）：增加程序的健壮性，代码可以被多个线程共享，代码和数据独立
 * */

class CompareExtends extends Thread{
	     private int count=5;
	     private String name;
	     public CompareExtends(String name) {
	        this.name=name;
	     }
	     public void run() {
	         for (int i = 0; i < 5; i++) {
	             System.out.println(name + "运行  count= " + count--);
	             try {
	                 sleep((int) Math.random() * 1000);
	             } catch (InterruptedException e) {
	                 e.printStackTrace();
	            }
	         }
	     }
}

class CompareRunnable implements Runnable { // resource sharing
	private int count = 5;
	   
	   public void run() {
		   for(int i = 0; i < 5; i++) {
			   System.out.println(Thread.currentThread().getName() + " count= " + count--);
			   try {
				   Thread.sleep((int)Math.random() * 100);
			   }catch(InterruptedException e){
				   e.printStackTrace();
			   }
		   }
		   
	   }
}

class CompareStart{
	public CompareStart() {}
	
	public void ReStart(int num) {
		if (num == 1){
			new CompareExtends("A").start();;
			new CompareExtends("b").start();;
		}else { //resource sharing
			CompareRunnable cr = new CompareRunnable();
			new Thread(cr, "C").start();
			new Thread(cr, "D").start();
			new Thread(cr, "E").start();
		}
	}

}

public class CompareRunnableAndExtend{
	public static void main(String[] args) {
		CompareStart cs = new CompareStart();
		cs.ReStart(1);
		cs.ReStart(0);
	}
}
