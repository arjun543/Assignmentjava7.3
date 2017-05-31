
public class SubStringClass {

	
	public static void main(String args[])
	{
		String s1="arjun";
		String s2="arj";
		int count=0;
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{count=0;
					for(int k=i,l=0;k<i+s2.length();k++,l++)
					{
						if(s1.charAt(k)==s2.charAt(l))
						{
							System.out.println(s1.charAt(k)+" --"+s2.charAt(l));
							count=count+1;
						}
						
					}
					if(count==3)
					{
						System.out.println("found");
						break;
					}
				}
				
			}
		}
		
	
	}
}
