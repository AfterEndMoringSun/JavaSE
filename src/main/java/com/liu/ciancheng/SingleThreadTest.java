package com.liu.ciancheng;

public class SingleThreadTest {
    /**
     * 1.创建一个继承thread的类
     * 2.重写thread类中的run方法 将此线程要执行的步骤，声明在此方法体中
     * 3.创建当前Thread的子类的对象
     * 4.通过的对象调用start（）
     * **/
    public static void main(String[] args) {
        SingleThread thread = new SingleThread();
        thread.start();
    }
}
//1.创建一个继承thread的类
class SingleThread extends Thread{
    @Override
    public void run() {
//        输出0到100之间的偶数
        for (int i = 0; i <= 100; i++) {
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
