package in.kpriet.training.java.innerclass;

// Outer class
class Student {
    
    String name;
    
    Student() {
        name = "Ammu";
    }
    
    void getRecords() {
        int rollNo = 5;
        System.out.println("Outer class " + name + "'s record: ");
        
        // Method local inner class
        class SemesterResult {
        
            int maths;
            int physics;
            int chemistry;
            
            SemesterResult() {
                maths = 100;
                physics = 80;
                chemistry = 90;
            }
            
            void calculateGPA() {
                System.out.println("Rollno " + rollNo + " " + name);
                System.out.println("GPA from innerclass SemesterResult is " + ((maths + physics + chemistry) / 3) );
            }
        }
        
        SemesterResult semRes = new SemesterResult();
        semRes.calculateGPA();
    }
}

class College {
    
    public static void main(String[] args) {
    
        Student student = new Student();
        student.getRecords();
        
        /* It is not possible to instantiate method local inner class from outside
            SemesterResult semResult = new SemesterResult();
            semResult.calculateGPA();
        */
    }
}
