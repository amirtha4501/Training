package in.kpriet.training.java.innerclass;

class Employee { 

    void viewEmployee() { 
        System.out.println("I'm employee of base class"); 
    } 
} 

class Company { 

    // An anonymous class with Employee as base class 
    static Employee employee = new Employee() { 
        
        void viewEmployee() { 
            super.viewEmployee(); 
            System.out.println("I'm employee of derived class"); 
        } 
    };
    
    public static void main(String[] args){ 
    
        employee.viewEmployee(); 
    } 
}
