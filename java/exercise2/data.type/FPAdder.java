/*
    REQUIREMENTS:
        - To add command line arguments of type float
    ENTITY: 
        - FPAdder
    WORK TO BE DONE:
        - check if the length of the argument is greater than 1
            if yes, then iterate through the each element and convert it to float type and add to the variable sum
            else display error message 
*/

package in.kpriet.training.java.data.type;

class FPAdder {

    public static void main(String[] args) {    

        float sum = 0;

        if (args.length > 1) {
            for (String i: args) {
                sum += Float.parseFloat(i);
            }
            System.out.println(String.format("%.2f", sum));
        } else {
            System.out.println("Enter more than 1 argument");
        }
    }
}
