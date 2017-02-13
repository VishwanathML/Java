
public class InitCap {

	public static void main(String[] args) {
		char[] cArray ;
		
		for (int i=0; i<args.length; i++)
		{
			cArray = args[i].toLowerCase().toCharArray();
			cArray[0]=Character.toUpperCase(cArray[0]);
			String newString="";
			for(int j=0;j<cArray.length;j++)
			{
				char c = cArray[j];
				newString = newString + c;
			}
			System.out.println(newString);
		}

	}

}
