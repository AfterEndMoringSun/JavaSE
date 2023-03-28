package com.liu.Tong;

import java.util.concurrent.locks.ReentrantLock;
/**
 * 使用lock锁来完成同步锁进行超卖超买问题
 * */
public class ThreadLock {
    public static void main(String[] args) {
        window t = new window();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.setName("第一个窗口");
        t2.setName("第二个窗口");
        t1.start();
        t2.start();

    }
}
class window implements Runnable{
    int piao = 100;

//    1.创建lock的实例，必须确保多个线程共享同一个lock实例
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            try {
//                2.调动lock 实现需要共享的代码的锁定
                lock.lock();

                if (piao > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"剩余票数"+piao--);
                }else{
                    break;
                }
            }finally {
//               3. 释放代码锁
                lock.unlock();
            }
        }
    }


}