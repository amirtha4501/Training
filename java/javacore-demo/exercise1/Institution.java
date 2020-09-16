package in.kpriet.training.java.core2;

import in.kpriet.training.java.core1.Staff;

class Institution {

    public static void main(String[] args) {
        
        // can't initiate Default constructor 
        // Staff staffDefault = new Staff();
        // staffDefault.showStaff("default");
        
        // can't initiate Private constructor
        // Staff staffPrivate = new Staff("Key from Institution", 4);
        // staffPrivate.showStaff("private");
        
        // can't initiate call Protected constructor
        // Staff staffProtected = new Staff("Dept from Institution");
        // staffProtected.showStaff("protected");
        
        // call Public constructor
        Staff staffPublic = new Staff(4, "from Institution");
        staffPublic.showStaff("public");
        
        // access specifiers - properties
        Staff staff = new Staff(100);
        // System.out.println("default - " + staff.staffId);
        // System.out.println("private - " + staff.secretKey);
        // System.out.println("protected - " + staff.departmentName);
        System.out.println("public - " + staff.staffName);        
    }
}
