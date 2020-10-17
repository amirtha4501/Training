/*
	REQUIREMENTS:
		- To write a program to filter the Person, who are male and age greater than 21
		- To write a program to print minimal person with name and email address from the Person class using java.util.Stream<T>
		- To write a program to filter the Person, who are male and
        	-> find the first person from the filtered persons
        	-> find the last person from the filtered persons
        	-> find random person from the filtered persons
    	- To find the sum of all the numbers in the list using java.util.Stream API
    	- To find the maximum of all the numbers in the list using java.util.Stream API
    	- To find the minimum of all the numbers in the list using java.util.Stream API
        - To write a program to collect the minimal person with name and email address from the Person class using java.util.Stream
        - To write a program to find the average age of all the Person in the person List
        - To perform GroupBy, duplicate removal
        - To print all the persons in the roster using java.util.Stream
        - To sort the roster list based on the person's age in descending order using comparator
        - To iterate the roster list in Persons class and and print the person without using forLoop/Stream  
        - To sort the roster list based on the person's age in descending order using java.util.Stream
        - To create the roster from the Person class and add each person in the newRoster to the existing list and print the new roster List
        - To print the number of persons in roster List after the above addition
        - To remove the all the person in the roster list
        - To check if the above person is in the roster list obtained from Person class
        - To remove the only person who are in the newRoster from the roster list
        - To remove the following person from the roster List
    ENTITY:
        - Person
        - PersonService
    METHOD SIGNATURE:
        - static List<Person> filterPersons(List<Person> persons)
        - static void mapPersons(List<Person> persons)
        - static void finder(List<Person> persons)
        - static void calculator()
        - static void collectPersons(List<Person> persons)
        - static void avgReducer(List<Person> persons)
        - static void grpByAndDistinct()
        - static void sortPersons(List<Person> persons)
        - static void personIterator(List<Person> persons)
        - static List<Person> createNewRoster(List<Person> persons)
        - static void addToRoster(List<Person> persons, List<Person> newRosters)
        - static void removeFromRoster(List<Person> persons, List<Person> newRosters)
        - static void isContains(List<Person> persons)
*/

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;


public class PersonService {
	  
	static List<Person> filterPersons(List<Person> persons) {
		
		List<Person> filteredPersons = persons
				  .stream()
				  .filter(person -> person.getAge() > 21 && person.getGender().toString() == "MALE")
				  .collect(Collectors.toList());
		
		return filteredPersons;
	}
	
	static void mapPersons(List<Person> persons) {
		Map<String, String> map = new HashMap<String, String>();  
		for (Person person: persons) {			
			map.put(person.getName(), person.getEmailAddress());  
		}
		
		System.out.println("\nMap");
		
		for (Entry<String, String> m: map.entrySet()) {  
		   System.out.println(m.getKey()+" "+m.getValue());  
		}
	}
	
	static void finder(List<Person> persons) {
		Person filteredFirstPerson = persons
				  .stream()
				  .filter(person -> person.getGender().toString() == "MALE")
				  .findFirst()
                  .get();
		System.out.println("\nfilteredFirstPerson: " + filteredFirstPerson.getName());
		
		Person filteredLastPerson = persons
				  .stream()
				  .filter(person -> person.getGender().toString() == "MALE")
				  .findAny()
				  .orElse(persons.get(persons.size() - 1));
		System.out.println("\nfilteredLastPerson: " + filteredLastPerson.getName());
	}

	static void calculator() {
		List<Integer> randomNumbers = Arrays.asList(1, 6, 10, 25, 78);
		
		 IntSummaryStatistics stats = randomNumbers.stream()
                 .mapToInt((x) -> x)
                 .summaryStatistics();
		 System.out.println("sum: " + stats.getSum());
		 System.out.println("max: " + stats.getMax());
		 System.out.println("min: " + stats.getMin());
	}
	
	static void collectPersons(List<Person> persons) {
		List<String> names = persons.stream() 
                .map(person -> person.getName()) 
                .collect(Collectors.toList());
		System.out.println(names);         
	}
	
	static void avgReducer(List<Person> persons) {
		double average = persons
			    .stream()
			    .filter(p -> p.getGender() == Person.Sex.MALE)
			    .mapToInt(Person::getAge)
			    .average()
			    .getAsDouble();
		System.out.println(average);
	}
	
