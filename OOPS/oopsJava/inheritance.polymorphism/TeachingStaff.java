package in.kpriet.training.oops;

class Staff {

    void printDetails() {
        System.out.println("I'm a staff");
    }

    static void printWork() {
        System.out.println("Work of staff");
    }
}

class TeachingStaff extends Staff {

    void printDetails() {
        System.out.println("I'm a teaching staff");
    }

    static void printWork() {
        System.out.println("Work of Teacher");
    }

    public static void main(String[] args) {
        
        TeachingStaff teachingStaff = new TeachingStaff();

        teachingStaff.printDetails();
        teachingStaff.printWork(); // hides the parent's method instead overriding
    }
}