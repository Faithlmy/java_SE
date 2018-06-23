package com.addANDsub1;

//用锁的方法来计算
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Count {

	private int num = 0;
    private boolean flag=false; // 标识
    Lock lock = new ReentrantLock(); // 锁
    Condition add = lock.newCondition(); // 加法锁
    Condition sub = lock.newCondition();// 减法锁

    public void add() {
        lock.lock();// 锁上
        try {
            while (flag) {  //循环判断

                add.await();
            }
            this.num++;
            System.out.println(Thread.currentThread().getName() + "........" + this.num);
            this.flag = true; // 设置标识
            sub.signal(); // 唤醒指定线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }

        
    }

    public void sub() {
        lock.lock();// 锁上
        try {
            while (!flag) {//循环判断

                sub.await();
            }
            this.num--;
            System.out.println(Thread.currentThread().getName() + "........" + this.num);
            this.flag = false; // 设置标识
            add.signal(); // 唤醒指定线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }

        
    }

}
