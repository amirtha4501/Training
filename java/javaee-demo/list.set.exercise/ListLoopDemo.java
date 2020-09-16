import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class ListLoopDemo {

    public static void main(String[] args) {
        
        List<String> names = new ArrayList<String>();

        names.add("Ammu");
        names.add("Jimmu");
        names.add("Pappu");
        names.add("Appu");
        names.add("Ammu");

        System.out.println("\nFor loop");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }

        System.out.println("\n\nEnhanced for loop");
        for (String name: names) {
            System.out.print(name + " ");
        }

        System.out.println("\n\nIterator");
        for (Iterator<String> name = names.iterator(); name.hasNext();) {
            System.out.print(name.next() + " ");
        }

        System.out.println("\n\nUsing stream");
        names.stream().forEach((name) -> System.out.print(name + " "));
    }
}