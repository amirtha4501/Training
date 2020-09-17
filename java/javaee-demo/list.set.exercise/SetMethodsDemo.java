import java.util.Set;
import java.util.HashSet;

class SetMethodsDemo {

    public static void main(String[] args) {
        
        Set<Integer> values = new HashSet<>();

        System.out.println("values list empty - " + values.isEmpty());

        for(int i = 3; i < 8; i++) {
            values.add(i + 1);
        }
        
        System.out.println("values list empty - " + values.isEmpty());

        boolean contains1 = values.contains(1);
        boolean contains6 = values.contains(6);

        System.out.println("values list contains 1? " + contains1);
        System.out.println("values list contains 6? " + contains6);

    }
}

/*
    .contains() - checks whether the set contains the specified element or not.
                  If yes, prints true. Else, false.
    .isEmpty() - checks whether the set is empty or not.
                 If empty, prints true. Else, false.
*/
