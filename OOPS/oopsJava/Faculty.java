package in.kpriet.training.oops;

class Staff {

    void printDetails() {
        System.out.println("I'm staff");
    }

    void printDetails(String name) {
        System.out.println("I'm " + name);
    }

    void printDetails(String name, String dept) {
        System.out.println("I'm " + name + " - " + dept);
    }

    void printDetails(int id) {
        System.out.println("I'm staff with id: " + id);
    }
}

class Faculty extends Staff {

    public static void main(String[] args) {
        
        Faculty faculty = new Faculty();
    
        faculty.printDetails();
        faculty.printDetails("Sudha");
        faculty.printDetails("Sudha", "cse");
        faculty.printDetails(5);

        // faculty.printDetails(5, 6);  // error
    }
}