	static void grpByAndDistinct() {
		List<Integer> randomNumbers = Arrays.asList(1, 6, 10, 1, 25, 78, 10, 25);
		System.out.println("randomNumbers: " + randomNumbers); 
		List<Integer> uniqueRandomNumbers = randomNumbers
												  .stream() 
												  .distinct() 
											      .collect(Collectors.toList()); 
		System.out.println("\nrandomNumbers without duplicates: " + uniqueRandomNumbers);
		
		Map<Integer, Long> grpBy = randomNumbers
										.stream()
										.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("\n" + grpBy);
	}
	
	static void sortPersons(List<Person> persons) {
		persons.sort((Person person1, Person person2)-> person2.getAge() - person1.getAge());
		persons.forEach((person) -> System.out.println(person.getName() + ", " + person.getAge()));
	}
	
	static void personIterator(List<Person> persons) {
		Iterator<Person> itr = persons.iterator();
		System.out.println("\nIterator");
		while (itr.hasNext()) {
			System.out.println(itr.next().getName());
		}
	}
	
	static List<Person> createNewRoster(List<Person> persons) {
        List<Person> newRoster = new ArrayList<>();
        
        newRoster.add(
            new Person(
            "John",
            IsoChronology.INSTANCE.date(1980, 6, 20),
            Person.Sex.MALE,
            "john@example.com"));
        
        newRoster.add(
            new Person(
            "Jade",
            IsoChronology.INSTANCE.date(1990, 7, 15),
            Person.Sex.FEMALE, "jade@example.com"));
        
        newRoster.add(
            new Person(
            "Donald",
            IsoChronology.INSTANCE.date(1991, 8, 13),
            Person.Sex.MALE, "donald@example.com"));
        
        newRoster.add(
            new Person(
            "Bob",
            IsoChronology.INSTANCE.date(2000, 9, 12),
            Person.Sex.MALE, "bob@example.com"));
        
        System.out.println("\nNew Roster created");
        return newRoster;
	}
	
	static void addToRoster(List<Person> persons, List<Person> newRosters) {
		persons.addAll(newRosters);
		System.out.println("\nRoster after addition");
		persons.stream().forEach(person -> System.out.println(person.getName() + ", " + person.getEmailAddress()));
		
		persons.removeAll(newRosters);
		System.out.println("\nRoster after deletion");
		persons.stream().forEach(person -> System.out.println(person.getName() + ", " + person.getEmailAddress()));	
	}
	
	static void removeFromRoster(List<Person> persons, List<Person> newRosters) {
		persons.removeAll(newRosters);
		System.out.println("\nRoster after deletion");
		persons.stream().forEach(person -> System.out.println(person.getName() + ", " + person.getEmailAddress()));	

		persons.remove(new Person(
	            "Bob",
	            IsoChronology.INSTANCE.date(2000, 9, 12),
	            Person.Sex.MALE, "bob@example.com"));
		persons.stream().forEach(person -> System.out.println(person.getName() + ", " + person.getEmailAddress()));
	}
	
	static void isContains(List<Person> persons) {
		
		boolean isPresent = persons.contains(new Person(
            "Bob",
            IsoChronology.INSTANCE.date(2000, 9, 12),
            Person.Sex.MALE, 
            "bob@example.com"));
		System.out.println("\nisPresent: " + isPresent);
	}
	
	public static void main(String[] args) {

		// create roster
		List<Person> persons = Person.createRoster();
		
		// print all persons using foreach
		System.out.println("\nPersons using stream foreach");
		persons.stream().forEach(person -> System.out.println(person.getName()));
		
		// get filtered persons
		List<Person> filteredPersons = filterPersons(persons);
		for (Person filteredPerson: filteredPersons) {
			System.out.println("\n" + filteredPerson.name + ", " + filteredPerson.getAge());
			System.out.println(filteredPerson.getGender());
			System.out.println(filteredPerson.getEmailAddress());
		}
		
		// print persons email with name using map
		mapPersons(persons);  
		
		// person from the filtered persons
		finder(persons);
		
		// prints sum, min, max in a list
		calculator();
		
		collectPersons(persons);
		
		// avg age
		avgReducer(persons);
		
		// GroupBy, duplicate removal
		grpByAndDistinct();
		
		sortPersons(persons);
		
		personIterator(persons);
		
		// create elements to the rosters
		List<Person> newRosters = createNewRoster(persons);
		
		addToRoster(persons, newRosters);
		
		isContains(persons);
	}
}
