import java.util.Scanner;
public class center
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word1 = kb.next();
		System.out.println("Please enter a word: ");
		String word2 = kb.next();
		System.out.println("Please enter a word: ");
		String word3 = kb.next();
		System.out.println(makeCenter(word1));
		System.out.println(makeCenter(word2));
		System.out.println(makeCenter(word3));
	}
	
	public static String makeCenter(String word)
	{
		if(word.length() >= 20)
			return word;
		else
			return makeCenter(" " + word + " ");
	}
}