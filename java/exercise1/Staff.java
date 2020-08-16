package in.kpriet.training.java.core1;

public class Staff {
    
    int staffId;
    private String secretKey;
    protected String departmentName;
    public String staffName;
    
    // Default constructor
    Staff() {
        staffId = -1;   
        secretKey = "top secret";
        departmentName = "administration";
        staffName = "admin";
    }
    
    // Private constructor
    private Staff(String key, int id) {
        secretKey = key;
        staffId = id;
    }
    
    // Protected constructor
    protected Staff(String department) {
        departmentName = department;
    }
    
    // Public constructor
    public Staff(int id, String name) {
        staffId = id;
        staffName = name;
    }
    
    public Staff(int num) {
    }
    
    public void showStaff(String consType) {
        System.out.println("From " + consType + " constructor \n" + "staffId: " + staffId);
        System.out.println("secretKey: " + secretKey);
        System.out.println("departmentName: " + departmentName);
        System.out.println("staffName: " + staffName + "\n");
    }
    
    public static void main(String[] args) {
    
        // call Default constructor
        Staff staffDefault = new Staff();
        staffDefault.showStaff("Default");
        
        // call Private constructor
        Staff staffPrivate = new Staff("staffKey", 1);
        staffPrivate.showStaff("Private");
        
        // call Protected constructor
        Staff staffProtected = new Staff("staffDepartment");
        staffProtected.showStaff("Protected");
        
        // call Public constructor
        Staff staffPublic = new Staff(1, "staffName");
        staffPublic.showStaff("Public");
        
        // access specifiers - properties
        Staff staff = new Staff(100);
        System.out.println("default - " + staff.staffId);
        System.out.println("private - " + staff.secretKey);
        System.out.println("protected - " + staff.departmentName);
        System.out.println("public - " + staff.staffName);
    }   
}
