import java.util.Scanner;

public class LineComparison2 {
	public static void main (String args[])
	{
		System.out.println("Welcome to Line Computation Comparison program");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int x=(a-c)*(a-c);
		int y=(b-d)*(b-d);
		double z=Math.sqrt(x+y);
		System.out.println("The length of the Line is "+z);
	}
}