
	/**
	 * Name Loop
	 */
public class NameLoop {

	public static void main(String[] args) {
		//char[] cArray ;
		
		//int strPoint,loopLen;
		
		for (int i=0; i<args.length; i++)
		{
			//cArray = args[i].toLowerCase().toCharArray();
			
			String newString="";
			for(int j=0;j<args[i].length()+1;j++)
			{
				newString = args[i].substring(j, args[i].length())+""+args[i].substring(0, j) ;
				System.out.println(newString);
			}
			//System.out.println(newString);
		}


	}

}
