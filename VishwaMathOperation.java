import java.util.Scanner;
//import java.io.*;

class VishwaMathOperation {
	//public static String c;
	public static int num1,num2,a,b,c;
	public static void main(String args[]){
		VishwaMathOperation v_test = new VishwaMathOperation();
		Scanner s = new Scanner(System.in);
		do
		{
			//a1=0;
			System.out.println("Enetr First number: ");
			String val1 = s.next();
			System.out.println("Enetr Secound number: ");
			String val2 = s.next();
			a=0;
			b=0;
			try{
				a=Integer.parseInt(val1);
				b=Integer.parseInt(val2);
				break;
			}
			catch(Exception e){
				System.out.println("Enter valid number");
				//a1=1;
			}
		} while (true);
		//int a=s.nextInt();
		System.out.println("Enter\n 1 -> Addition\n 2 -> Subtraction \n 3 -> Multiplication \n 4 -> Division \nPress any other value to exit.");
		String val1 = s.next();
		//c=s.next();
		try{
			c=Integer.parseInt(val1);
		}
		catch (Exception e){
			c=0;
		}
		//c=Integer.parseInt(val1);
		System.out.println("=================================");
		switch(c)
		{
			case 1: v_test.adding(a,b); break;
			case 2: v_test.diff(a,b); break;
			case 3: v_test.prod(a,b); break;
			case 4: v_test.div(a,b); break;
			default: System.out.println("No Operations Selected.\nExit");
		}
		System.out.println("=================================");
	}
	public void adding(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
		System.out.println("Sum of "+this.num1+" and "+this.num2+" is " +(this.num1+this.num2));

	}
	public void diff(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
		System.out.println("Subtraction of "+this.num2+" from "+this.num1+" is " +(this.num1-this.num2));

	}

	public void prod(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
		System.out.println("Product of "+this.num1+" and "+this.num2+" is " +(this.num1*this.num2));

	}
	public void div(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
		if (this.num2 == 0)
		{
			System.out.println("Divide by zero error");
		}
		else{
			System.out.println("Divid "+this.num1+" by "+this.num1+" is " +(this.num1/this.num2));
		}

	}
}

