/*
    REQUIREMENTS:
        - To write a program to display the following using escape sequence in java
            -> My favorite book is "Twilight" by Stephanie Meyer
            -> She walks in beauty, like the night, 
               Of cloudless climes and starry skies 
               And all that's best of dark and bright 
               Meet in her aspect and her eyes…
            -> "Escaping characters"
    ENTITIES:
        - EscapeSequenceDemo
    WORK TO BE DONE:
        - create strings
        - use escape characters
    PSEUDOCODE:
        {
            In the main function

            create string1 with a text to demonstrate ""
            create string2 with a text to demonstrate \t\n..
            create string3 with escaping characters

            print string1
            print string2
            print string3
        }
*/

class EscapeSequenceDemo {

    public static void main(String[] args) {
        
        String string1 = "My favorite book is \"Twilight\" by Stephanie Meyer";
        String string2 = "\tShe walks in beauty, like the night, \n\tOf cloudless climes and starry skies \n\tAnd all that's best of dark and bright \n\tMeet in her aspect and her eyes…";
        String string3 = "\"Escaping characters\"";

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
    }
}