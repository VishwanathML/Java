import java.util.Scanner;

/**
	 * Program to Check whether the given number is Palindrome or not
	 */
public class CheckPalindromeNum {

	static int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number to find Palindrome:");
		num = s.nextInt();
		boolean bval= palindromeCheck(num);
		if (bval)
		{
			System.out.println("Palindrome:");
		}
		else
		{
			System.out.println("Not Palindrome:");
		}
		
		System.out.println("Enter the max limit to Genarate Palindrome:");
		num = s.nextInt();
		for (int i =0; i <num; i++)
		{
			bval= palindromeCheck(i);
			if (bval)
			{
				System.out.println("Palindrome:"+i);
			}
		}
	}
	
	public static boolean palindromeCheck(int val)
	{
		int num2,rem,tempNum;
		//String temp = new String();
		num2=val;
		tempNum =0;
		do
		{
			rem= num2%10;
			num2 =Math.round(num2/10);
			tempNum= (tempNum*10)+rem;
			
		}while(num2!=0);
		
		if (val==tempNum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
