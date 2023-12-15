import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter from range");
		int r1=sc.nextInt():
		System.out.println("Enter to range");
		int r2=sc.nextInt():
		int rem=0,rev=0,x1=0;
		for(int x=r1; x<=r2; x++)
		{
			rev=0;
			x1=x;
			while(x>0)
			{
				rem=x%10;
				rev=rev*10+rem;
				x/=10;
			}
			if(rev==x1)
				System.out.println("Palindrome");
			else
				System.out.println("Not Palindrome");
		}
	}
}