package assignment4;

public class LaunchPalindrome {

	public static void main(String[] args) {
		
		// If the input as a String type.
		String value="2552";
		String s2="";
		for(int i=value.length()-1;i>=0;i--)
		{
			s2+=value.charAt(i);
		}
		if(value.equals(s2))
		{
			System.out.println("Given string "+value+" is palindrome");
		}
		else
		{
			System.out.println("Given string "+value+" is not palindrome");
		}
		
   /*
		// If the input as a Integer type
		int var=2552;
		int temp=var;
		int res=0;
		while(temp>0)
		{
			res=res*10;
			res+=temp%10;
			temp=temp/10;
		}
		if(res==var)
		{
			System.out.println("Given "+var+" is palindrome");
		}
		else
		{
			System.out.println("Given "+var+" is not palindrome");
		}	                              
		                               */

	}

}
