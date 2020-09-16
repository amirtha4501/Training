import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

class ListSetDemo {

    public static void main(String[] args) {
        
        List<String> chocolatesList = new ArrayList<>();

        chocolatesList.add("Milky bar");
        chocolatesList.add("Guava");
        chocolatesList.add("Dairy Milk");
        chocolatesList.add("Kopiko");
        chocolatesList.add("Guava");

        Set<String> chocolatesSet = new HashSet<>();
        chocolatesSet.addAll(chocolatesList);

        for (String chocky: chocolatesList) {
            System.out.print(chocky + " ");
        }

        System.out.println();

        for (String chocky: chocolatesSet) {
            System.out.print(chocky + " ");
        }
    }
}