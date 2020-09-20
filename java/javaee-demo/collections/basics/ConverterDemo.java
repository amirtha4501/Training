import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.stream.Collectors;

class ConverterDemo
{
	// Generic function to construct a new LinkedList from ArrayList
	public static <T> List<T> getInstance(List<T> arrayList)
	{
		List<T> linkedList = new LinkedList<>();

		for (T e: arrayList)
			linkedList.add(e);

		return linkedList;
	}

	// Program to convert ArrayList to LinkedList in Java
	public static void main(String args[])
	{
		List<String> arrayList = Arrays.asList("RED", "BLUE", "GREEN");

		// construct a new LinkedList from ArrayList
		List<String> linkedList = getInstance(arrayList);
		System.out.println(linkedList);
	}

    // Construct a new LinkedList<String> from ArrayList<Integer>
    public static List<String> getInstance(List<Integer> arrayList)
    {
        List<String> linkedList = new LinkedList<>();

        for (Integer i: arrayList)
            linkedList.add(String.valueOf(i));

        return linkedList;
    }

    // Generic function to construct a new LinkedList from ArrayList
    public static <T> List<T> getInstance(List<T> arrayList)
    {
        return arrayList.stream()
                        .collect(Collectors.toCollection(LinkedList::new));;
    }

    // Generic function to construct a new LinkedList from ArrayList
    public static <T> List<T> getInstance(List<T> arrayList)
    {
        List<T> linkedList = Lists.newLinkedList();
        linkedList.addAll(arrayList);

        return linkedList;
    }
}
