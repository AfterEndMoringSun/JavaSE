package com.liu.xiancheng1;


public class Thread02 {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        MouseOne mouseOne = new MouseOne();
        Thread thread = new Thread(mouse);
        Thread thread1 = new Thread(mouseOne);
        thread.start();
        thread1.start();

    }
}
class Mouse implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while(true){
            System.out.println("老鼠吱吱叫"+(++count)+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            if (count == 8){
                break;
            }
        }
    }
}
class MouseOne implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while(true){
            System.out.println("老鼠吱吱叫"+(++count)+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            if (count == 8){
                break;
            }
        }
        
    }
}
