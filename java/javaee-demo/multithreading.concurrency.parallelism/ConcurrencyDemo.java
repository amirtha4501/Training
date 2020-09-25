/*
    REQUIREMENTS:
        - To write a program of performing two tasks by two threads that implements Runnable interface
    ENTITIES:
        - ConcurrencyDemo
    METHOD SIGNATURE:
        - public void run()
    WORK TO BE DONE:
        - create threads
        - start threads
        - display content when run
*/

class ConcurrencyDemo {  

    public static void main(String args[]) {

        Runnable runA = new Runnable() {  
            public void run() {  
                System.out.println("Start task A");  
            }  
        };  

        Runnable runB = new Runnable() {  
            public void run() {  
                System.out.println("Start task B");  
            }  
        };  

        Thread threadA = new Thread(runA);  
        Thread threadB = new Thread(runB);  
        
        threadA.start();  
        threadB.start();  
    }  
}  
