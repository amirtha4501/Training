/*
    REQUIREMENTS:
        - To print the initial letter of a name
    ENTITY: 
        - InitialsDemo 
    METHOD SIGNATURE:
        - showInitials()
    WORK TO BE DONE:
        - Iterate through the letters of the name if its length is not empty
        - Check if there is a space in between the name, then print the letter
*/

package in.kpriet.training.java.stringsdemo;

class InitialsDemo {

    void showInitials(String name) {      
        
        String myInitial = Character.toString(name.charAt(0));  
        
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                myInitial = myInitial + Character.toString(name.charAt(i + 1));
            }
        }
        System.out.println(myInitial);
    }

    public static void main(String[] args) {

        Initial i = new Initial();
        i.showInitials("Anu Radha");
    }
}
