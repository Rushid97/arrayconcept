package rushi;



public class Arrey 
{
public static void main(String[] args) 
{
	 int [] a= {1,2,3,4};
	 int b = a[0];
	 int c = a[3];
	 int sum = b + c;
	 System.out.println(sum);
	 
	 int res1=0;
	 for (int i=0;i<a.length;i++) {
		  res1 = res1 + a[i];
	 }
	 System.out.println(res1);
}
}

