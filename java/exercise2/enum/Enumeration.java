/*
    REQUIREMENTS:
        - compare the enum values using equal method and == operator
    ENTITY: 
        - Enumeration
        - Status (enum)
    WORK TO BE DONE:
        - compare two enum's value with '==' operator and equals method
        - compare enum's value with null 
*/

enum Status {
    STARTED,
    ONGOING,
    FINISHED
}

enum Progress {
    STARTED,
    ONGOING,
    FINISHED
}

class Enumeration {
    public static void main(String[] args) {

      /* error: incomparable types: Status and Progress
        System.out.println("Status.STARTED == Status.STARTED is : " + (Status.STARTED == Progress.STARTED));
      */
        System.out.println("Status.STARTED.equals(Status.STARTED) is : " + (Status.STARTED.equals(Progress.STARTED)));
  
        Status status = null;
        System.out.println("status == FINISHED is : " + (status == Status.FINISHED));
      /* Throws null pointer exception  
        System.out.println("status.equals(Status.FINISHED) is : " + (status.equals(Status.FINISHED)));
      */
    }
}

/* 
    equals method: 
        - throws null pointer exception 
        - ignores type compatibility check
    '==' operator:
        - checks type compatibility at compile time
        - doesn't throw any exception
*/
