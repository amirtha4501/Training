package in.kpriet.training.java.core1;

import in.kpriet.training.java.core1.Staff;

class Faculty extends Staff {
    
    public static void main(String[] args) {
        
        // call Default constructor 
        Staff staffDefault = new Staff();
        staffDefault.showStaff("default");
        
        // Child can't initiate Private constructor
        // Staff staffPrivate = new Staff("facultyKey", 2);
        // staffPrivate.showStaff("private");
        
        // call Protected constructor
        Staff staffProtected = new Staff("facultyDepartment");
        staffProtected.showStaff("protected");
        
        // call Public constructor
        Staff staffPublic = new Staff(2, "facultyName");
        staffPublic.showStaff("public"); 

        // access specifiers - properties
        Staff staff = new Staff(100);
        System.out.println("default - " + staff.staffId);
        // System.out.println("private - " + staff.secretKey);
        System.out.println("protected - " + staff.departmentName);
        System.out.println("public - " + staff.staffName);        
    }
}
