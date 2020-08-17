package in.kpriet.training.java.innerclass;

interface College { 

    void getCollege(); 
} 

class University { 
  
    // An anonymous class that implements College interface 
    static College college = new College() { 
        public void getCollege() { 
            System.out.println("KPRIET from anonymous class"); 
        } 
    }; 
  
    public static void main(String[] args) {
        
        college.getCollege(); 
    } 
} 
/* 
   It doesn't have a constructor
   Annonymous class can either extend a class or implement interface at a time.
*/
  