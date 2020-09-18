/*
    REQUIREMENTS:
        - To write a generic method to find the maximal element in the range [begin, end) of a list.
    ENTITIES:
        - MaxFinder
    METHOD SIGNATURE:
        - static <T extends Comparable> T getMaximum(List<? extends T> numbers, int fromIndex, int endIndex)
    WORK TO DONE:
        - create class MaxFinder.
*/

import java.util.List;
import java.util.ArrayList;

class MaxFinder {

    static <T extends Comparable> T getMaximum(List<? extends T> numbers, int fromIndex, int endIndex) {

        T maximumValue = numbers.get(fromIndex);

        for (++fromIndex; fromIndex < endIndex; ++fromIndex) {
            if (maximumValue.compareTo(numbers.get(fromIndex)) < 0) {
                maximumValue = numbers.get(fromIndex);
            }
        }
        return maximumValue;
    }

    public static void main(String[] args) {

        List numbers = new ArrayList();

        numbers.add(1);
        numbers.add(10);
        numbers.add(8);
        numbers.add(5);

        System.out.println(getMaximum(numbers, 1, 4));
    }
}
