package in.kpriet.training.java.core1;

class Person {
    
    public static void main(String[] args) {
       
        // call Default constructor 
        Staff staffDefault = new Staff();
        staffDefault.showStaff("default");
        
        // can't initiate Private constructor
        // Staff staffPrivate = new Staff("personKey", 3);
        // staffPrivate.showStaff("private");
        
        // call Protected constructor
        Staff staffProtected = new Staff("personDepartment");
        staffProtected.showStaff("protected");
        
        // call Public constructor
        Staff staffPublic = new Staff(3, "personName");
        staffPublic.showStaff("public"); 

        // access specifiers - properties
        Staff staff = new Staff(100);
        System.out.println("default - " + staff.staffId);
        // System.out.println("private - " + staff.secretKey);
        System.out.println("protected - " + staff.departmentName);
        System.out.println("public - " + staff.staffName);                
    }
}
