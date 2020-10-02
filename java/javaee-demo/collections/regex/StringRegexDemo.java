/*
    REQUIREMENTS:
        - To write a program for Java String Regex Methods
        - To print in sentence
            String website = "https-www-google-com";
    ENTITIES:
        - StringRegexDemo
    WORK TO BE DONE:
        - create a string
        - check if the regular expression matches the string or not.
        - split the string into N substrings
        - return a new String with the first match of the regular expression passed as first 
          parameter with the string value of the second parameter
        - return a new String with all matches of the regular expression passed as first parameter
          with the string value of the second parameter
    PSEUDOCODE:
        {
            In the main function

            statement1 = "I love India!"
            matches = statement1.matches(".*India.*")
            print the result

            statement2 = "Oh god beautiful! Oh god beautiful!"
            words = statement2.split(" ")

            for each word in words
                print the word
            
            statement3 = "Hey! I'm a science expert. I love science."
            
            statement4 = statement3.replaceFirst("science", "maths")
            print statement4
            print statement3
            
            statement5 = statement3.replaceAll("science", "maths")
            print statement5

            website = "https-www-google-com"
            webs = website.split("-")

            for each word in webs
                print the word
        }
*/

class StringRegexDemo {

    public static void main(String[] args) {
        
        String statement1 = "I love India!";
        boolean matches = statement1.matches(".*India.*");
        System.out.println(matches);

        String statement2 = "Oh god beautiful! Oh god beautiful!";
        String[] words = statement2.split(" ");
        
        for (String word: words) {
            System.out.println(word);
        }

        String statement3 = "Hey! I'm a science expert. I love science.";
        
        String statement4 = statement3.replaceFirst("science", "maths");
        System.out.println(statement4);
        
        System.out.println(statement3);
        String statement5 = statement3.replaceAll("science", "maths");
        System.out.println(statement5);

        String website = "https-www-google-com";
        String[] webs = website.split("-");
        
        for (String word: webs) {
            System.out.print(word + " ");
        }

    }
}
