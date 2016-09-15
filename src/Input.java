import java.util.Scanner;

public class Input {

	Scanner scan = new Scanner(System.in);
	Main main = new Main();
	
	public Input() {
		System.out.println("Do you want to Tokenize or De-Tokenize?");
		String reply = scan.nextLine();
		if(reply.toLowerCase().contains("tokenize")) {
			System.out.println("What would you like to Tokenize?");
			String answer = scan.nextLine();
			Main.jumble(Main.splitString(answer));
		} else if(reply.toLowerCase().contains("de")) {
			System.out.println("What would you like to De-Tokenize?");
			String answer = scan.nextLine();
			Main.deJumble(Main.splitString(answer));
		} else {
			System.out.println("Reply not recognised.");
		}
		
	}
	
	public static void main(String[] args){
		Input i = new Input();
	}
	
	
}
