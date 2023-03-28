package com.liu.Tong;
/**
 * 生产者与消费者关系的实现
 * */
public class ConsumerProducerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        ShengChan s1 = new ShengChan(clerk);


        XiaoFei x1 = new XiaoFei(clerk);
        XiaoFei x2 = new XiaoFei(clerk);

        s1.setName("生产者");
        x1.setName("消费者1");
        x2.setName("消费者2");

        s1.start();
        x1.start();
        x2.start();
    }
}
class ShengChan extends Thread{
    private Clerk zi;

    public ShengChan(Clerk clerk) {
        this.zi = clerk;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产商品");
        while (true){
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            zi.addProduct();
        }
    }
}
class XiaoFei extends Thread{
    private Clerk zi;

    public XiaoFei(Clerk clerk) {
        this.zi = clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者开始消费商品");
        while (true){
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            zi.minusProduct();
        }
    }
}
//资源类
class Clerk {
    private int Number = 0; //产品数量
//    定义缓冲区域
    private static final int MAX_NUM = 30;
    private static final int MIN_NUM = 10;

//    添加商品
    public synchronized void addProduct(){
        if (Number < MAX_NUM){
            System.out.println(Thread.currentThread().getName()+"生产了第"+Number+"个产品");
            Number++;
//            唤醒消费者
            this.notifyAll();
        }else {
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

//    减少产品
    public synchronized void minusProduct(){
        if (Number >= MIN_NUM){
            System.out.println(Thread.currentThread().getName()+"消费类第"+Number+"个产品");
            Number--;
//            唤醒生产者
            this.notifyAll();
        }else {
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}