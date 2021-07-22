# Description file


## Imperative programming

In simple terms, me as a developer define every single detail about my implementation

Consider the example of class ImperativeApproachMain
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
		

		
