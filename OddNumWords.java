public class OddNumWords {

	/**
	 * This Java program is to print only odd repated words.
	 * 
	 */
	public static void main(String[] args) {
		//this is the string used to find is leter is;
		String[] tstStringArray = {"abcdddd","abcdddd","abc","abc","abc","de","abc","de","abc","de","de"}; //The in put words
		String[] myStringArray = new String[tstStringArray.length]; //Array to store only once if the word is repeated.

		int chrCount = 0,chrPos =-1,insPos=0;
		int[] myIntArray = new int[tstStringArray.length]; //Array to store the number of repeatationa.

		for (int i=0; i< tstStringArray.length;i++)
		{

			chrCount=0;
			chrPos =-1;
			for (int j=0;j<myStringArray.length;j++)
			{
				if (tstStringArray[i] == myStringArray[j])
				{
					chrCount=1;
					chrPos=j;
					break;
				}
			}
			
			if (chrCount == 1)
			{
				myIntArray[chrPos] = myIntArray[chrPos]+1;
			}
			else
			{
				myStringArray[insPos] = tstStringArray[i];
				myIntArray[insPos] = 1;
				insPos=insPos+1;
			}
			
		}
		for (int k =0; k<myStringArray.length;k++)
		{
			if ((myIntArray[k]%2) != 0)
			{
				System.out.println(myStringArray[k]+" -->" +myIntArray[k]);
			}
		}
		//System.out.println("Bye");

	}

}
