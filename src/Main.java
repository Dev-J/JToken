//Version 0.1
//Currently does not support punctuation/spaces
//Only supports Strings
//Does not currently support numerical values
//To increase the amount of characters it can tokenize use more values of pi. (currently set to 64)

public class Main {
	//key is digits of pi after the '.'
	private static final String KEY = "1415926535897932384626433832795028841971693993751058209749445923"; //first 64 digits
	private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String toTokenize = "jack";
	private static String tokenized = "";
	private static String toDeTokenize = "KEDP";
	private static String deTokenized = "";
	
	public static void main(String[] args) {
		
		jumble(splitString(toTokenize));
		deJumble(splitString(toDeTokenize));

	}
	
	public static char[] splitString(String s) {
		String sUpper = s.toUpperCase();
		char[] ca = sUpper.toCharArray();
		/*int i = 0;
		while(i < ca.length) {
			System.out.println(ca[i]);
			i++;
		}
		*/			
		return ca;
	
	}
	
	public static void jumble(char[] ca) {
		int length = ca.length;
		char[] newKey = KEY.substring(0, length).toCharArray(); //generates a key the same length as the letters in the message
		//String newKeyString = newKey.toString(); //newKey as String
		
		
		
		
		char[] abc = ALPHABET.toCharArray();
		
		
		
		int x = 0;
		while(x < ca.length) {
			//System.out.println(ca.length);
			//System.out.println(ca);
			//System.out.println(newKey.length);
			//System.out.println(newKey);
			
			
			int y = 0;
			while(abc[y] != ca[x]) {
				
				
				//System.out.println("CA[X] = " + ca[x]);
				//System.out.println("ABC[Y] = " + abc[y]);
				//System.out.println("X = " + x);
				//System.out.println("Y = " + y);
				y++;
			}
				
			

			System.out.println("The position of " + ca[x] + " in the alphabet is " + y + ". If the alphabet starts from 0.");
			//The code above figures out the position of the chars in the alphabet
			System.out.println(" ");
			System.out.println("X = " + x + " Y = " + y);
			System.out.println("newKey[x] = " + newKey[x]);
			int newKeyNum = Character.getNumericValue(newKey[x]);
			System.out.println("newKeyNum = " + newKeyNum);
			
			int locationNewChar = y + newKeyNum;
			
			if((locationNewChar) >=26) {
				  locationNewChar = locationNewChar - 26;
			}
			
			char newChar = abc[locationNewChar];
			
			
			
			System.out.println(newChar);
			
			
			
			
			x++;	
			tokenized = tokenized + newChar;
				
				
		
		}
		
		
		System.out.println("Tokenized value of " + "'" + toTokenize + "'" + " is " + tokenized + ".");
		
		int z = 0;
		String newKeyString = "";
		while(z < newKey.length) {
			newKeyString = newKeyString + Character.getNumericValue(newKey[z]);
			z++;
		}
		System.out.println("The key used to tokenize is " + newKeyString + ".");
			
	
	}
	
	
	public static void deJumble(char[] toDeJumble) {
		char[] abc = ALPHABET.toCharArray();
		
		int length = toDeJumble.length;
		char[] newKey = KEY.substring(0, length).toCharArray(); //generates a key the same length as the letters in the message
		

		
		
		
		
		
		int x = 0;
		while(x < toDeJumble.length) {
			//System.out.println(ca.length);
			//System.out.println(ca);
			//System.out.println(newKey.length);
			//System.out.println(newKey);
			
			
			int y = 0;
			System.out.println(abc[y]);
			System.out.println(toDeJumble[x]);
			while(abc[y] != toDeJumble[x]) {
				
				
				//System.out.println("CA[X] = " + ca[x]);
				//System.out.println("ABC[Y] = " + abc[y]);
				//System.out.println("X = " + x);
				//System.out.println("Y = " + y);
				y++;
			}
				
			

			System.out.println("The position of " + toDeJumble[x] + " in the alphabet is " + y + ". If the alphabet starts from 0.");
			//The code above figures out the position of the chars in the alphabet
			System.out.println(" ");
			System.out.println("X = " + x + " Y = " + y);
			System.out.println("newKey[x] = " + newKey[x]);
			int newKeyNum = Character.getNumericValue(newKey[x]);
			System.out.println("newKeyNum = " + newKeyNum);
			
			int locationNewChar = y - newKeyNum;
			
			if((locationNewChar) < 0) {
				  locationNewChar = locationNewChar + 26;
			}
			
			char newChar = abc[locationNewChar];
			
			
			
			System.out.println(newChar);
			
			
			
			
			x++;	
			deTokenized = deTokenized + newChar;
				
				
		
		}
		
		
		System.out.println("De-Tokenized value of " + "'" + toDeTokenize + "'" + " is " + deTokenized + ".");
		
		int z = 0;
		String newKeyString = "";
		while(z < newKey.length) {
			newKeyString = newKeyString + Character.getNumericValue(newKey[z]);
			z++;
		}
		System.out.println("The key used to De-Tokenize is " + newKeyString + ".");
			
		
		
		
		
		
		
		
		
		
				
		
	}
		
}


