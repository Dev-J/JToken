import java.util.Random;

public class Main {
	//key is digits of pi after the '.'
	//private static final String KEY = "1415926535897932384626333832795028841971693993751058209749445923"; //first 63 digits
	private static String KEY;
	private static final String ALPHABET = "RUXi9EKzAM1lqPB3gDhaSyvH8ZVLO6cNJtY0k4wTC7sbfI5uQendxoWrpF2mGj "; //a-z 0-9 A-Z and a space (the space has to be at the end)
	private static String toTokenize = "";
	private static String tokenized = "";
	private static String toDeTokenize = "";
	private static String deTokenized = "";
	
	public Main() {
		
	}
	
	public static char[] splitString(String s) {
		toTokenize = s;
		toDeTokenize = s;
		char[] ca = s.toCharArray();
		return ca;
	
	}
	
	public static void jumble(char[] ca) {
        KEY = genKey(ca.length);
		int length = ca.length;
		char[] newKey = KEY.substring(0, length).toCharArray(); //generates a key the same length as the letters in the message
		char[] abc = ALPHABET.toCharArray();
		
		int x = 0;
		while(x < ca.length) {
			int y = 0;
			while(abc[y] != ca[x]) {	
				y++;
			}
					
			int newKeyNum = Character.getNumericValue(newKey[x]);
			int locationNewChar = y + newKeyNum;
			
			if((locationNewChar) >=63) {
				  locationNewChar = locationNewChar - 63; //amount of characters in abc
			}
			
			char newChar = abc[locationNewChar];
			x++;	
			
			tokenized = tokenized + newChar;
		}
		
		System.out.println("Tokenized value of " + "'" + toTokenize + "'" + " is '" + tokenized + "'.");
		
		int z = 0;
		String newKeyString = "";
		while(z < newKey.length) {
			newKeyString = newKeyString + Character.getNumericValue(newKey[z]);
			z++;
		}
		
		System.out.println("The key used to tokenize is " + newKeyString + ".");
	}
	
	
	public void deJumble(char[] toDeJumble, String KEY) {
	    this.KEY = KEY;
		char[] abc = ALPHABET.toCharArray();
		int length = toDeJumble.length;
		char[] newKey = KEY.substring(0, length).toCharArray(); //generates a key the same length as the letters in the message
		int x = 0;
		while(x < toDeJumble.length) {
			
			int y = 0;
			while(abc[y] != toDeJumble[x]) {
				y++;
			}
						
			int newKeyNum = Character.getNumericValue(newKey[x]);
			int locationNewChar = y - newKeyNum;
			
			if((locationNewChar) < 0) {
				  locationNewChar = locationNewChar + 63;
			}
			
			char newChar = abc[locationNewChar];
			x++;	
			
			deTokenized = deTokenized + newChar;
		}
		
		
		System.out.println("De-Tokenized value of " + "'" + toDeTokenize + "'" + " is '" + deTokenized + "'.");
		
		int z = 0;
		String newKeyString = "";
		while(z < newKey.length) {
			newKeyString = newKeyString + Character.getNumericValue(newKey[z]);
			z++;
		}
		
		System.out.println("The key used to De-Tokenize is " + newKeyString + ".");
	}

	protected static String genKey(int length) {
		String SALTCHARS = "1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < length) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;

	}
		
}


