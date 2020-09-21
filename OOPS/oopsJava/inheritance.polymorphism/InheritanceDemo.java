package in.kpriet.training.oops;

class Person {
    String name;

    Person() {
        this.name = "ammu";
    }
}

class Staff extends Person {
    
    String role;

    Staff() {
        this.role = "Staff - general";
    }

    void printRole() {
        System.out.println(role);
        System.out.println(name);
    }
}

class ScienceStaff extends Staff {

    ScienceStaff() {
        this.role = "Staff - science";
    }
}

class MathStaff extends Staff {

    MathStaff() {
        this.role = "Staff - math";
    }
}

class InheritanceDemo {

    public static void main(String[] args) {
        
        Staff staff = new Staff();
        ScienceStaff scienceStaff = new ScienceStaff();
        MathStaff mathStaff = new MathStaff();
        
        // Staff scienceStaff = new ScienceStaff(); will also work
        // Staff mathStaff = new MathStaff();

        staff.printRole();
        scienceStaff.printRole();
        mathStaff.printRole();   
    }
}
