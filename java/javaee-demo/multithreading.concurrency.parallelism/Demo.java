/*
    REQUIREMENTS:
        - To find the arguments passed for the sleep() method
        - To write a program which implement multithreading 
          using sleep(), setPriority(), getPriorty(), Name(), getId() method
    ENTITIES:
        - Demo
        - ThreadA
        - ThreadB
        - ThreadC
        - ThreadD
        - ThreadE
    METHOD SIGNATURE:
        - public void run()
    WORK TO BE DONE:
        - create threads
        - make threads to sleep for a time
        - set priorities to the threads
        - get priority of the thread
        - get name of the threads
        - get id of the threads
        - display the results
*/

class ThreadA extends Thread {

    public void run() {

        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + "  Running - " + i);
            
            try {
                Thread.sleep(3000);    
            } catch (Exception e) { }
            
        }
    }
}


class ThreadB extends Thread {

    public void run(){
        
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + "  Running - " + i);
            
            try {
                Thread.sleep(1000);    
            } catch (Exception e) { }

        }
    }
}


class ThreadC extends Thread {

    public void run(){
        
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + "  Running - " + i);
        }
    }
}


class ThreadD extends Thread {

    public void run(){
        
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + "  Running - " + i);
        }
    }
}


class ThreadE extends Thread {

    public void run(){
        
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + "  Running - " + i);
        }
    }
}


class ThreadF extends Thread {

    public void run(){
        
        System.out.println("id of F: " + Thread.currentThread().getId());
    }
}


public class Demo {

    public static void main(String[] args) {
        
        ThreadA threadA = new ThreadA();
        threadA.start();

        ThreadB threadB = new ThreadB();
        threadB.start();

        ThreadC threadC = new ThreadC();
        ThreadD threadD = new ThreadD();
        ThreadE threadE = new ThreadE();
        
        threadC.setName("C");
        threadD.setName("D");
        threadE.setName("E");

        threadE.setPriority(Thread.MAX_PRIORITY);
		threadD.setPriority(threadD.getPriority() + 1);
		threadC.setPriority(Thread.MIN_PRIORITY);

        threadC.start();
        threadD.start();
        threadE.start();

        ThreadF threadF = new ThreadF();
        threadF.start();

    }
}

/*
    The argument passed for sleep() is wait time
*/
