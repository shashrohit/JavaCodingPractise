package org.shashank.knowledge.multithreading;


class MyThread1 implements Runnable{

    public void run(){
        try{
            System.out.println("Thread " + Thread.currentThread().getName() + " is running");
        }catch (Exception e){
            System.out.println("Caught exception");
        }
    }
}
public class RunnableInterfaceExample {

    public static void main(String[] args) {
        int i =0;
        while(i<5){
            Thread thread = new Thread(new MyThread1());
            thread.start();
            i+=1;
        }
    }
}
