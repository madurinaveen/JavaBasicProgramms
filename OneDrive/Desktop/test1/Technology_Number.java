import java.util.*;
class Technology_Number
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int temp=num,num1=0,num2=0,sum=0,sqr=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		num=temp;
		System.out.println("No. Of Digits in "+num+"are"+count);
		num1=num/2;
		num2=num/2;
		System.out.println("num1 is "+num1);
		System.out.println("num2 is "+num2);
		sum=num1+num2;
		sqr=(int)Math.pow(sum,2);
		if(temp==sqr)
			System.out.println("Technology Number");
		else
			System.out.println("Not Technology Number");
	}
}