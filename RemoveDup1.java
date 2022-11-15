package assignment4;

import java.util.Scanner;

public class RemoveDup1 {
   
	 static String removeDup(char ch[],int n)
	{
		String s2="";
		for(int i=0;i<n;i++)
		{
		   if(ch[i]!='0')
		   {
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j])
				{
				  count++;
				  ch[j]='0';
				}
				
			}
			if(count>=1)
			    s2+=ch[i];
			
		  }
		}
		return s2;
	}
	public static void main(String[] args) {
		
		String inp="ineuron is the best online learning platform.";
		char[] ch=inp.toCharArray();
		String s2=removeDup(ch,ch.length);
		System.out.print(s2);
		

	}

}
