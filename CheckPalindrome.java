import java.util.Scanner;


public class CheckPalindrome {
	static String str= new String();
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		boolean b;
		System.out.println("Enter the Text to find Palindrome:");
		str = s.next();
		b=checkPal(str);
		if (b)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Sentence to find Palindrome words");
		String[] sent = s1.nextLine().split("\\s+");
		for (int c=0; c<sent.length; c++)
		{
			if (checkPal(sent[c]))
			System.out.println( sent[c]);
		}
	}
	public static boolean checkPal(String inStr) {
		char[] cArray =  inStr.toCharArray();
		int last;
		last= cArray.length -1;
		//System.out.println(""+last);
		for (int i=0; i<cArray.length; i++ )
		{
			if (i>(last-i))
			{
				break;
			}
			
			if (cArray[i] != cArray[last-i])
			{
				return false;
			}
		}
		return true;
	}

}
