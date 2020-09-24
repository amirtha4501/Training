/*
    REQUIREMENTS:
        - To find the arguments passed for the sleep() method
        - To write a program which implement multithreading 
          using sleep(), setPriority(), getPriorty(), Name(), getId() method
    ENTITIES:
        - Demo
*/

class Demo extends Thread {

    public void run(){
        System.out.println( Thread.currentThread().getName() + "Running");
    }

    public static void main(String[] args) {
        
        Thread thread1 = new Thread("Thread 1");
        
        Demo demo = new Demo(); 
        demo.start();
    }
}