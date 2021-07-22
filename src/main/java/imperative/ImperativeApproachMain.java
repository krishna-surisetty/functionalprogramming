package imperative;

import java.util.ArrayList;
import java.util.List;

public class ImperativeApproachMain {
	
	public static void main(String[] args) {
		
		List<Person> persons = List.of(
				new Person("Krishna", Gender.MALE),
				new Person("Sai", Gender.FEMALE),
				new Person("Durga", Gender.FEMALE),
				new Person("Siva", Gender.MALE),
				new Person("Vyshnavi", Gender.FEMALE));
		
		// Imperative approach
		
		List<Person> females = new ArrayList<>();
		
		for(Person person : persons) {
			if(Gender.FEMALE.equals(person.gender)) {
				females.add(person);
			}
		}
		
		for(Person female : females) {
			System.out.println(female);
		}
			
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
