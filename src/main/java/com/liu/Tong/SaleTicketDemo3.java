package com.liu.Tong;


/**使用同步锁解决超买超卖的问题*/
public class SaleTicketDemo3 {
    public static void main(String[] args) {
        TicketSaleThread t1 = new TicketSaleThread();
        TicketSaleThread t2 = new TicketSaleThread();
        TicketSaleThread t3 = new TicketSaleThread();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
class TicketSaleThread extends Thread{
    private static int piao = 100;

    @Override
    public void run() {
        while(true){
            saleOneTicket();
        }
    }
    public synchronized static void saleOneTicket(){
        if (piao>0){
            System.out.println(Thread.currentThread().getName()+"卖出一张票"+piao);
            piao --;
        }
    }

}