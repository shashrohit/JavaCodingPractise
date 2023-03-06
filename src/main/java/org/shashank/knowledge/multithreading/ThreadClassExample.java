package org.shashank.knowledge.multithreading;


class MyThread extends Thread{

    public void run(){
        try{
            System.out.println("Thread " + Thread.currentThread().getName() + " is running");
        }catch (Exception e){
            System.out.println("Caught exception");
        }
    }
}
public class ThreadClassExample {

    public static void main(String[] args) {
        int i =0;
        while(i<5){
            MyThread thread = new MyThread();
            thread.start();
            i+=1;
        }
    }
}
