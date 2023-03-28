package com.liu.Tong;

/**
 * 因为没有使用同步机制来解决这个三个窗口同时售票，这中间已经有了静态共享变量，因为静态只能访问一次，光有这个还不够，
 * 还没有让三个窗口同步，就比如说有100张票 第一个窗口售卖1张票剩99
 * 第二个窗口售卖一张票剩98，依次类推，解决这个问题需要用到同步锁synchronized修饰方法
 * 接下来请看第二个类*/
class SaleTicketThread extends Thread{
    private static int piao = 100;

    @Override
    public void run() {
        while (piao>0){
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(getName()
            +"卖出一张票，票号："+piao);
            piao--;
        }
    }
}
public class SaleTicketDemo {
    public static void main(String[] args) {
        SaleTicketThread t1 = new SaleTicketThread();
        SaleTicketThread t2 = new SaleTicketThread();
        SaleTicketThread t3 = new SaleTicketThread();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();


    }
}
