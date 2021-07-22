package declarative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DeclarativeApproachMain {
	public static void main(String[] args) {

		List<Person> persons = List.of(
				new Person("Krishna", Gender.MALE),
				new Person("Sai", Gender.FEMALE),
				new Person("Durga", Gender.FEMALE),
				new Person("Siva", Gender.MALE),
				new Person("Vyshnavi", Gender.FEMALE));
		
		// Declarative approach
		
		persons.stream()
			.filter(person -> Gender.FEMALE.equals(person))
			.collect(Collectors.toList())
			.forEach(System.out::println);;
		
		
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
