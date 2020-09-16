package in.kpriet.training.oops;

interface Staff {
    void printName();
}

interface Mathematician {
    void printQualification();
}

class MathStaff implements Staff, Mathematician {

    public void printName() {
        System.out.println("name");
    }

    public void printQualification() {
        System.out.println("qualification");
    }

    public static void main(String[] args) {
        
        MathStaff mathStaff = new MathStaff();

        mathStaff.printName();
        mathStaff.printQualification();
    }
}
