/*
    REQUIREMENTS:
        - To implement the CharSequence interface
    ENTITY: 
        - CharSeqDemo
    WORK TO BE DONE:
        - create a method called fromEnd with a int parameter which returns the index in reverse order
        - create a method called charAt with int parameter that checks that the int is valid for the string or not
            if not, it throws exception
            if yes, it calls fromEnd method 
        - create a method called subSequence with two int parameters representing start and end index
            check if the start and end index are not valid, throw exception
            else give such values to the method with fromEnd method for the index
            return the reversed string
    METHOD SIGNATURE:
        - private int fromEnd(int i);
        - public char charAt(int i);
        - public int length();
        - public CharSequence subSequence(int start, int end);
        - public String toString();
        - private static int random(int max);
    
    -- referred from internet
*/

package in.kpriet.training.java.interfaces;

class CharSeqDemo implements CharSequence {
    private String s;

    public CharSeqDemo(String s) {
        this.s = s;
    }

    private int fromEnd(int i) {
        return s.length() - 1 - i;
    }

    public char charAt(int i) {
        if ((i < 0) || (i >= s.length())) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return s.charAt(fromEnd(i));
    }

    public int length() {
        return s.length();
    }

    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }

        if (end > s.length()) {
            throw new StringIndexOutOfBoundsException(end);
        }

        if (start > end) {
            throw new StringIndexOutOfBoundsException(start - end);
        }

        StringBuilder sub = new StringBuilder(s.subSequence(fromEnd(end), fromEnd(start)));
        return sub.reverse();
    }

    public String toString() {
        StringBuilder s = new StringBuilder(this.s);
        return s.reverse().toString();
    }

    private static int random(int max) {
        return (int) Math.round(Math.random() * (max+1));
    }

    public static void main(String[] args) {
        CharSeqDemo s = new CharSeqDemo("Hello there! Have a nice day");

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        
        System.out.println("");

        int start = random(s.length() - 1);
        int end = random(s.length() - 1 - start) + start;
        System.out.println(s.subSequence(start, end));

        System.out.println(s);
    }
}
