package rushi;

public class String 
{

	public static int  display(int num)
	{
		num/=2;
		return num--;
	}
		public static void main(String[] args) {
			int bill=100,amt=50;
			for (int a=10;a<amt;a+=10)
				bill+=10;
			amt=display(bill);
			System.out.println(amt);
		}
	
}

