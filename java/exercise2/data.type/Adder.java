/*
    REQUIREMENTS:
        - To add command line arguments of type int
    ENTITY: 
        - Adder
    WORK TO BE DONE:
        - check if the length of the argument is greater than 1
            if yes, then iterate through the each element and convert it to int type and add to the variable sum
            else display error message 
*/

package in.kpriet.training.java.data.type;

class Adder {

    public static void main(String[] args) {    

        int sum = 0;

        if (args.length > 1) {
            for (String i: args) {
                sum += Integer.parseInt(i);
            }
            System.out.println(sum);
        } else {
            System.out.println("Enter more than 1 argument");
        }
    }
}
