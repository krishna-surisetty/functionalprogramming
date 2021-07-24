package imperativeanddeclarative;

import java.util.ArrayList;
import java.util.List;


public class MainOne {
	
	public static void main(String[] args) {
		
		List<Person> persons = List.of(
				new Person("Krishna", Gender.MALE),
				new Person("Sai", Gender.FEMALE),
				new Person("Durga", Gender.FEMALE),
				new Person("Siva", Gender.MALE),
				new Person("Vyshnavi", Gender.FEMALE));
		
		// Imperative approach
		
		System.out.println("Imperative Approach");
		
		List<Person> females = new ArrayList<>();
		
		for(Person person : persons) {
			if(Gender.FEMALE.equals(person.gender)) {
				females.add(person);
			}
		}
		
		for(Person female : females) {
			System.out.println(female);
		}
	
	
		// Declarative approach
		System.out.println("Declarative Approach");
		
		persons.stream()
			.filter(person -> Gender.FEMALE.equals(person.gender))
			.forEach(System.out::println);
			
	}
	
	static class Person {
		private final String name;
		private final Gender gender;
		
		Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
		
	}
	
	enum Gender {
		MALE, FEMALE;
	}
	
}
