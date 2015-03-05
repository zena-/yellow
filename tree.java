import java.io.Console;

public class tree {
	public static void main(String[] args) {
		Console console = System.console();
		/* some terms:
			noun - person place thing
			verb - action 
			adjective - description used to modify or describe a noun

		*/
			// String name = console.readLine("enter your name:  ");
			// String adjective = console.readLine("enter your adjective:  ");
			// console.printf("%s is very %s", name, adjective);

		String ageAsString = console.readLine("how old are you?  ");
		int age = Integer.parseInt(ageAsString);
		if (age<13) {
				console.printf("sorry must be over 12");
				System.exit(0);
			}	

		String name = console.readLine("Enter a name:  ");
		String adjective = console.readLine("Enter an adjective:  ");
		String noun;
		boolean isInvalidWord;
		// if anything is in scoop, do dox, it cant be used outside the box, so you have to say it first
		do {
			 noun = console.readLine("Enter a noun:  ");
			 isInvalidWord = (noun.equalsIgnoreCase("dork") || noun.equalsIgnoreCase("jerk"));
			// if (noun.equals("dork")) {
			// 	console.printf("now cool man. bye. \n\n");
			// 	System.exit(0);
			// }
				if (isInvalidWord) {
					console.printf("now cool man. try again. \n\n");
					// System.exit(0);
				}
		} while (isInvalidWord); 

		String adverb = console.readLine("Enter an adverb:  ");
		String verb = console.readLine("Enter a verb ending with -ing:  ");	
		
		console.printf("your story:\n--------\n");
		console.printf("%s is a %s %s.   ", name, adjective, noun);
		console.printf("they are always %s %s.\n", adverb, verb);	
	}
}

// .contains is use to see if something is within the first thing and its case senative,, the booleancomes back true or false
