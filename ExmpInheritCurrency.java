/* Super Class of Currency*/

class Currency {

	public Currency(double value, String country, String currency){
		System.out.println(country+"'s Currency is " +currency +" with values to $ is :"+value);
	
	}
	public double converter(){
		double val=0;
		val=Rupee.rupeeValue+(Rupee.rupeeValue*(Dollar.dolValue - Pound.pouValue));
		return val;
	}
	
}

class Rupee extends Currency{
	static double rupeeValue= 66.93;
	static String country = "India";
	static String currency = "Rupee";
	public Rupee(){
	
		super(rupeeValue,country,currency);

	}

}

class Dollar extends Currency{
	static double dolValue= 1;
	static String country = "US";
	static String currency = "Doller";
	public Dollar(){
	
		super(dolValue,country,currency);

	}

}

class Pound extends Currency{
	static double pouValue= 0.8;
	static String country = "UK";
	static String currency = "Pund";
	public Pound(){
	
		super(pouValue,country,currency);

	}

}

public class ExmpInheritCurrency {
	public static void main(String argsp[])
	{
		Rupee r = new Rupee();
		Pound p = new Pound();
		System.out.println("Convert: "+r.converter());
	}
}
