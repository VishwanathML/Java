import java.util.Scanner;


public class GenPrimeNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Limit to get Prime Numers");
		int num = s.nextInt();
		boolean b=true;
		for (int i =1; i<=num; i++){
			b=true;
			for (int j=2;j<=i/2;j++)
			{
				if(i%j == 0)
					b=false;
			}
			if (b)
				System.out.println(i);
		}
		

	}

}
