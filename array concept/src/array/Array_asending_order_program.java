package array;

public class Array_asending_order_program 
{
public static void main(String[] args) 
{
	int  array[]={10,50,40,60,30,80,90,};
	for (int i=0;i<array.length;i++)
	{
	for (int j=i+1;j<array.length;j++) 
	{
		int temp=0;
		if (array[i] > array[j]) // condition for ascending  and descending  order
		{
			temp=array[i];     // swiping  of data
			array[i]=array[j];
			array[j]=temp;
		}
	}
	System.out.println(array[i]);
	}
}
}
