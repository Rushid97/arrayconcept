package rushi;

public class Basic_program
{
	int a =200;
	int b=30;
 private   Basic_program(int i, int j)
	{
		a=i;
		b=j;
	}
	public void  addition ()
	{
	
		System.out.println((a+b));
	} 
	public static void main(String[] args)
	{
		Basic_program l =new Basic_program (20,30);
		l.addition();
	}
}
