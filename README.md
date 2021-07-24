# Description file


## Imperative programming -- How you want to do

In simple terms, if me as a developer define every single detail about my implementation - then it is iterative programming

Consider the example of class MainOne
Here we defined a inner static class Person and Enum Gender and added a few details of persons

Now i want to see the details of people who are FEMALE. So I sorted out the the people who are female by iterating over all persons and checking the condition of Gender to Female. Now to print those details to console I am again iterating over the sorted list to print each detail


		for(Person person : persons) {
			if(Gender.FEMALE.equals(person.gender)) {
				females.add(person);
			}
		}
		
		for(Person female : females) {
			System.out.println(female);
		}
		

## Declarative Approach -- What you want to do

It is a way in which express desired results without specifying how the implementation is going to be

Consider MainOne class

		persons.stream()
			.filter(person -> Gender.FEMALE.equals(person.gender))
			.forEach(System.out::println);
			

Here we are sending data as stream and filter out the data based on our Predicate (condition that return boolean) and printing out the result to console

NOTE - Nowhere we specified how the iteration of data is going to be. All we did is state what we expect the code to behave
		
