/*
    REQUIREMENTS:
        - To write a Java program to demonstrate schedule method calls of Timer class
    ENTITIES:
        - Converter
        - Printer
    METHOD SIGNATURE:
        - public void run();
    WORK TO BE DONE:
        - instantiate the Timer class
        - calculate the start time
        - instantiate TimerTask class
        - call schedule method with run method, start time and delay
        - calculate the end time
        - print the statement with time in milli seconds
    PSEUDOCODE:
        class Printer extends TimerTask {
            Printer(start) {
                this.start = start
            }

            function run {
                get end time 
                get duration between start and end
                print values
            }
        }

        {
            In the main function

            get timer instance
            get start time
            give start time to printer class
            invoke schedule method
        }
*/

import java.util.Timer; 
import java.util.TimerTask; 
import java.time.Duration;
import java.time.Instant;

class Printer extends TimerTask {

    Instant start;
    
    Printer(Instant start) {
        this.start = start;
    }

    public void run() {
        Instant end = Instant.now();
        System.out.println("I'm printing");
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
    }
}


class TimerDemo {

    public static void main(String[] args) {
                  
        Timer timer = new Timer(); 

        Instant start = Instant.now();
        TimerTask printer = new Printer(start);

        timer.schedule(printer, 2000, 2999);
    }
}
