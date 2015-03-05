import java.io.Console;

public class yellow {
	
	public static void main(String[] args) {
		Console console = System.console();
		// console if the cammand to print to the screen
		String firstName = console.readLine("what is your name?  "); //this get input (io)
		console.printf("hello, my name is %s\n", firstName);
		console.printf("hello, my name is %s\n", firstName);
	}
}