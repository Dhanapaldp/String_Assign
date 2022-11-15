package assignment4;

public class PrintDuplic {
    
	static String findDup(char ch[],int n)
	{
		String s2="";
		boolean repeat=false;
		for(int i=0;i<n;i++)
		{
	        int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j] && ch[i]!='0')
				{
				  count++;
				  ch[j]='0';
				}
			}
			if(count>1)
			{
				s2+=ch[i];
			}
		}
			
		return s2;
		
	}
	public static void main(String[] args) {
		String inp="this program is used to print duplicate characters in the string";
		char[] ch=inp.toCharArray();
		String s2=findDup(ch,ch.length);
		System.out.print(s2);

	}

}
