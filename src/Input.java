import java.util.Scanner;

public class Input {

	Scanner scan = new Scanner(System.in);
	Main main = new Main();
	
	public Input() {
		System.out.println("Do you want to Tokenize or De-Tokenize?");
		String reply = scan.nextLine();
		if(reply.toLowerCase().contains("tokenize") && !reply.toLowerCase().contains("de")) {
			System.out.println("What would you like to Tokenize?");
			String answer = scan.nextLine();
			main.jumble(main.splitString(answer));
		} else if(reply.toLowerCase().contains("de")) {
			System.out.println("What would you like to De-Tokenize?");
			String answer = scan.nextLine();
			System.out.println("Please provide the Key:");
			String key = scan.nextLine();
			main.deJumble(main.splitString(answer),key);
		} else {
			System.out.println("Reply not recognised.");
		}
		
	}
	
	public static void main(String[] args){
		Input i = new Input();
	}
	
	
}
